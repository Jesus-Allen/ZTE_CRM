package com.qdgs.serviceimpl;

import com.qdgs.dao.LifePeriodDao;
import com.qdgs.service.LifePeriodService;

public class LifePeriodServiceImpl implements LifePeriodService{
	private LifePeriodDao lifePeriodDao;

	public LifePeriodDao getLifePeriodDao() {
		return lifePeriodDao;
	}

	public void setLifePeriodDao(LifePeriodDao lifePeriodDao) {
		this.lifePeriodDao = lifePeriodDao;
	}
}
