package arrayListIterationpart2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterationagain {

	public static void main(String[] args) {

		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("game of throwns");
		tvseries.add("braking bad");
		tvseries.add("the big bang theory");
		tvseries.add("the walkiing dead");
		tvseries.add("prision break");

		// 1. USING FOR EACH LOOP AND LAMBDA EXPRESSION
		System.out.println("USING FOR EACH LOOP AND LAMBDA EXPRESSION");
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});
		// 2. using Iterator
		System.out.println("########### using Iterator ###########");
		Iterator<String> it = tvseries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// 3.using Iterator and java 8 foreachremaining method
		System.out.println("########### Iterator and java 8 foreachremaining method ###########");
		it = tvseries.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});

		// 4.USING SIMPLE FOR EACH LOOP
		System.out.println("########### USING SIMPLE FOR EACH LOOP ###########");
		for (String shows : tvseries) {
			System.out.println(shows);

		}

		// 5.USING FOR LOOP WITH ORDER/INDEX
		System.out.println("########### USING FOR LOOP WITH ORDER/INDEX ###########");

		for(int i = 0; i<tvseries.size();i++) {
			System.out.println(tvseries.get(i));
		}
		
	}

}
