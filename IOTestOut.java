// package Lab1;

import java.util.Scanner;
public class IOTestOut {

public static void main(String[]args)  {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter length");
	String l = input.next();
	System.out.println("Enter width");
	String w = input.next();
	int len = Integer.parseInt(l.trim());
	int wid = Integer.parseInt(w.trim());
	Rectangle r = new Rectangle(len, wid);
	// Lab1.Rectangle r = new Lab1.Rectangle(len, wid);
	System.out.println(r.getArea());
}
}