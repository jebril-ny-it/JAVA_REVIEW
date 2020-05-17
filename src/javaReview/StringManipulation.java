package javaReview;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "THE RAINS HAVE STARTED HERE SELENIUM";
		String str1 = "THE RAINS hAVE STARTED HERE SELENIUM";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf('S'));

		System.out.println(str.indexOf('S', str.indexOf('S') + 1));

		// HOMEWORK COMPLETED
		System.out.println(str.indexOf('S', str.indexOf('S' + 1, str.indexOf('S') + 1)));

		System.out.println(str.indexOf("HAVE"));

		// IF INDEX IS NOT AVAILABLE IT WILL RETURN -1
		System.out.println(str.indexOf("hello"));

		// STRING COMPARISON RETURN A BOOLEAN
		System.out.println(str.equals(str1));

		// IGNORE CASE
		System.out.println(str.equalsIgnoreCase(str1));

		// SUB STRING
		System.out.println(str.substring(0, 8));

		// TRIM
		String s = "	HELLO WORLD		";
		// System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		System.out.println(s.trim().replace(" ", ""));

		// replace method
		String date = "01-01-2020";// 01/01/2020
		System.out.println(date.replace("-", "/"));

		// split method
		String test = "HELLO_WORLD_TEST_SELENIUM";
		String testval[] = test.split("_");
		for (int i = 0; i < testval.length; i++) {
			System.out.println(testval[i]);
		}

		// concatanate method
		String s2 = "care";
		System.out.println(s2.concat("s"));

		String x = "hello";
		String y = "world";
		int a = 100;
		int b = 200;
		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));

		// REVERSE A STRING

		String name = "name";
		int len = name.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println(rev);
	}

}
