package javaTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;


public class linkedList {

	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		LinkedList<String> singlyLinkedList = new LinkedList<>(Arrays.asList("beans", "oats", "avocados", "broccoli","","",""));
		LinkedList<String> singlyLinkedList1 = new LinkedList<>(Arrays.asList("apple", "orange", "mango"));
		singlyLinkedList.removeLast();
		singlyLinkedList.removeLast();
		singlyLinkedList.removeLast();		
		System.out.println("after removing null: " + singlyLinkedList);
		singlyLinkedList.addAll(singlyLinkedList1);
		System.out.println("after merging both list: " + singlyLinkedList);
		System.out.println("before sorting: " + singlyLinkedList);
		singlyLinkedList.sort(Comparator.reverseOrder());
		System.out.println("after sorting reverse: " + singlyLinkedList);	
		singlyLinkedList.sort(Comparator.naturalOrder());
		System.out.println("after sorting natural: " + singlyLinkedList);
		singlyLinkedList.sort(new Comparator<String>() { @Override public int compare(String s1, String s2) { return s1.length() - s2.length(); } } );
		System.out.println("after length sorting: " + singlyLinkedList);
		
		singlyLinkedList.add(2, "grape");
		System.out.println("after adding grape: " + singlyLinkedList);
		
		
		
		
		

	}

}
