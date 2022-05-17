package com.timeaxis.domain;

import java.util.Date;

/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 * 群组事件实体
 */
public class GroupEvent {
    private Integer eventId;
    private String headLine;
    private Date startTime;
    private Date endTime;
    private String event_content;

    public GroupEvent() {
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEvent_content() {
        return event_content;
    }

    public void setEvent_content(String event_content) {
        this.event_content = event_content;
    }

    @Override
    public String toString() {
        return "GroupEvent{" +
                "eventId=" + eventId +
                ", headLine='" + headLine + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", event_content='" + event_content + '\'' +
                '}';
    }
}
