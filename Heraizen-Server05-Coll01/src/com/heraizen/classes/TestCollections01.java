package com.heraizen.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections01 {

	//Collections Level 1
	
	//1
	public static void showElements(List<String> list) {
		if(list.size()>0) {
			for(String e : list){
				System.out.println(e);
			}
		}
		else {
			System.out.println("List is empty");
		}	
	}
	
	//3
	public static Map<Integer, Integer> getMap(Integer numbers[]){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i : numbers) {
			Integer cube = (int)Math.pow(i, 3);
			if(map.containsKey(i)) {
				map.put(map.get(i), cube);
			}
			else {
				map.put(i, cube);
			}
		}
		return map;
	}
	
	
	//2
	public static String[] getResults(String[] names) {
		Set<String> set = new TreeSet<String>();
		for(String name : names) {
			set.add(name);
		}
		List<String> list = new ArrayList<String>();
		for(String name : set) {
			list.add(name);
		}
		Collections.reverse(list);
		String[] orderNames = new String[list.size()];
		int k = 0;
		for(String name : list) {
			orderNames[k] = name;
			k++;
		}
		return orderNames;
	}
	
	//4
	public static Set<String> checkName(Set<String> set, String name){
		String toRemove="";
		boolean notFound=false;
		//can be done using iterator also
		for(String n : set) {
			if(n.equals(name)) {
				toRemove = n;
				break;
			}
			else {
				notFound=true;
			}
		}
		if(notFound) {
			System.out.println("Name not found");
		}
		else {
			set.remove(toRemove);
		}
		return set;
	}
	
	//5
	public static void viewElements(Map<Integer, String> map){
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		/*
		 * 4
		Set<String> set = new TreeSet<String>(Arrays.asList("ramu", "somu", "bhimu", "gomu"));
		String name = "himu";
		Set<String> result = checkName(set, name);
		System.out.println(result);
		*/
		
		
		/*
		 * 2
		String[] result = getResults(new String[] {"hello", "WORLD", "how", "are", "YOU", "doing"});
		System.out.println(Arrays.toString(result));
		*/
		
		
		/*
		 * 3
		System.out.println(getMap(new Integer[] {1,2,3}));
		*/
		
		
		
		/*
		 * 1
		List<String> str = new ArrayList<String>(Arrays.asList("hello", "world"));
		showElements(str);
		*/
		
	}

}
