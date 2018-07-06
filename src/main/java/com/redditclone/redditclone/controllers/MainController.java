package com.redditclone.redditclone.controllers;

import com.redditclone.redditclone.models.Post;
import com.redditclone.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  PostService postService;

  @GetMapping("")
  public String showMainPage(Model model) {
    model.addAttribute("posts", postService.showAllPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmitPage(Model model) {
    model.addAttribute("newPost", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(@ModelAttribute Post post) {
    postService.submitPost(post);
    return "redirect:";
  }

  @GetMapping("/upvote/{id}")
  public String upVotePost(@PathVariable(value = "id")Long id) {
    postService.modifyLike(id, 1);
    return "redirect:/";
  }

  @GetMapping("/downvote/{id}")
  public String downVotePost(@PathVariable(value = "id")Long id) {
    postService.modifyLike(id, -1);
    return "redirect:/";
  }

  @GetMapping("/post/{id}")
  public String showPost(@PathVariable(value = "id")long id, Model model) {
   model.addAttribute("post", postService.findOneById(id));
    return "post";
  }
}
