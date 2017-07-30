package com.iluwatar.lambda;
/**
 * LRU缓存
 * @author duanmenghua
 *
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class LRUCache {
	
	private static Integer cacheSize = 5;
	
	static LinkedHashMap<Integer, String> cache = new LinkedHashMap<Integer, String>(cacheSize, 0.75f, true) {		
		private static final long serialVersionUID = 4389287907499075284L;
		 protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
			 
			 	if (size()>cacheSize) {
			 		System.out.println(cache.keySet());
			 		System.out.println("to remove key: "+ eldest.getKey()+ " value: "+eldest.getValue());
					return true;
				}
			 
		        return false;
		    }
		
	};
	
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			if (cache.size()>=cacheSize) {
				Integer key = cache.keySet().stream().findFirst().get();
				System.out.println("get value: key: "+ key+" value: "+cache.get(key));
			}
			
			int nextKey = new Random(System.nanoTime()).nextInt(10);
			String value = "test";
			cache.put(nextKey, value);
			System.out.println("put value: key: "+ nextKey+" value: "+value);
			System.out.println(cache.keySet());
			Thread.sleep(2000);
			
		}
	}
	
}
