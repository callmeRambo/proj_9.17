package Dao.Interface;

import entity.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user1,User user2);
    public void addFriend(User user1,User user2);
    public void deleteFriend(User user1,User user2);
    public List<User> showAllFriends(User user);
    public List<User> findFriends();
}
