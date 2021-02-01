package javaTest;

public class dist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 = "my name is adam";
		String input2 = "a";
		
		int frst=0;
		int lst=0;
		int i=0;
		int j=0;
		int len = input1.length();
		for(i=0;i<len;i++) {
			if(Character.toString(input1.charAt(i)).equals(input2)) {
				frst = i;
				break;
			}
		}
		
		for(j=len-1;j>=0;j--) {
			if(Character.toString(input1.charAt(j)).equals(input2)) {
				lst = j;
				break;
			}
		}
		
		System.out.println(lst-frst);
		

	}

}
