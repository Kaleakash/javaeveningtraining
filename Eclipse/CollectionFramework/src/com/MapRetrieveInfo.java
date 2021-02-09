package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRetrieveInfo {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Ravi");
		hm.put(101, "Ramesh");
		hm.put(102, "Ajay");
		System.out.println(hm);
		Set<Entry<Integer, String>>	ss	= hm.entrySet();
		Iterator<Entry<Integer, String>> li	= ss.iterator();
		while(li.hasNext()) {
			//System.out.println(li.next());
			Map.Entry<Integer, String> en = li.next();
			System.out.println(en.getKey()+"----"+en.getValue());
		}
	}
}
