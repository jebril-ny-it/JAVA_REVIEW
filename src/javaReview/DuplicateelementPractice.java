package javaReview;

public class DuplicateelementPractice {

	public static void main(String[] args) {

	
		String names[] = {"sara","jebril","mohammad","jebril","kifah","assaf"};
		
		for(int i = 0;i<names.length;i++) {
			for(int j = i+1;j<names.length;j++) {
				if (names[i].equals(names[j])) {
					System.out.println("i found the duplicate name  "+ names[i]);
				}
			}
		}
		System.out.println("##############################3");
		
		
		String name[] = {"PNT","Selenium","JAva","python","ruby","c#","javascript","PNT","Selenium",};
		
		for(int i =0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if (name[i].equals(name[j])) {
					System.out.println("This is the duplicate  "+name[i]);
				}
			}
		}
		
		}

	

}
