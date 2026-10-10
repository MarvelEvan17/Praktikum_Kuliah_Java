import java.util.Scanner;

public class DiluarJamPraktikum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Nama : ");
		String nama = input.nextLine();
		System.out.print("Masukan Nilai Tugas : ");
		Double nilaiTugas = input.nextDouble();
		System.out.print("Masukan Nilai UTS : ");
		Double nilaiUts = input.nextDouble();
		System.out.print("Masukan Nilai UAS : ");
		Double nilaiUas = input.nextDouble();
		System.out.print("Masukan Presentase Kehadiran : ");
		Double kehadiran = input.nextDouble();

		Double nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);

		if (kehadiran >= 75){

			if (nilaiAkhir >= 60) {
				System.out.println("Selamat Anda Lulus");
				System.out.println("Nilai Akhir : " + nilaiAkhir);
			}
			if (nilaiAkhir < 60) {
				System.out.println("Anda Tidak Lulus");
				System.out.println("Nilai Akhir : " + nilaiAkhir);
			}

		}else {
			System.out.println("Tidak Lulus & tidak dapat melihat nilai");
		}
	}
}