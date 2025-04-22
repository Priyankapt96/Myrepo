package stringExample;

public class Bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("hello");
		System.out.println(a);
		StringBuilder b=new StringBuilder("world");
		System.out.println(b);
		//append - adding a string at last of another string
		System.out.println(a.append("Java"));
		
		//insert - based on index it gets added
		System.out.println(a.insert(4, "iii"));
		
		//replace
		System.out.println(a.replace(0, 0, "Aaa"));
		//reverse
		System.out.println(a.reverse());
		//delete
		System.out.println(a.delete(0, 3));
		System.out.println(b.delete(0, 0));
	}

}
