package service.Interface;

import entity.Post;
import entity.User;

import java.util.List;

public interface PostService {
    public void insertPost(Post post);
    public List<Post> showFriendsPosts(User user);
    public List<Post> showMyPosts(User user);
    public List<Post> showAllUserPosts();
    public void likePost(Post post);
}
