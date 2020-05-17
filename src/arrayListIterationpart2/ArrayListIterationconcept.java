package arrayListIterationpart2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterationconcept {

	public static void main(String[] args) {

		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("game of throwns");
		tvseries.add("braking bad");
		tvseries.add("the big bang theory");
		tvseries.add("the walkiing dead");
		tvseries.add("prision break");

		// 1. USING FOR EACH LOOP AND LAMBDA EXPRESSION
		System.out.println("USING FOR EACH LOOP AND LAMBDA EXPRESSION");

		tvseries.forEach(show -> {
			System.out.println(show);
		});

		// 2. using Iterator
		System.out.println("########### using Iterator ###########");

		Iterator<String> it = tvseries.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}

		// 3.using Iterator and java 8 foreachremaining method
		System.out.println("########### Iterator and java 8 foreachremaining method ###########");
		it = tvseries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4.USING SIMPLE FOR EACH LOOP
		System.out.println("########### USING SIMPLE FOR EACH LOOP ###########");
		for (String show : tvseries) {
			System.out.println(show);
		}

		// 5.USING FOR LOOP WITH ORDER/INDEX
		System.out.println("########### USING FOR LOOP WITH ORDER/INDEX ###########");
		for (int i = 0; i < tvseries.size(); i++) {
			System.out.println(tvseries.get(i));
		}

		// 6.USING A LIST ITERATOR() TO TRAVERSE IN BOTH THE DIRECTION
		System.out.println("########### USING A LIST ITERATOR() TO TRAVERSE IN BOTH THE DIRECTION ###########");
		ListIterator<String> tvserieslistiterator = tvseries.listIterator(tvseries.size());
		while (tvserieslistiterator.hasPrevious()) {
			String show = tvserieslistiterator.previous();
			System.out.println(show);
		}
	}

}
