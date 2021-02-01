package javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student(888,"second",22));
		ls.add(new Student(666,"first",21));
		ls.add(new Student(555,"third",25));
		ls.add(new Student(777,"fifth",24));
		ls.add(new Student(999,"forth",22));
		ls.add(new Student(222,"sixth",21));
		
		 Collections.sort(ls,(p1,p2)->{  
		        return p1.age - p2.age; 
		 }); 
		 
		 for(Student s:ls) {
			 System.out.println(s.rollno+","+s.name+","+s.age);
		 }
		 
		 
		 Stream<Student> fd = ls.stream().filter(p->(p.rollno>555));
		 
		 fd.forEach(a->{
			 System.out.println(a.rollno);
		 });
		 
		
	}
}


class Student{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age){
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
