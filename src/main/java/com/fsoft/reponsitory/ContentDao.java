package com.fsoft.reponsitory;

import java.util.List;

public interface ContentDao {
	public List<Object[]> getListContent(int pageNumber, int pageSize);
}
