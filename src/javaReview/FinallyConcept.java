package javaReview;

public class FinallyConcept {
	//finally is a block
	// finally is used with try catch block
	// will always be executed
	// weather there is an exception thrown or not

	public static void main(String[] args) {
		// test1();
		//test2();
		division();

	}

	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally");
		}
	}

	public static void test2() {
		try {
			System.out.println("inside test 2");
		} finally {
			System.out.println("finally code in test 2 method");
		}
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		}
		catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		} 
		finally {
			System.out.println("execute this code even after any exception");
		}
	}

}
