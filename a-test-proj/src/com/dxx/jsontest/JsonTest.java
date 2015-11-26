package com.dxx.jsontest;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonTest {

	public static void main(String[] args){
		String sql = "afafasfasfs";
    	sql = sql.replaceAll("\\$1", "kk");
    	System.out.println("sql = " + sql);
		
		
		List<Long> ls = new ArrayList<Long>(2);
//		ls.add(0L);
//		ls.add(1L);
		System.out.println("ls[0]"+ls.size());
		
		int a = 3;
		if(a>2){
			System.out.println("2");
		}else if (a>1) {
			System.out.println("1");
		}
    	JSONObject params = new JSONObject();
    	JSONObject columnObj = new JSONObject();
    	JSONArray columnArray = new JSONArray();
    	List<String> measures = new ArrayList<>();
    	measures.add("维度一");measures.add("维度二");
    	for (String measure : measures) {
			columnObj.put("id", 1);
			columnObj.put("name", measure);
			columnObj.put("type", 105);
			columnObj.put("orderby", -1);
			columnArray.add(columnObj);
			columnObj = new JSONObject();
		}
    	params.put("column", columnArray);
    	params.put("filter", new String[0]);
    	params.put("limit", "100");
    	params.put("projectId", 1);
    	params.put("cType", 1);
    	
    	System.out.println("array0 = " + JSONArray.toJSONString(columnArray));
    	System.out.println("array = " + JSONArray.toJSONString(columnArray, SerializerFeature.DisableCircularReferenceDetect));
    	System.out.println("json = " + JSONObject.parse(JSONObject.toJSONString(params, SerializerFeature.DisableCircularReferenceDetect)));
    	System.out.println("json2 = " + JSONObject.toJSONString(params, SerializerFeature.DisableCircularReferenceDetect));
	}
}
