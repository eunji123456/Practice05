package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			
			String in = sc.nextLine();
			
			if (in.equals("/q")) {
				System.out.println("종료 합니다. ");
				break;
			}
			
			String[] sarray = in.split(" ");

			switch (sarray[1]) {
			case "+":
				Add add = new Add();
				add.setValue(Integer.parseInt(sarray[0]), Integer.parseInt(sarray[2]));
				System.out.println(">>" + add.Calculate());
				break;
			case "/":
				Div div= new Div();
				div.setValue(Integer.parseInt(sarray[0]), Integer.parseInt(sarray[2]));
				System.out.println(">>" + div.Calculate());
				break;
			case "*":
				Mul mul= new Mul();
				mul.setValue(Integer.parseInt(sarray[0]), Integer.parseInt(sarray[2]));
				System.out.println(">>" + mul.Calculate());
				break;
			case "-":
				Sub sub= new Sub();
				sub.setValue(Integer.parseInt(sarray[0]), Integer.parseInt(sarray[2]));
				System.out.println(">>" + sub.Calculate());
				break;
			
			}
		}
		sc.close();
	}
}