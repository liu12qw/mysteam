package com.akkafun.common.event.dao;

import com.akkafun.common.dao.AbstractRepository;
import com.akkafun.common.event.constant.EventProcessStatus;

/**
 * Created by liubin on 2016/3/29.
 */
public interface EventProcessRepositoryCustom extends AbstractRepository{

    int updateStatusToProcessed(Long eventProcessId);
}