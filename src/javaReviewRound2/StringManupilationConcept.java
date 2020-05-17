package javaReviewRound2;

public class StringManupilationConcept {

	public static void main(String[] args) {

		String str = "The rains have started here";
		String str1 = "The rains havE started here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf('s'));

		System.out.println(str.indexOf('s', str.indexOf('s') + 1));

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("hello"));// -1 not avaolable

		//STRING COMPARISON
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//SUBSTRING:
		System.out.println(str.substring(0, 9));
		
		//TRIM
		//before space
		//after space
		String s = "	hello world	";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		//replace
		String date = "01-01-2020";
		System.out.println(date.replace("-", "/"));
		
		//split:
		String test = "hello_world_test_selenium";
		String[] testval = test.split("_");
		for(int i = 0; i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		//reverse
		String flip = "name";
		String rev = "";
		int len = flip.length();
		for(int i =len-1; i >=0;i-- ) {
			rev = rev +flip.charAt(i);
		}
		
		System.out.println(rev);
		StringBuffer sb = new StringBuffer(flip);
		System.out.println(sb.reverse());
		
		//Concatenate
		String s2 = "care";
		System.out.println(s2.concat("s"));
		
		String x = "hello";
		String y = "world";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		
	}

}
