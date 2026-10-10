import java.util.Scanner;

public class JurnalMandiri2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Panjang sisi : ");
		int sisi = input.nextInt();		
		System.out.print("Masukan panjang balok : ");
		int p = input.nextInt();
		System.out.print("Masukan Lebar balok : ");
		int l = input.nextInt();
		System.out.print("Masukan Tinggi balok : ");
		int t = input.nextInt();

		int luasPersegi = sisi * sisi;
		int kelilingPersegi = sisi * 4;

		int luasKubus = 6 * sisi * sisi;
		int kelilingKubus = 12 * sisi;
		int volumeKubus = sisi * sisi * sisi;

		int luasBalok = 2 * ((p*l)+(p*t)+(l*t));
		int kelilingBalok =  (p + l + t) * 4 ;
		int volumeBalok = p * l * t;

		System.out.println("\nPersegi : ");
		System.out.println("Luas Persegi : " + luasPersegi);
		System.out.println("Keliling Persegi : " + kelilingPersegi);
		System.out.println("\nKubus : ");
		System.out.println("Luas, keliling, volume Kubus : " + luasKubus + "," + kelilingKubus + ","+ volumeKubus);
		System.out.println("\nBalok : ");
		System.out.println("Luas, keliling, volume Balok : " + luasBalok + "," + kelilingBalok +","+ volumeBalok);




	}
}