package com.qdgs.serviceimpl;

import com.qdgs.dao.VersionPublishDao;
import com.qdgs.service.VersionPublishService;

public class VersionPublishServiceImpl implements VersionPublishService{
private VersionPublishDao versionPublishDao;

public VersionPublishDao getVersionPublishDao() {
	return versionPublishDao;
}

public void setVersionPublishDao(VersionPublishDao versionPublishDao) {
	this.versionPublishDao = versionPublishDao;
}
}
