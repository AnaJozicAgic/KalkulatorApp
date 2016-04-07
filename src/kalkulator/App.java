package kalkulator;

import java.util.Scanner;

public class App {
static Scanner input = new Scanner(System.in);
	public static void kalkulator() {
		double broj2=0;
		System.out.println(
				"\n(Operator moze biti : \n+ >sabiranje, \n- >oduzimanje, \n* >mnozenje, \n/ >djeljenje, \n2 >kvadriranje, \nV >korjenovanje)\nUnesite vasu operaciju: ");
		double broj1 = input.nextDouble();
		String operacija = input.next().toUpperCase();
		if (operacija.equals("+")||operacija.equals("-")||operacija.equals("*")||operacija.equals("/")){
			 broj2 = input.nextDouble();
		}

		// Objekat isnstrukcije
		Instrukcije a = new Instrukcije();
		// Provjera unesenog operatora

//Provjera i izvrsavanje operacije
		switch (operacija) {
		case "+":
			System.out.println("Rezultat operacije je: " + a.saberi(broj1, broj2));
			break;
		case "-":
			System.out.println("Rezultat operacije je: " + a.oduzmi(broj1, broj2));
			break;
		case "*":
			System.out.println("Rezultat operacije je: " );
			break;
		case "/":
			System.out.println("Rezultat operacije je: " );
			break;
		case "2":
			System.out.println("Rezultat operacije je: " );
			break;
		case "V":
			System.out.println("Rezultat operacije je: " );
			break;
		}

	}

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);

		try {
			int check = 5;
			while (check == 5) {
				kalkulator();
				System.out.println("Unesite 5 za unos nove operacije \nili bilo koji drugi broj za gasenje kalkulatora: ");
				check = input.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		
		}finally {
			input.close();
		}
	}

}
