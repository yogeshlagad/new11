package p1;

import java.util.Scanner;

public class uppercase {

	public static void main(String[] args) {
	String str;
	String ptr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		str=sc.next();
		System.out.println("Lower case string :"+str);
		ptr=str.toUpperCase();
		System.out.println("Upeer case string :"+ptr);
	}

}
