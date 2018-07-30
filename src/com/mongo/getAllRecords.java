package com.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class getAllRecords {
	public static void main(String[] args) {
MongoClient client=new MongoClient("localhost", 27018);
		
		DB db=client.getDB("exil");
		
		DBCollection collection=db.getCollection("emp");
		
		DBCursor cursor=collection.find();
		while(cursor.hasNext()){
			DBObject myobj=cursor.next();
			System.out.println(myobj.get("empid"));
			System.out.println(myobj.get("empname"));
			System.out.println(myobj.get("empsal"));
			System.out.println("--------------------------------------------------------");
		}
	}
}
