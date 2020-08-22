import java.util.*;
public class CreateSwitch {
public static void main(String[] args) {
	//first object
	Switch switchobj1 = new Switch(1, 2, 3, "test", true);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter voltage: ");
	switchobj1.voltage = scan.nextInt();
	
	
	System.out.println("Enter amperes: ");
	switchobj1.ampere = scan.nextInt();
	
	System.out.println("Enter resistance: ");
	switchobj1.resistance = scan.nextInt();
	
//	System.out.println("Enter status: ");
//	switchobj1.status = (String) scan.nextLine();
	
	System.out.println("Enter action: ");
	switchobj1.action = scan.nextBoolean();
	
	//second object 
	Switch switchobj2 = new Switch(1, 2, 3, "test", true);
	
	//third object
	Switch switchobj3 = new Switch(1, 2, 3, "test", true);
	
	//fourth
	Switch switchobj4 = new Switch(1, 2, 3, "test obj4", true);
	
	//fifth
	Switch switchobj5 = new Switch(switchobj1.voltage, switchobj1.ampere,switchobj1.resistance, "test", switchobj1.action);
	
	
	switchobj2.charge();
	switchobj3.on();
	switchobj4.off();
	
	switchobj4.on();
	switchobj5.on();
	
	
}
}
