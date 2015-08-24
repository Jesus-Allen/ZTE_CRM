package com.qdgs.bean;

import java.io.Serializable;

public class Question implements Serializable{
   private Integer id;
   private String title;
   private String times="0"; 
   private String publishTime;
   private String content;
   public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(Integer id, String title, String times, String publishTime,
		String content) {
	super();
	this.id = id;
	this.title = title;
	this.times = times;
	this.publishTime = publishTime;

}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getTimes() {
	return times;
}
public void setTimes(String times) {
	this.times = times;
}
public String getPublishTime() {
	return publishTime;
}
public void setPublishTime(String publishTime) {
	this.publishTime = publishTime;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "Question [id=" + id + ", title=" + title + ", times=" + times
			+ ", publishTime=" + publishTime + ", content=" + content + "]";
}

}
