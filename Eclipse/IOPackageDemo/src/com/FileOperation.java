package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperation {
	public static void main(String[] args) throws Exception{
	/*DataInputStream dis = new DataInputStream(System.in);
	FileOutputStream fos = new FileOutputStream("info.txt");
	System.out.println("Enter the data");
	int ch;
	while((ch=dis.read()) != '@') {
		fos.write(ch);
	}
	fos.close();*/
		
	// Store primitive data in file 
	/*FileOutputStream fos = new FileOutputStream("emp.txt");
	DataOutputStream dos = new DataOutputStream(fos);
	dos.writeInt(100);
	dos.writeUTF("Ramesh");
	dos.writeFloat(12000);
	System.out.println("Emp info stored in file");*/
		/*
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);*/
	}
}
