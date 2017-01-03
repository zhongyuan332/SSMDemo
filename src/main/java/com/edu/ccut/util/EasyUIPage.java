package com.edu.ccut.util;

import java.util.List;
import java.util.Map;

public class EasyUIPage {
	private List rows;
	private long total;
	private int page;
	private Map footer;

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Map getFooter() {
		return footer;
	}

	public void setFooter(Map footer) {
		this.footer = footer;
	}
	public EasyUIPage(){
		
	}
}
