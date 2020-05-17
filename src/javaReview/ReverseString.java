package javaReview;

public class ReverseString {

	public static void main(String[] args) {

		// REVERSE A STRING
		// DIFF BETWEEN STRING AND STRING BUFFER
		// DO WE HAVE A REVERSE FUNCTION IS STRING..NOO
		// WE HAVE REVERSE FUNCTION IN STRINGBUFFER CLASS
		// STRING IS IMMUTABLE
		// STRINGBUFFER IS MUTUABLE

		String s = "selenium";

		// 1.using for loop
		int len = s.length();// 8
		System.out.println(len);
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);// mui
		}
		System.out.println(rev);

		System.out.println("########## PRACTICE ######");
		String a = "apple";
		int length = a.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse);

		// MORNING practice
		System.out.println("########## PRACTICE ######");
		// MORNING practice
		String m = "NAME";
		int l = m.length();
		String r = "";

		for (int i = l - 1; i >= 0; i--) {
			r = r + m.charAt(i);
		}
		System.out.println(r);

		// using StringBuffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

		// MORNING practice
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

		// MORNING practice
		StringBuffer stringBuffer = new StringBuffer(s);
		System.out.println(stringBuffer.reverse());

		// EVENING PRACTICE
		System.out.println("######### EVENING PRctiuce #########");

		String name = "eman";
		int namelen = name.length();
		String revname = "";

		for (int i = namelen -1; i >= 0; i--) {
			revname = revname + name.charAt(i);
		}

		System.out.println(revname);

	}
}
