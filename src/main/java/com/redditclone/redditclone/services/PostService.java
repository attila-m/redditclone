package com.redditclone.redditclone.services;


import com.redditclone.redditclone.models.Post;

public interface PostService {

  Iterable<Post> showAllPosts();
  void submitPost(Post post);
}
