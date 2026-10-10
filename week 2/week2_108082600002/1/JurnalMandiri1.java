import java.util.Scanner;

public class JurnalMandiri1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Total Hari : ");
		int jumlahHari = input.nextInt();

		int tahun = jumlahHari / 365;
		int sisa = jumlahHari % 365;

		int bulan = sisa / 30;
		sisa = sisa % 30;

		int minggu = sisa / 7;
		sisa = sisa % 7;

		int hari = sisa / 1;
		sisa = sisa % 1;


		System.out.println("\nTotal Hari : ");
		System.out.println("Tahun  : "+ tahun +"Tahun");
		System.out.println("Bulan  : "+ bulan +"Bulan");
		System.out.println("Minggu : "+ minggu +"Minggu");
		System.out.println("hari   : "+ hari +"Hari");


	}
}