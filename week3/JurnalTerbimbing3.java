import java.util.Scanner;

public class JurnalTerbimbing3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double saldo = 1000000;
		System.out.println("Saldo : " + saldo);
		System.out.print("Jumlah penarikan: Rp ");
		double tarik = input.nextDouble();

		//penarikan jika jumlah penarikan lebih dari 0
		if(tarik > 0){
			double saldoAkhir = saldo - tarik;

			if(tarik <= 50000){

				if(saldoAkhir >= 50000){
					saldo = saldoAkhir;
					System.out.println("Transaksi Berhasil");
					System.out.println("Saldo Akhir : Rp." + saldoAkhir);
				}else{
						System.out.println("Transaksi Gagal");
						System.out.println("Saldo Minimum : Rp 50.000");
					}	
			}else{
						System.out.println("Saldo Tidak Mencukupi");
					}	
		  }else{
						System.out.println("Jumlah Penarikan Tidak Valid");
				}
		}
	}
							