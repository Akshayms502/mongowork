package com.mongo;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class getOneRecord {

	public static void main(String[] args) {
		MongoClient client=new MongoClient("localhost", 27018);
		
		DB db=client.getDB("exil");
		
		DBCollection collection=db.getCollection("emp");
		
		DBObject myobj=collection.findOne();
		System.out.println(myobj.get("empid"));
		System.out.println(myobj.get("empname"));
		System.out.println(myobj.get("empsal"));

	}

}
