package com.timeaxis.service;

import com.timeaxis.domain.PersonalEvent;

/**
 * @author Watching
 * * @date 2022/5/16
 * * Describe:
 */
public interface PersonalEventService {
    //添加新的个人事件
    public void savePersonalEvent(PersonalEvent event);
    //查询所有个人事件
    public void findAllPersonalEvent();
}
