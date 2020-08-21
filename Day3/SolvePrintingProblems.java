import java.util.*;
public class SolvePrinting {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("String 1: ");
	String string1 = scan.nextLine();
	
	System.out.println("String 2: ");
	String string2 = scan.nextLine();
	
	String substring1front = string1.substring(0,2);
	String substring2front = string2.substring(0,2);
	
	
	String substring1back = string1.substring(string1.length()-2);
	String substring2back = string2.substring(string2.length()-2);
	String a = replaceChar(string1,substring2front,substring2back);
	System.out.println("String 1: "+a);
	
	String b = replaceChar(string2,substring1front,substring1back);
	System.out.println("String 2: "+b);

}
public String replaceChar(String string1,String string2, char ch, int index) {
	char charAt0 = string2.charAt(string2.length()-1);
	char charAt1 = string2.charAt(string2.length()-2);
    StringBuilder myString = new StringBuilder(string1);
    myString.setCharAt(0, charAt0);
    myString.setCharAt(1, charAt1);
    return myString.toString();
}

public static String replaceChar(String string1, String substring2front,String substring2back ) {
    return substring2back + string1.substring(2, string1.length()-2) + substring2front;
}

}
