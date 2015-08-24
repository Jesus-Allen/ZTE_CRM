package com.qdgs.bean;
/**
 * ·şÎñÇëÇó
 * @author gqy
 *
 */
public class ServiceRequest {
	 private int id;
	   private String kind;
	   private String solve;
	   private int uid;
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequest(int id, String kind, String solve, int uid) {
		super();
		this.id = id;
		this.kind = kind;
		this.solve = solve;
		this.uid = uid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSolve() {
		return solve;
	}
	public void setSolve(String solve) {
		this.solve = solve;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
}
