package com.mongo;

import java.io.IOException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class getImages {
	public static void main(String[] args) throws IOException {
		MongoClient client=new MongoClient("localhost", 27018);
		DB db=client.getDB("exil");
		
		
		String path="/Users/akshay.ms/Desktop/getimage";
		GridFS gfs=new GridFS(db, "myimages");
		List<GridFSDBFile> list=gfs.find(new BasicDBObject());
		
		for(GridFSDBFile file:list){
			file.writeTo(path+file.getFilename());
		}
		System.out.println("restored");
		client.close();
	}
}
