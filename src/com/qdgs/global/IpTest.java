package com.qdgs.global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IpTest {
public static boolean isConnected(){
	  boolean isConnect=false;
	  Runtime runtime = Runtime.getRuntime(); // ��ȡ��ǰ��������н�����
	  Process process = null; // �������������
	  String line = null; // ��������Ϣ
	  InputStream is = null; // ������
	  InputStreamReader isr = null; // �ֽ���
	  BufferedReader br = null;
	  String ip = "www.baidu.com";
	  boolean res = false;// ���
	  try {
	   process = runtime.exec("ping " + ip); // PING
	   is = process.getInputStream(); // ʵ����������
	   isr = new InputStreamReader(is);// ��������ת�����ֽ���
	   br = new BufferedReader(isr);// ���ֽ��ж�ȡ�ı�
	   while ((line = br.readLine()) != null) {
	    if (line.contains("TTL")) {
	     res = true;
	     break;
	    }
	   }
	   is.close();
	   isr.close();
	   br.close();
	   if (res) {
		   isConnect=true;
	   } else {
	    
	   }
	  } catch (IOException e) {
	   System.out.println(e);
	   runtime.exit(1);
	  }
	  return isConnect;
}
}
