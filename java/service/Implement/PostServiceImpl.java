package service.Implement;

import Dao.Interface.PostDao;
import entity.Post;
import entity.User;
import service.Interface.PostService;

import java.util.List;

public class PostServiceImpl implements PostService{
    private PostDao postDao;

    public void insertPost(Post post) {
        postDao.insertPost(post);
    }

    public List<Post> showFriendsPosts(User user) {
        return postDao.showFriendsPosts(user);
    }

    public List<Post> showMyPosts(User user) {
        return postDao.showMyPosts(user);
    }

    public List<Post> showAllUserPosts() {
        return postDao.showAllUsersPosts();
    }

    public void likePost(Post post) {
        postDao.likePost(post);
    }
}
