package com.redditclone.redditclone.services;

import com.redditclone.redditclone.models.Post;
import com.redditclone.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  PostRepository postRepository;


  @Override
  public Iterable<Post> showAllPosts() {
    return postRepository.findAll();
  }

  @Override
  public void submitPost(String title, String url) {
    postRepository.save(new Post(title, url));
  }
}
