package com.manpedia.web.base.dao;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author henushang
 *
 * @param <T>
 */
public interface BaseDao<T> {
	
	/**
	 * 通过ID查询数据库，返回对象
	 * @param id 对应数据库中uid
	 * @return
	 */
	T get(String id);
	
	/**
	 * 将键值对作为参数查询数据库返回一个对象
	 * @param map
	 * @return
	 */
	T getOne(Map<String, Object> map);
	
	/**
	 * 
	 * 描述：获取符合条件的数据的数目
	 * 创建时间：2014-4-13 下午11:08:56
	 * @param map
	 * @return
	 */
	int getCount(Map<String, Object> map);
	
	/**
	 * 将键值对作为参数查询数据库返回一组对象
	 * @param map
	 * @return
	 */
	List<T> getList(Map<String, Object> map);
	
	/**
	 * 将对象插入数据库
	 * @param t
	 */
	void insert(T t);
	
	/**
	 * 更新对象所有的属性
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 针对性的更新某几个字段
	 * @param map
	 */
	void updateFields(Map<String, Object> map);
	
	/**
	 * 增量某几个字段
	 * @param map
	 */
	void increase(Map<String, Object> map);
	
	/**
	 * 删除操作
	 * @param id
	 */
	void delete(String id);
	
	/**
	 * 批量删除
	 * @param map
	 */
	void deleteByMap(Map<String, Object> map);
}
