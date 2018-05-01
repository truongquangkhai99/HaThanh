package com.fsoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsoft.reponsitory.ContentDao;

@Service
@Transactional
public class ContentServiceImpl implements ContentService {
	@Autowired
	private ContentDao contentDao;

	@Override
	public List<Object[]> getListContent(int pageNumber, int pageSize) {
		return contentDao.getListContent(pageNumber, pageSize);
	}

}
