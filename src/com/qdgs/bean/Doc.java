package com.qdgs.bean;

import java.io.Serializable;

public class Doc implements Serializable{
  private String docId;
  private String docName;
  private String docKind;
public Doc() {
	super();
	// TODO Auto-generated constructor stub
}
public Doc(String docId, String docName, String docKind) {
	super();
	this.docId = docId;
	this.docName = docName;
	this.docKind = docKind;
}
public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getDocKind() {
	return docKind;
}
public void setDocKind(String docKind) {
	this.docKind = docKind;
}
}
