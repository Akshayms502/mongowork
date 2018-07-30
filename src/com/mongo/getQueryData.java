package com.mongo;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class getQueryData {
	public static void main(String[] args) {
		MongoClient client=new MongoClient("localhost", 27018);
		DB db=client.getDB("exil");
		
		DBCollection collection=db.getCollection("emp");
		
		DBObject queryCondition=new BasicDBObject("empid","200");
		DBObject sortcondition=new BasicDBObject("empname",-1);
		
		Map<String, Integer> map=new HashMap<>();
		map.put("empid", 1);
		map.put("empname", 1);
		
		DBObject projection=new BasicDBObject(map);
		
		DBCursor cursor=collection.find(queryCondition,projection).sort(sortcondition).limit(2);
		while(cursor.hasNext()){
			DBObject myobj=cursor.next();
			System.out.println(myobj);
		}
		
	}
}
