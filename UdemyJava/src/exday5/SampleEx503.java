package exday5;

import java.util.ArrayList;
public class SampleEx503 {

	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("ONE");
		sl.add("TWO");
		sl.add("THREE");
		for(String s: sl) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		ArrayList<Integer> il = new ArrayList<Integer>();
		il.add(1);
		il.add(2);
		il.add(3);
		for(Integer i: il) {
			System.out.print(i + " ");
		}
	}

}
