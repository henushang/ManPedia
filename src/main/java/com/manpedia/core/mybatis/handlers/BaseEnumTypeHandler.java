/**
 * 
 * ============================================================================
 * 声明：© 2013-2014 天才纵横版权所有
 * ----------------------------------------------------------------------------
 * Official Website: http://www.grandgeniusgroup.com
 * ----------------------------------------------------------------------------
 * Copyright: © 2013 grandgeniusgroup All Rights Reserved.
 * ----------------------------------------------------------------------------
 * @version: 1.0
 * ----------------------------------------------------------------------------
 * @author: Architect.bian
 * ----------------------------------------------------------------------------
 * Create at: 2012-8-19 上午8:43:31
 * ============================================================================
 */
package com.manpedia.core.mybatis.handlers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manpedia.global.utility.StrUtil;
import com.manpedia.web.base.eentity.EStatus;
import com.manpedia.web.front.user.eentity.EGender;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Architect.bian
 * 
 */
@MappedTypes(value = { EStatus.class, EGender.class})
public class BaseEnumTypeHandler<E extends Enum<E>> extends BaseTypeHandler<E> {

	private static Logger log = LoggerFactory.getLogger(BaseEnumTypeHandler.class);
	
	private Class<E> type;
	
	public BaseEnumTypeHandler() {}

	public BaseEnumTypeHandler(Class<E> type) {
		this.type = type;
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
		if (jdbcType == null) {
			ps.setString(i, parameter.toString());
		} else {
			ps.setObject(i, parameter.name(), jdbcType.TYPE_CODE);
		}
	}

	@Override
	public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return getEnum(rs.getString(columnName));
	}

	@Override
	public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return getEnum(rs.getString(columnIndex));
	}

	@Override
	public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return getEnum(cs.getString(columnIndex));
	}

	@SuppressWarnings("unchecked")
	private E getEnum(String s) {
		Method method = null;
		E result = null;
		// Method[] ms = type.getMethods();
		// for (Method m : ms) {
		// if (m.getName() == "get") {
		// method = m;
		// }
		// }
		if (s == null) {
			return null;
		}
		try {
			method = type.getMethod("get", int.class);
			if (StrUtil.isNumeric(s)) {
				result = (E) method.invoke(type, Integer.parseInt(s));
			} else {
				result = Enum.valueOf(type, s);
			}
		} catch (SecurityException e) {
			logException(e);
		} catch (IllegalAccessException e) {
			logException(e);
		} catch (IllegalArgumentException e) {
			logException(e);
		} catch (InvocationTargetException e) {
			logException(e);
		} catch (NoSuchMethodException e) {
			result = Enum.valueOf(type, s);
			logException(e);
		}
		return result;
	}

	/**
	 * @param e
	 */
	protected void logException(Exception e) {
		e.printStackTrace();
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		log.error(sw.toString());
	}
}
