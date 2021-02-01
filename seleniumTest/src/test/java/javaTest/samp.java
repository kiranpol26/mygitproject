package javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Interval> list = new ArrayList<Interval>();
		
		list.add(new Interval(1,4));
		list.add(new Interval(7,9));
		list.add(new Interval(3,6));
		list.add(new Interval(9,10));
		
		List<Interval> list1 = new ArrayList<Interval>();
		
		Collections.sort(list,(i1,i2)->{
			return i1.start - i2.start;
		});
		 System.out.println("Original List");
		 for(Interval s:list) {
			
			 System.out.println(s.start+","+s.end);
		 }
		 int j;
		 for(j=0;j<=list.size()-2;j++) {
			 if(list.get(j).end >= list.get(j+1).start) {
				 list1.add(new Interval(list.get(j).start, list.get(j+1).end));
			 }else {
				 list1.add(list.get(j));
			 }
		 }
		 
		 list1.add(list.get(j));
		 System.out.println("Merged List");
		 for(Interval s1:list1) {
			 
			 System.out.println(s1.start+","+s1.end);
		 }
	}

}

class Interval{
	int start;
	int end;
	
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
}