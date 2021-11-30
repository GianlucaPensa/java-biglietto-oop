package it.biglietti;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		int km, età;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire km: ");
		km = input.nextInt();
		System.out.print("Inserire età : ");
		età = input.nextInt();
		
		Biglietto treno = new Biglietto(km,età);
		
		try {
			treno.isValidKm();
		}catch (Exception e) {
			System.out.println("Si e' verificato un errore: " + e.getMessage());
		}
		try {
			treno.isValidEtà();
		}catch (Exception eD) {
			System.out.println("Si e' verificato un errore: " + eD.getMessage());
		}
		
		input.close();
		
		System.out.println("€" + treno.calcolaPrezzo());
  }
}


