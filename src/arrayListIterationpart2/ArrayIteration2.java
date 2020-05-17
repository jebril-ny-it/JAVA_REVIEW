package arrayListIterationpart2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration2 {

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

	}
}
