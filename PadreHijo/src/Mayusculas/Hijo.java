package Mayusculas;

import java.util.Scanner;

public class Hijo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = "";

		while (!w.equals("fin")) {
			w = sc.nextLine();

			System.out.println(w.toUpperCase());
		}

	}

}

