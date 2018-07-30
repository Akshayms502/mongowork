package com.mongo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StoreImage {
	public static void main(String[] args) throws FileNotFoundException {
		MongoClient client=new MongoClient("localhost", 27018);
		DB db=client.getDB("exil");
		
		GridFS gfs=new GridFS(db, "myimages");
		String path="/Users/akshay.ms/Desktop/images";
		File folderPath=new File(path);
		for(File file:folderPath.listFiles()){
			InputStream inputStream=new FileInputStream(file);
			GridFSInputFile picture=gfs.createFile(inputStream,file.getName());
			
			picture.setMetaData(new BasicDBObject("description","image"+file.getName()+"stored in exilant"));
			picture.save();
		}
		client.close();
		System.out.println("picture closed");
	}
}
