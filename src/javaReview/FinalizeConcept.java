package javaReview;

public class FinalizeConcept {

	//finalize is a method used for cleaning up
	//automatically will cleanup processing on the objects
	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
	}

	public void finalize() {
		System.out.println("inside finalize");
		System.out.println("used for clean up processing before the garbage collector processing ");
	}
}
