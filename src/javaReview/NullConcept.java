package javaReview;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {

		//1.null is a key word case sensitive
		
		//2.default ref value will a;ways be null 	
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);
//		
		
		//3.Not allowed 
		//CANNOT CONVERT FROM A NON PREMITIVE CLASS TO A DATA TYPE
		//Integer i = null;
		//int j =i;
		
		
		//4.instance of operator
		Integer i = null;
		Integer j = 10;
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);
	
		//5.static vs non static
		NullConcept obj = null;
	//	obj.sendMail(); will throw an acception
		
		//sum is static...its stored in a free memory
		//it does not hold the memory in the object
		//static is a common memory
		
		obj.sum();
		
		//6. == and !=
		System.out.println(null == null);
		System.out.println(null != null);
		
		//7.default value of string
		//null can be appended but can not be accessed
		String str = null;
		Integer i1 = null;
		Double d = null;
		
		String s1 = (String)null;
		System.out.println(s1);
		
	}

	
	public static void sum() {
		System.out.println("sum....");
	}
	
	public void sendMail() {
		System.out.println("send....");
	}
	
	
	
	
	
}
