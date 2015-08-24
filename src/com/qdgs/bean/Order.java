package com.qdgs.bean;
/**
 * 订阅版本发布信息
 * @author gqy
 *
 */
public class Order {
private int id;
private int isOrder;
private int uid;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Order(int id, int isOrder, int uid) {
	super();
	this.id = id;
	this.isOrder = isOrder;
	this.uid = uid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getIsOrder() {
	return isOrder;
}
public void setIsOrder(int isOrder) {
	this.isOrder = isOrder;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}

}
