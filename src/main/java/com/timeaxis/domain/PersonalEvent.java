package com.timeaxis.domain;

import java.util.Date;

/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 */
public class PersonalEvent {
    private Integer eventId;
    private String headLine;
    private Date startTime;
    private String eventContent;

    public PersonalEvent() {
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

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    @Override
    public String toString() {
        return "PersonalEvent{" +
                "eventId=" + eventId +
                ", headLine='" + headLine + '\'' +
                ", startTime=" + startTime +
                ", eventContent='" + eventContent + '\'' +
                '}';
    }
}
