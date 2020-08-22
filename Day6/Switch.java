import java.util.*;

public class Switch {
// only properties + behaviors + constructor
//	Scanner scan = new Scanner(System.in);
//	System.out.println();

	// 5 properties of class Switch
//	int v = 5;
//	int a = 17;
//	String status = "closed circuit";
//	int r = 33;
//	boolean action = true;
	int voltage, ampere, resistance;
	String status;
	boolean action;

	// 3 methods = 3 behaviors
	public void charge() {
		System.out.println("charging");
	}

	public void off() {
		System.out.println("open circuit");
	}

	public void on() {
		System.out.println("Your circuit is turned "+status);
		System.out.println("You have executed action: "+action);
	}

	public Switch(int v, int a, int r, String s, boolean act) {
		// TODO Auto-generated method stub
		voltage = v;
		ampere = a;
		resistance = r;
		status = (String) s;
		action = act;

	}

}
