package stringExample;

public class Stringmaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		System.out.println(s);
		String p = new String ("Welcome");
		System.out.println(p);
		char a[]= {'a','b','c','d'};
		String n=new String(a);
		System.out.println(a);
		//length - size of string
		int var =s.length();
		System.out.println(var);
		//Concatenation 
		System.out.println(s.concat(p));
		//to UpperCase
		System.out.println(s.toUpperCase());
		//to lowerCase
		System.out.println(p.toLowerCase());
		System.out.println(s.toLowerCase());
		
		String arr="java";
		String arr2="java";
		String arr3="Java";
		String arr4="Selenium";
		//equals
		System.out.println(arr.equals(arr2));
		System.out.println(arr.equals(arr4));
		System.out.println(arr2.equals(arr3));
		//equals ignore case (ignore case)
		System.out.println(arr.equalsIgnoreCase(arr3));
		//is empty
		System.out.println(arr.isEmpty());
		String arr5 ="";
		System.out.println(arr5.isEmpty());
		//contains check the character or words in same case
		String arr6 = " Hi Welcome ";
		System.out.println(arr6.contains("Hi"));
		System.out.println(arr6.contains("g"));
		// value of - typecasting
		int arr7=10;
		String arr8 = String.valueOf(arr7);
		String arr9 = "";
		System.out.println(arr9.valueOf(arr7));
		System.out.println(arr8);
		
		String arr10 =new String("java");
		System.out.println(arr10);
		//== 
		System.out.println(arr==arr2);
		System.out.println(arr==arr10);//for new keyword check by reference happens not checking by value
		}

}
