package com.fsoft.services;

import java.util.List;

public interface ContentService {
	public List<Object[]> getListContent(int pageNumber, int pageSize);
}
