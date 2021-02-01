package javaTest;

public class javaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = "xyz";
		
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
		
		StringBuilder sb = new StringBuilder(s3);
		sb.reverse();
		System.out.println(sb.toString());
		
		String s4 = "kiran";
		Boolean pali = true;
		for(int i=0; i<s4.length()/2;i++) {
			
			if(s4.charAt(i)!=s4.charAt(s4.length()-i-1)){
				pali = false;
				break;
				
			}
			
		}
		
		if(pali==true) System.out.println("string is a palindrome");
		else System.out.println("String is not a palindrome");
		
		
		String str = "fefdkf";
		
		System.out.println(str.replaceAll(Character.toString('f'), ""));
		
		String nam = "My Name Is kiran";
		
		CharSequence ch = nam.subSequence(11, 16);
		
		String a = "def";
		String b = "abc";
		String c = "ghi";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.equals(b));
		
		
		
		
	}

}
