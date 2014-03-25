package runningMedian;

import java.util.*;

public class HelloWorld {

	public static List<Long> lngDate = new ArrayList<Long>();

	public static void main(String[] args) { // main
		//testing();
		//System.out.print(5^6);
		//Pi();
		Pii();
		print_numbers();
	}

	// 0 1 2 3 4 5
	public static void print_numbers() { // print out what's in the long array
		for (int i = 0; i < lngDate.size(); i++) {
			System.out.println(lngDate.get(i));
		}
		
	}

	public static void runningMedian(long ii) {
		lngDate.add(ii);
		Collections.sort(lngDate);
		System.out.print("size: ");
		System.out.print(lngDate.size());
		System.out.print(" ");
		if (lngDate.size() == 1) {
			print_numbers();
			return;
		} else if (lngDate.size() % 2 == 1) {
			System.out.print(lngDate.get((lngDate.size() - 1) / 2));
			return;
		} else if (lngDate.size() % 2 == 0) {
			System.out
					.print((float) (lngDate.get((lngDate.size()) / 2 - 1) + lngDate
							.get((lngDate.size()) / 2)) / 2);
			return;

		}
		
	}
	
	public static void testing(){
		for (long i = 0; i <= 1000893; i++) {
			System.out.print("i: ");
			System.out.print(i);
			System.out.print(" ");
			runningMedian(i);
			System.out.println();
		}
	}
	
	public static void Pi(){
		for (long i = 0; i < 1003; i++) {
			runningMedian(i ^ (2*i));
			System.out.println();
		}
	}
	
	public static void Pii(){
		for (long i = 0; i < 1000893; i++) {
			runningMedian((long)((i%1000)/(Math.sin(i))));
			System.out.println();
		}
	}
	
	
}
