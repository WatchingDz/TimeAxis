package com.timeaxis.mapper;

import com.timeaxis.domain.PersonalEvent;

import java.util.List;

/**
 * @author Watching
 * * @date 2022/5/16
 * * Describe:
 */
public interface PersonalEventMapper {
    //查询所有个人事件
    public List<PersonalEvent> findAllPersonalEvent();
    //添加新的个人事件
    public void savePersonalEvent(PersonalEvent event);
}
