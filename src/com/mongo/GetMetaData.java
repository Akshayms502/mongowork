package com.mongo;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;


public class GetMetaData {
	public static void main(String[] args) {
		MongoClient client=new MongoClient("localhost", 27018);
		
		for(String dbname:client.getDatabaseNames()){
			System.out.println(dbname);
			DB db=client.getDB(dbname);
			
			for(String collection:db.getCollectionNames()){
				System.out.println("collections"+" "+collection);
			}
		}
		
		
		
	}
}
