import java.util.Scanner;

public class JurnalTerbimbing3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Total Belanja : ");
		int totalBeli = input.nextInt();

		System.out.print("Masukan jumlah uang yang dibayarkan : ");
		int uangDibayar = input.nextInt();

		int kembalian = uangDibayar - totalBeli;

		int lembar10000 = kembalian / 10000;
		int sisa = kembalian % 10000;

		int lembar5000 = sisa / 5000;
		sisa = sisa % 5000;

		int lembar1000 = sisa / 1000;
		sisa = sisa % 1000;

		int keping500 = sisa /500;
		sisa = sisa % 500;

		int keping100 = sisa / 100;

		System.out.println("\nTotal Kembalian : Rp. " + kembalian);
		System.out.println("i.  10.000  :" + lembar10000 + "lembar");
		System.out.println("ii.  5.000  :" + lembar5000 + "lembar");
		System.out.println("iii. 1.000  :" + lembar1000 + "lembar");
		System.out.println("iv.    500  :" + keping500 +  "keping");
		System.out.println("v.     100  :" + keping100 +  "keping");		

	}
}