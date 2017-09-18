package com.unsw.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FriendApply {
    private int friendApplyId;

    @Id
    @Column(name = "friendApply_id", nullable = false)
    public int getFriendApplyId() {
        return friendApplyId;
    }

    public void setFriendApplyId(int friendApplyId) {
        this.friendApplyId = friendApplyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FriendApply that = (FriendApply) o;

        if (friendApplyId != that.friendApplyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return friendApplyId;
    }
}
