package com.mengdi.dto;

import java.io.Serializable;
import java.util.List;

public class Pager<T> implements Serializable {
	
	private static final long serialVersionUID = 232700608910685837L;

	private int currentPage;  //当前页数
	
	private int pageSize;   //每页显示记录数
	
	private int totalRecord;  //总记录数
	
	private int totalPage;   //总页数
	
	List<T> dataList;   //数据集合

	public Pager() {}

	public Pager(int currentPage, int pageSize, int totalRecord, int totalPage, List<T> dataList) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.dataList = dataList;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Page [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totalRecord=" + totalRecord
				+ ", totalPage=" + totalPage + ", dataList=" + dataList + "]";
	}

	
}
