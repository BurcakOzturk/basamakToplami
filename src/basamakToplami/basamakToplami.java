package basamakToplami;

import java.util.Scanner;

public class basamakToplami {

	public static void main(String[] args) {

		int sayi,sayiSabit,basamak,toplam=0;
		
	    Scanner input = new Scanner(System.in);
	    
	    
	    System.out.print("Basamak toplamını bulmak istediğiniz sayıyı yazınız : ");
	    sayi = input.nextInt();
	    
	    sayiSabit=sayi;    
	   
        while (sayi != 0) {
            basamak = sayi % 10;
            toplam += basamak; 
            sayi /= 10;
        }

        System.out.println("Girdiğiniz "+sayiSabit+" sayısının basamakları toplamı : "+toplam);
		
	}

}
