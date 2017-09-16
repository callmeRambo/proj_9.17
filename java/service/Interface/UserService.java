package service.Interface;

import entity.User;

import java.util.List;

public interface UserService {
    public void insertUser(User user);
    public void addFriend(User user1,User user2);
    public void deleteFriend(User user1,User user2);
    public List<User> showAllFriends(User user);
    public List<User> findFriends();
}
