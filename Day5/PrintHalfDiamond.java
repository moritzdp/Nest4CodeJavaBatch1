import java.util.Scanner;

// Java code to demonstrate star patterns 
public class PrintHalfDiamond {
	// Function to demonstrate printing pattern
	public static void printStars(int n) {
		int i, j;

		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {
			for (j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for (i = 1; i < n; i++) {
			for (j = i; j < n; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	// Driver Function
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// .in is read from console
		System.out.print("Number 1: ");

		int n = scan.nextInt();
//		int n = 5; 
		printStars(n);
	}
}
