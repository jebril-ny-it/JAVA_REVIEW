package arrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	//VERY IMPORTANT
	public static void main(String[] args) {

		ArrayList<String> tvseries = new ArrayList<String>();

		tvseries.add("game of thrones");
		tvseries.add("breaking bad");
		tvseries.add("The Big BangTheory");
		tvseries.add("The Walking dead");
		tvseries.add("Prision break");

		System.out.println("--PRINT USING JAVA 1.8 WITH FOR EACH LOOP AND LAMBDA EXPRESSION --");
		// 1.aUSING JAVA 1.8 WITH FOR EACH LOOP AND LAMBDA EXPRESSION:
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("------- PRINT USING ITERATOR -----");

		// 2.using iterator
		Iterator<String> it = tvseries.iterator();

		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		System.out.println("------- PRINT USING ITERATOR AND JAVA 1.8 LAMBDA FOR EACH REMAINING() METHOD -----");
		// 3.USING ITERATOR AND JAVA 1.8 FOR EACH REMAINING() METHOD
		it = tvseries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		System.out.println("------- PRINT USING FOR EACH LOOP -----");

		// 4.USING FOR EACH LOOP:
		for (String show : tvseries) {
			System.out.println(show);
		}

		System.out.println("------- USING FOR LOOP WITH ORDER/INDEX -----");
		// 5.USING FOR LOOP WITH ORDER/INDEX
		for (int i = 0; i < tvseries.size(); i++) {
			System.out.println(tvseries.get(i));
		}

		System.out.println("------- USING A LIST ITERATOR() TO TRAVERSE BACKWAREDS -----");
		// 6. USING A LIST ITERATOR() TO TRAVERSE BACKWAREDS
		ListIterator<String> tvseriesiterator = tvseries.listIterator(tvseries.size());
		while (tvseriesiterator.hasPrevious()) {
		String show = 	tvseriesiterator.previous();
		System.out.println(show);
		
		}
	}

}
