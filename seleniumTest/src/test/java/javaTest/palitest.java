package javaTest;

import java.util.HashMap;

public class palitest {
	
	public static void main(String[] args) {
		
		String str = "vinin";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		int len = str.length();
		int newlen = len/2;
		int val = 0;
		if(len%2 == 0) {
			System.out.println("cannot convert to palindrome");
		}
		
		char[] first = new char[newlen];
		char[] second = new char[newlen];
		int j = 0;
		char c;
		char p=' ';
		for(int i=0;i<len;i++) {
			
			c = str.charAt(i);
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
				
			}else {
				val = hm.get(c) + 1;
				hm.put(c, val);
				if(val%2 == 0) {
					first[j]= c;
					second[j]= c;
					j++;
				}
			}
			
		}
		
		for (Character i : hm.keySet()) {
		      System.out.println("key: " + i + " value: " + hm.get(i));
		      if(hm.get(i)==1) {
		    	  p=i;
		      }
		    	  
		    }
		
		String pali = new String(first)+Character.toString(p)+new String(second);
		
		System.out.println(pali);
		
	}

}
