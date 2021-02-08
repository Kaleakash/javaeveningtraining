package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> listOfProduct = new ArrayList<>();
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("TV");
		p1.setPrice(55000);
		
		Product p2 = new Product(101, "Computer", 45000);
		
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(new Product(102, "Mobile", 34000));
		listOfProduct.add(new Product(103, "Pen", 140));
		
		System.out.println("Number of product are "+listOfProduct.size());
		
		Product pp = listOfProduct.get(3);
		System.out.println(pp.getPid()+" "+pp.getPname()+" "+pp.getPrice());
		
		listOfProduct.remove(0);
		
		System.out.println("Number of product are "+listOfProduct.size());
		
	//	ListIterator li = listOfProduct.listIterator();
		ListIterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			/*
			 * Object obj= li.next(); System.out.println(obj); Product p = (Product)obj;
			 * System.out.println(p.getPid());
			 */
			Product p = li.next();
			System.out.println(p.getPid());
		}
	}

}
