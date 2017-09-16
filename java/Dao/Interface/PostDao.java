package Dao.Interface;

import entity.Post;
import entity.User;

import java.util.List;

public interface PostDao {
    public void insertPost(Post post);
    public List<Post> showMyPosts(User user);
    public List<Post> showFriendsPosts(User user);
    public List<Post> showAllUsersPosts();
    public void likePost(Post post);
}
