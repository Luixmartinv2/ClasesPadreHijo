package Numero_al_azar;

import java.util.Scanner;

public class Hijo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = "";

		while (!w.equals("fin")) {
			w = sc.nextLine();
			int y = (int) ((Math.random() * 10));
			System.out.println(y);
		}

	}

}
