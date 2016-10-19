package Mayusculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Padre {

	public static void main(String[] args) throws IOException {
		// creacion e inicio de proceso
		ProcessBuilder pb = new ProcessBuilder("java", "-jar", "hijo2.jar");//tambien vale poner el nombre del ejecutable si lo importas en el proyecto
		Process p = pb.start();
		// para enviar al hijo
		OutputStream out = p.getOutputStream();
		PrintStream ps = new PrintStream(out);
		// para recibir del hijo
		InputStream is = p.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bf = new BufferedReader(isr);
		// -------------- d
		Scanner sc = new Scanner(System.in);
		String w = "";

		while (!w.equals("fin")) {
			System.out.println("Escribe palabras");
			String pal = sc.nextLine();

			ps.println(pal);
			ps.flush();
			String pala = bf.readLine();
			System.out.println(pala);

		}
		ps.close();
	}

}

