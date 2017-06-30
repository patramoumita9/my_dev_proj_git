package com.java.dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofAPhoneNumber {

	public static void main(String[] args) {
		LetterCombinationsofAPhoneNumber n = new LetterCombinationsofAPhoneNumber();
		String digits = "23";
		System.out.println(n.letterCombinations(digits));
	}
	
	 public List<String> letterCombinations(String digits) {
	        Map<String, String> map = new HashMap<>();
			
			map.put("2", "abc");
			map.put("3", "def");
			map.put("4", "ghi");
			map.put("5", "jkl");
			map.put("6", "mno");
			map.put("7", "pqrs");
			map.put("8", "tuv");
			map.put("9", "wxyz");
			List<Character> strings = new ArrayList<>();
			for(int k=0; k<digits.length(); k++) {
				strings.add(digits.charAt(k));
			}
			List<String> list = new ArrayList<>();
			int count = 0;
			boolean check = false;
			if(digits.equals("")) {
				return list;
			}else if(digits.length()==1){
				String str = map.get(digits);
				List<String> listOfStr = new ArrayList<>();
				for(int i = 0; i<str.length(); i++)
					listOfStr.add(str.charAt(i)+"");
				return listOfStr;
			}
			else {
			List<String> list1 = printNumbers(map, strings, list, count, check);
			return list1;
			}
			//return list1;
	    }
	    private static List<String> printNumbers(Map<String, String> map, List<Character> strings, List<String> list, int count, boolean check) {
				String str = map.get(strings.get(count).toString());
				String str2 = map.get(strings.get(count+1).toString());
				if(!check) {
				for(int j=0; j<str.length(); j++) {
					for(int k=0; k<str2.length(); k++) {
				list.add(str.charAt(j)+""+str2.charAt(k));
					}
				}
				check = true;
		}
				else {
				int num=0;
				int size = list.size();
					for(int j=0; j<size; j++) {
						for(int k=0; k<str2.length(); k++,num++) {
							list.add(num, list.get(num)+""+str2.charAt(k));
						}
						list.remove(num);
					}
				}
				count++;
				if(count < strings.size() - 1) {
					printNumbers(map, strings, list, count, check);
				}
			return list;
		}
}
