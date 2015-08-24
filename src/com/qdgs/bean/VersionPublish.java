package com.qdgs.bean;

import java.io.Serializable;

public class VersionPublish implements Serializable{
	
	private int id;
	private String topic;
	private String content;
	private String data;
	public VersionPublish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VersionPublish(int id, String topic, String content, String data) {
		super();
		this.id = id;
		this.topic = topic;
		this.content = content;
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "VersionPublish [id=" + id + ", topic=" + topic + ", content="
				+ content + ", data=" + data + "]";
	}
}
