package it.biglietti;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		int km, et�;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire km: ");
		km = input.nextInt();
		System.out.print("Inserire et� : ");
		et� = input.nextInt();
		
		Biglietto treno = new Biglietto(km,et�);
		
		try {
			treno.isValidKm();
		}catch (Exception e) {
			System.out.println("Si e' verificato un errore: " + e.getMessage());
		}
		try {
			treno.isValidEt�();
		}catch (Exception eD) {
			System.out.println("Si e' verificato un errore: " + eD.getMessage());
		}
		
		input.close();
		
		System.out.println("�" + treno.calcolaPrezzo());
  }
}


