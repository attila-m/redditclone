package com.redditclone.redditclone.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  String url;
  int likes;
  String text;

  public Post() {
  }

  public Post(String title, String url, String text) {
    this.title = title;
    this.url = url;
    this.likes = 0;
    this.text = text;
  }

  public Post(String title, String url, int likes, String text) {
    this.title = title;
    this.url = url;
    this.likes = likes;
    this.text = text;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
