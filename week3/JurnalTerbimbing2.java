import java.util.Scanner;

public class JurnalTerbimbing2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Status Mahasiswa : (1. Aktif / 2. Tidak Aktif) : ");
		int status = input.nextInt();
		System.out.print("Persentase Kehadiran : ");
		double kehadiran = input.nextDouble();

		if (status == 1){
			if(kehadiran >= 75){
				System.out.println("Mahasiswa dapat mengikuti ujian");
			} else {
				System.out.println("Kehadiran kurang, Mahasiswa tidak dapat mengikuti ujian");
			}
		} else if(status != 1){
			System.out.print("Mahasiswa Tidak Aktif");
		}
	}
}