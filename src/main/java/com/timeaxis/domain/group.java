package com.timeaxis.domain;

/**
 * @author Watching
 * * @date 2022/5/13
 * * Describe:
 * 群组实体
 */
public class group {
    private Integer groupId;
    private String groupName;
    private String groupOwner;

    public group() {
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupOwner() {
        return groupOwner;
    }

    public void setGroupOwner(String groupOwner) {
        this.groupOwner = groupOwner;
    }

    @Override
    public String toString() {
        return "group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupOwner='" + groupOwner + '\'' +
                '}';
    }
}
