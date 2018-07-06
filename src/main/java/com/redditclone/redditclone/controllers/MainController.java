package com.redditclone.redditclone.controllers;

import com.redditclone.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    model.addAttribute(postService.showAllPosts());
    return "index";
  }
}
