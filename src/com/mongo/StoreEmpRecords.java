package com.mongo;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;




public class StoreEmpRecords {
	public static void main(String[] args) {
		MongoClient client=new MongoClient("localhost", 27018);
		DB db=client.getDB("exil");
		
		DBCollection collection=db.getCollection("emp");
		
		DBObject object=new BasicDBObject();
		
		object.put("empid",301);
		object.put("empname", "sam");
		object.put("empsal", 200000);
		
		collection.save(object);
		
		System.out.println("object saved");
		
		
		//second way
		
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("empid", 400);
		map.put("empname", "kal");
		map.put("empsal",4000);
		
		
		collection.save(new BasicDBObject(map));
		System.out.println("2nd object saved");

		
		//3rd way
		
//		String jsonString="{empid:409,empname:raa,empsal:49999}";
//		collection.save((DBObject)JSON.parse(jsonString));
		
		
		Employee emp=new Employee();
		emp.setEmpid(405);
		emp.setEmpname("yaay");
		emp.setEmpsal(55555);
		
		collection.save(emp);
		
	}

}
