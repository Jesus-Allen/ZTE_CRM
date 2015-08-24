package com.qdgs.global;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.activation.URLDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;



public class SendMail {
public static  String TEXT="text/plain;charset=UTF-8";
public static  String HTML="text/html;charset=UTF-8";
private String host;
private String  user;
private String  pass;
private String  from;
private String   to;
private String  cc;//�����ʼ���ĳ��
private String  bc;//����
private String  subject;
private BodyPart body;
private boolean needAuth;
private List attaches;
public SendMail(){
	needAuth=true;
	attaches=new ArrayList();
}
public SendMail(String host){
	needAuth=true;
	attaches=new ArrayList();
	this.host=host;
}
public SendMail(String host,String user,String pass){
	needAuth=true;
	attaches=new ArrayList();
	this.host=host;
	this.user=user;
	this.pass=pass;
}
public void setNeedAuth(boolean needAuth){
	this.needAuth=needAuth;
}
public void setFrom(String from){
	this.from=from;
}
public void setTo(String to){
	this.to=to;
}
public String getPass(){
	return pass;
}
public String getUser(){
	return user;
}
public void setPass(String string){
	pass=string;
}
public void setUser(String string){
	user=string;
}
public String getFrom(){
	return from;
}
public String getHost(){
	return host;
}
public boolean isNeedAuth(){
	return needAuth;
}
public String getSubject(){
	return subject;
}
public void setHost(String string){
	host=string;
}
public void setBlindTo(String bc){
	this.bc=bc;
}
public void setCopyTo(String cc){
	this.cc=cc;
}
public void setSubject(String subject){
	this.subject=subject;
}


public void setBody(String string,String contentType){
	try{
		body=new MimeBodyPart();
	    DataHandler dh=new DataHandler(string,contentType);
	    body.setDataHandler(dh);
	    
	}catch(Exception e){
	}
	}


public void setBodyAsText(String string){
	
	setBody(string,TEXT);
}
public void setBodyAsHTML(String string){
	setBody(string,HTML);
}


public void setBodyFromFile(String filename){
	try{
		BodyPart mdp=new MimeBodyPart();
		FileDataSource fds=new FileDataSource(filename);
		DataHandler dh=new DataHandler(fds);
		mdp.setDataHandler(dh);
		attaches.add(mdp);
		
	}catch(Exception e){
		
	}
}



public void setBodyFromUrl(String url){
	try{
		BodyPart mdp=new MimeBodyPart();
		URLDataSource fds=new URLDataSource(new URL(url));
		DataHandler dh=new DataHandler(fds);
		mdp.setDataHandler(dh);
		attaches.add(mdp);
		
	}catch(Exception e){
		
	}
}

public void addAttachFromString(String string,String showname){
	try{
		BodyPart mdp=new MimeBodyPart();
		DataHandler dh=new DataHandler(string,TEXT);
		mdp.setFileName(MimeUtility.encodeWord(showname,"UTF-8",null));
		mdp.setDataHandler(dh);
		attaches.add(mdp);
		
	}catch(Exception e){
		
	}
}

public void addAttachFromFile(String filename,String showname){
	try{
		BodyPart mdp=new MimeBodyPart();
		FileDataSource fds=new FileDataSource(filename);
		DataHandler dh=new DataHandler(fds);
		mdp.setFileName(MimeUtility.encodeWord(showname,"UTF-8",null));
		mdp.setDataHandler(dh);
		attaches.add(mdp);
		
	}catch(Exception e){
		
	}
}

public void addAttachFromUrl(String url,String showname){
	try{
		BodyPart mdp=new MimeBodyPart();
		URLDataSource ur=new URLDataSource(new URL(url));
		DataHandler dh=new DataHandler(ur);
		mdp.setFileName(MimeUtility.encodeWord(showname,"UTF-8",null));
		mdp.setDataHandler(dh);
		attaches.add(mdp);
		
	}catch(Exception e){
		
	}
}

public void send()throws Exception{
	try{
		 
		Properties props=new Properties();
		if(host!=null && !host.trim().equals(""))
			props.put("mail.smtp.host", host);
		else
			throw new Exception("aaa");
		if(needAuth)
			props.put("mail.smtp.auth", "true");
		
		Session s=Session.getInstance(props, null);
		MimeMessage msg=new MimeMessage(s);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		if(from!=null)
			msg.addFrom(InternetAddress.parse(from));
		else
			throw new Exception("bbb");
		if(to!=null)
			msg.addRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse(to));
		else
			throw new Exception("ccc");
		if(cc!=null)
			msg.addRecipients(javax.mail.Message.RecipientType.CC, InternetAddress.parse(cc));
		
		if(bc!=null)
			msg.addRecipients(javax.mail.Message.RecipientType.BCC, InternetAddress.parse(bc));
		Multipart mm=new MimeMultipart();
		if(body!=null)
			 mm.addBodyPart(body);
		for(int i=0;i<attaches.size();i++){
			BodyPart part=(BodyPart)attaches.get(i);
			mm.addBodyPart(part);
		}
		msg.setContent(mm);
		msg.saveChanges();
		Transport transport=s.getTransport("smtp");
		transport.connect(host,user,pass);
		transport.sendMessage(msg,msg.getAllRecipients());
		transport.close();
		
	}catch(Exception e){
		//e.printStackTrace();
	throw e;
	}
}

}

