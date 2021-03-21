package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JComboBox.KeySelectionManager;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Zoe");
		
		
		// creates a map with <K,V> <String, String>
		Map<String, String> dailySpecials = new LinkedHashMap<String, String>();
		
		// adding items to the map
		dailySpecials.put("Monday", "Waffles");
		dailySpecials.put("Tuesday", "Pancakes");
		dailySpecials.put("Wednesday", "French Toast");
		dailySpecials.put("Thursday", "Liver");
		dailySpecials.put("Friday", "Sausage and Eggs");
		dailySpecials.put("Saturday", "Waffles");
		dailySpecials.put("Sunday", "Pancakes");
				
		String tuesdaySpecial = dailySpecials.get("Tuesday");		
		System.out.println("Tuesday's Speicial: " + tuesdaySpecial);
		
		dailySpecials.put("Monday", "Liver");
		
		String mondaySpecial = dailySpecials.get("Monday");
		System.out.println("Monday: " + mondaySpecial);
		
		
		System.out.println();
		System.out.println();
		System.out.println("####################");
		System.out.println("        Keys");
		System.out.println("####################");
		System.out.println();
		
		// Option 1 to get loop through all the values
		// - get the keys
		// - loop thorugh the keys
		// -- get the value for each key
		
		// the keys of a map are a set
		// we can ust the keySet function to get all keys
		Set<String> keys = dailySpecials.keySet();
		
		for(String key : keys)
		{
			String special = dailySpecials.get(key);
			System.out.println(key + " : " + special);
		}
		
		
		System.out.println();
		System.out.println();
		
		
		// option 2
		// -- loop through each ROW
		// -- get the key and value from the row
		
		List<String> names = new ArrayList<String>();
		names.add("Joe");
		
		// this is a traditional for loop
		for (int i = 0; i < names.size(); i++)
		{
			String currentName = names.get(i);
			//System.out.println(currentName);
		}
		
		// this is a for each loop
		for(String currentName : names)
		{
			//System.out.println(currentName);
		}
		
		// to loop through a map - I HAVE
		// to use a foreach loop
		// because we don't have access to the position
		for(Map.Entry<String, String> row : dailySpecials.entrySet())
		{
			System.out.println(row.getKey() + " : " + row.getValue());
		}
		
		
		// remove some objects
		dailySpecials.remove("Monday");
		
		// to append:
		// I need to get the current value
		// and append my new value
		// and then put it back in the map
		String sundaySpecial = dailySpecials.get("Sunday");
		dailySpecials.put("Sunday", sundaySpecial + " and Waffles");
		
		

		System.out.println();
		System.out.println();
		for(Map.Entry<String, String> row : dailySpecials.entrySet())
		{
			System.out.println(row.getKey() + " : " + row.getValue());
		}
		

		mondaySpecial = dailySpecials.get("Monday");
		if(mondaySpecial == null)
		{
			mondaySpecial = "unknown";
		}
		System.out.println("Monday: " + mondaySpecial);
		

	}

}
