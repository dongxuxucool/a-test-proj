package com.dxx.fileinfo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileInfoGet {

	
	public static void main(String[] args){
		File file = new java.io.File("test.txt");
		Date lastModified = new Date(file.lastModified()); //�ļ�����޸�ʱ�� 
		System.out.println(""+lastModified);
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String dataTimeStr = fmt.format(lastModified); //����ת��Ϊyyyy-MM-dd HH:mm:ss��ʽ 
		System.out.println(dataTimeStr);
	}
}
