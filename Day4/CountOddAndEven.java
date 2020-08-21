import java.util.*;

//bundle of classes, get Scanner if want
public class CountOddAndEven {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		// Scanner class with new keyword to create new
		// object scan of Scanner class
		Scanner scan = new Scanner(System.in);
		// .in is read from console
		System.out.print("Number: ");

		String num = scan.nextLine();
		// nextFloat or nextLine or nextDouble

		for (int i = 0; i < num.length(); i++) {
			// System.out.println(num.charAt(i));
			// char firstSign = num.charAt(0);
			int index = num.charAt(i);

			if (index % 2 != 0) {
				if (index == '-') {
					oddCount -= 1;
				}
				oddCount += 1;
			} else if (index % 2 == 0) {
				evenCount += 1;
			} else if (index % 2 != 0) {
				oddCount += 1;
			} else if (index % 2 == 0) {
				evenCount += 1;
			}

		}
		System.out.println("Odd digit: " + oddCount);

		System.out.println("Even digit: " + evenCount);

		// Number:23567890
		// -234569000002
		// 2468

//	Sample Input/Output 3:
//		Input:
//		Number: -234569000002
//		Output:
//		Odd digit: 3
//		Even digit: 9
	}

}
