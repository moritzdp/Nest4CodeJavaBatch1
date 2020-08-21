import java.util.*;

public class HeightWeightConvertor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter heightFeetInput: ");

		int heightFeetInput = sc.nextInt();

		System.out.print("Enter heightInchInput: ");
		int heightInchInput = sc.nextInt();
		float a = (float) heightConvertor(heightFeetInput, heightInchInput);
		System.out.print("Enter Weight in Kg: ");
		int weight = sc.nextInt();
		int b = (int) weightConvertor(weight);
		
		System.out.println("Height in cm "+a);
		System.out.println("Weight in pounds: "+ b);
	}

	static float heightConvertor(float heightFeetPart, float heightInchPart) {
		int feetToInch = 12;
		double InchToCm = 2.54;

		heightFeetPart = (float) (heightFeetPart * feetToInch * InchToCm);
		heightInchPart = (float) (heightInchPart * InchToCm);
		float heightResult = heightFeetPart + heightInchPart;
		return heightResult;

	}

	static float weightConvertor(int weight) {
		double poundsValue = 2.2;
		float weightResult = (float) (weight * poundsValue);
		return weightResult;

	}
}
