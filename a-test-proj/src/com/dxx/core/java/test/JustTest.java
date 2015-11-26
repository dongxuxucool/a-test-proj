package com.dxx.core.java.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Set;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JustTest {

	public static void main(String[] args) {
		ok:{
			System.out.println("dfas");
			if(1==1){
				break ok;
			}
		}
	StaticClass.print();
		String str = "[1,2,3]";
		JSONArray array = JSONArray.parseArray(str);
		Object[] objs = array.toArray();
		System.out.println("objs = " + objs[1]);
//		String t = "abc||efgh";
//		String[] ts = t.split("\\|\\|");
//		System.out.println("ts[0] = " + ts[1]);
//		jsonTest();
//		stringSpilt("用户数");
//		try {
//			dateFormat("2012-12-12T12:11:19.211Z");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		TestInterface testInterface = new TestInterfaceClass();
//		System.out.println("className = " + testInterface.getClass().getSimpleName());
		List<String> demo = new ArrayList<String>();
		
		demo.addAll(null);
		
		int[] a = new int[]{10,2,3};
		int[] b = new int[2];
		System.arraycopy(a, 0, b, 0, 2);
		System.out.println("b1 = " + b[0] + "  b2 =" + b[1]);
		
		String test= "ascsa";
		String[] testsplits = test.split(",");
		System.out.println("length = " + testsplits.length);
		
		System.out.println("pow = " + (int)Math.pow(4,2));
		String aString = "abc";
		System.out.println("aStringEequel = " + aString.equalsIgnoreCase("abc"));

	}

	public static void jsonTest(){
		String json = "{\"a\":\"a\",\"b\":\"1\"}";
		JSONObject object = JSONObject.parseObject(json);
		Set<Entry<String, Object>> kvs = object.entrySet();
		Iterator<Entry<String, Object>> iterator = kvs.iterator();
		while (iterator.hasNext()) {
			Entry<String, Object> kv = (Entry<String, Object>)iterator.next();
			System.out.println("k = " + kv.getKey() + "&v = " + (String)kv.getValue());
		}
	}
	
	public static void stringSpilt(String str){
		int index = str.indexOf("数");
		boolean bool = str.contains("数");
		System.out.println("bool = " + bool);
		System.out.println("index = " + index);
		String newStr = str.substring(0, index);
		System.out.println("newstr = " + newStr);
		
	}
	
	public static void dateFormat(String str) throws ParseException{
//	    SimpleDateFormat format_short = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = format.parse(str.substring(0, str.length()-5).replace("T", " "));
		System.out.println("date = " + date.getTime());
		
//		JSONObject jsonObj = new JSONObject();
//		jsonObj.put("time", str);
//		System.out.println("time = " + jsonObj.getDate("time"));
		System.out.println("now = " + format.format(new Date()));
	}
}
