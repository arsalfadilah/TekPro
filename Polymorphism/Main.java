package Polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singa singa = new Singa("Mamalia", "Hewan karnivora, Singa jantan memiliki bulu lebat dileher, Kucing besar, Dijuluki raja hutan", "Mengaum. Waung, Waung, Waung ...", "Berjalan");
		Elang elang = new Elang("Aves", "Mempunyai paruh tajam, kaki yang tajam untuk mencengkram mangsa, penglihatan yang tajam, burung predator", "Waing, Waing, .. gatau suaranya btw", "Terbang");
		Lebah lebah = new Lebah("Serangga", "Memiliki sengat yang terdapat di ekornya, penghasil madu, tubuhnya berwanrna hitam kuning, pemakan sari bunga", "Mendengung. Ngingg, ngingg, ngingg", "Terbang");
		Paus paus = new Paus("Mamalia", "hewan berdarah panas, hewan terbesar dilautan, pemakan plankton", "gatau suara paus hiks, mungkin iiiiingggggg, iiiinggggg...", "Berenang");
		
		int pilihan;
		
		Scanner masuk = new Scanner(System.in);
		System.out.println("Silakan pilih hewan yang ingin kamu ketahui");
		System.out.println("1. Singa ");
		System.out.println("2. Elang ");
		System.out.println("3. Lebah ");
		System.out.println("4. Paus ");
		System.out.println("5. Keluar Program \n");
		System.out.print("Masukkan pilihan kamu: ");
		pilihan = masuk.nextInt();
		System.out.println("");
		
		
		switch(pilihan){
		case 1 :
			System.out.println("Singa");
			singa.infoHewan();
			System.out.println("Alat bernafas: paru-paru");
			break;
		
		case 2 :
			System.out.println("Elang");
			elang.infoHewan();
			System.out.println("Alat bernafas: pundi-pundi udara");
			break;
			
		case 3 :
			System.out.println("Lebah");
			lebah.infoHewan();
			System.out.println("Alat bernafas: trakea");
			break;
			
		case 4 :
			System.out.println("Paus");
			paus.infoHewan();
			System.out.println("Alat bernafas: paru-paru");
			
		case 5 :
			System.exit(0);
		}

        System.out.println("Press Any Key To Continue...");
        new Scanner(System.in).nextLine();
		for(int i = 0; i < 80*300; i++) // Default Height of cmd is 300 and Default width is 80
		    System.out.print("\b");
		
	}

}
