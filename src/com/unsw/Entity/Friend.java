package com.unsw.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friend {
    private int friendshipId;

    @Id
    @Column(name = "friendship_id", nullable = false)
    public int getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(int friendshipId) {
        this.friendshipId = friendshipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Friend friend = (Friend) o;

        if (friendshipId != friend.friendshipId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return friendshipId;
    }
}
