package javaTest;

public class genericcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer> iobj = new Test<Integer>(15);
		System.out.println(iobj.getObj());
		
		Test<String> sobj = new Test<String>("addf");
		System.out.println(sobj.getObj());

	}

}


class Test<T>
{
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
}
