package com.manpedia.web.base.entity;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 分页类
 * @author henushang
 *
 */
public class Pager {
	
	public enum OrderType{
		asc, desc
	}
	public static final int MAX_PAGE_SIZE = 500;// 每页最大记录数限制
	private int pageNumber = 1;// 当前页码
	private int pageSize = 20;// 每页记录数
	private int totalCount = 0;// 总记录数
	private int pageCount = 0;// 总页数
	private int listSize = 0;//当前页显示的记录数，小于等于每页的记录数
	private String orderBy = "createTime";// 排序字段
	private OrderType orderType = OrderType.desc;// 排序方式

	public Pager() {}

	/**
	 * @param i
	 */
	public Pager(int size) {
		this.pageSize = size;
	}

	/**
	 * @param pageNumber2
	 * @param i
	 */
	public Pager(int num, int pageSize) {
		this(pageSize);
		this.pageNumber = num;
	}

	/**
	 * 当前页码,从1开始
	 * @return
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * 当前页码
	 * @param pageNumber
	 */
	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}

	/**
	 * 每页记录数
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 每页记录数
	 */
	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			pageSize = 1;
		} else if(pageSize > MAX_PAGE_SIZE) {
			pageSize = MAX_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}
	
	/**
	 * 总记录数
	 * @return
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * 总记录数
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 总页数
	 * @return
	 */
	public int getPageCount() {
		if (pageCount == 0) {
//			this.pageCount = DoubleMath.roundToInt(MathUtil.div(totalCount , this.pageSize), RoundingMode.CEILING);
		}
		return this.pageCount;
	}

	/**
	 * 总页数
	 * @param pageCount
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
//
//	public String getProperty() {
//		return property;
//	}
//
//	public void setProperty(String property) {
//		this.property = property;
//	}
//
//	public String getKeyword() {
//		return keyword;
//	}
//
//	public void setKeyword(String keyword) {
//		this.keyword = keyword;
//	}
	
	/**
	 * 当前页显示的记录数，小于等于每页的记录数
	 * @return
	 */
	public int getListSize() {
		return listSize;
	}

	/**
	 * 当前页显示的记录数，小于等于每页的记录数
	 * @param listSize
	 */
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
//
//	public List getList() {
//		return list;
//	}
//
//	public void setList(List list) {
//		this.list = list;
//	}

	/**
	 * @return
	 */
	public int getStartIndex() {
		if (this.pageNumber > 0) {
			return (this.pageNumber - 1) * this.pageSize;
		} else {
			return 0;
		}
	}

	/**
	 * @param list
	 */
	public void refresh(List<?> list) {
		if (list != null) {
			this.setListSize(list.size());
		}
	}

	/**
	 * @param num 第num页
	 * @param i 每页显示i条
	 * @return
	 */
	public static Pager getNewInstance(String num, int i) {
		if (StringUtils.isNumeric(num)) {
			return new Pager(Integer.valueOf(num), i);
		} else {
			return new Pager(1, i);
		}
	}
	
	public static Pager getNewInstance(Object num, int i) {
		return getNewInstance(num != null ? num.toString() : "", i);
	}

}
