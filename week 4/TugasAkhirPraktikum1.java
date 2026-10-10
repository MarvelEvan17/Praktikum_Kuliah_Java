import java.util.Scanner;

public class TugasAkhirPraktikum1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Info sekarang tanggal");
        System.out.print("tanggal : ");
        int tanggal = input.nextInt();
        System.out.print("Bulan   : ");
        int bulan = input.nextInt();
        System.out.print("Tahun   : ");
        int tahun = input.nextInt();

        boolean kabisat;
        if (tahun % 400 == 0) {
            kabisat = true;
        } else if (tahun % 100 == 0) {
            kabisat = false;
        } else if (tahun % 4 == 0) {
            kabisat = true;
        } else {
            kabisat = false;
        }

        
        int jumlahHari;
        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;

            case 2:
                if (kabisat) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;

            default:
                jumlahHari = 0;
        }

        
        if (jumlahHari == 0) {
            System.out.println("Bulan tidak valid");
        } else if (tanggal < 1 || tanggal > jumlahHari) {
            System.out.println("Tanggal tidak valid untuk bulan tersebut");
        } else {

            
            int tanggalLusa = tanggal + 2;
            int bulanLusa = bulan;
            int tahunLusa = tahun;

            
            if (tanggalLusa > jumlahHari) {
                tanggalLusa = tanggalLusa - jumlahHari;
                bulanLusa = bulanLusa + 1;

                if (bulanLusa > 12) {
                    bulanLusa = 1;
                    tahunLusa = tahunLusa + 1;
                }
            }

            
            String namaBulan;
            switch (bulanLusa) {
                case 1:
                    namaBulan = "Januari";
                    break;
                case 2:
                    namaBulan = "Februari";
                    break;
                case 3:
                    namaBulan = "Maret";
                    break;
                case 4:
                    namaBulan = "April";
                    break;
                case 5:
                    namaBulan = "Mei";
                    break;
                case 6:
                    namaBulan = "Juni";
                    break;
                case 7:
                    namaBulan = "Juli";
                    break;
                case 8:
                    namaBulan = "Agustus";
                    break;
                case 9:
                    namaBulan = "September";
                    break;
                case 10:
                    namaBulan = "Oktober";
                    break;
                case 11:
                    namaBulan = "November";
                    break;
                case 12:
                    namaBulan = "Desember";
                    break;
                default:
                    namaBulan = "-";
            }

            System.out.println("Lusa tanggal " + tanggalLusa + " " + namaBulan + " " + tahunLusa);
        }

        input.close();
    }
}