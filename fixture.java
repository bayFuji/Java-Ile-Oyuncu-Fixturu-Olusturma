
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class fixture {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		int kisiSayisi=0;
		System.out.println("Fixtür'de yer alacak oyuncu sayısını seçiniz.");
		kisiSayisi = girdi.nextInt();
		
		while (kisiSayisi%2!=0) {
		System.out.println("Lütfen çift bir sayı girin. ");
		kisiSayisi = girdi.nextInt();
		}
		
		System.out.println("Oyuncu sayınız "+"\""+kisiSayisi+"\""+" olarak belirlendi.");
		System.out.println("Şimdi lütfen oyuncuların isimlerini girin.");
		String oyuncular[]=new String[kisiSayisi];
		
		for (int l=0; l<kisiSayisi; l++) {
			oyuncular[l]=girdi.next();
		}
		
		int num=0;
		String kullanilanlar = "";
		
			for (int i=0; i<kisiSayisi; i++) {
				
				Random r = new Random();
				int a=r.nextInt(kisiSayisi);
				String aString=Integer.toString(a);
			
				if (kullanilanlar.contains(aString)) {
					i--;
					continue;
				}
				
				else {
					System.out.print("\""+oyuncular[a]+"\"");
					num++;
					if (num%2==1)
						System.out.print(" ve ");
					else if (num%2==0 && num!=kisiSayisi)
						System.out.println(" ile ");
					else if (num!=kisiSayisi)
						System.out.println(" ve ");
				}
			
				kullanilanlar += a+"";
				
			}	
			
			System.out.println(" oyuncuları eşleşti.");
		
	}

}
