import java.util.Scanner;

public class TugasAkhirPraktikum2 {

    static String satuan(int n) {
        switch (n) {
            case 1:
                return "Satu";
            case 2:
                return "Dua";
            case 3:
                return "Tiga";
            case 4:
                return "Empat";
            case 5:
                return "Lima";
            case 6:
                return "Enam";
            case 7:
                return "Tujuh";
            case 8:
                return "Delapan";
            case 9:
                return "Sembilan";
            default:
                return "";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input  : ");
        int angka = input.nextInt();

        if (angka < 0 || angka > 999) {
            System.out.println("Output : Angka harus antara 0 - 999");
        } else if (angka == 0) {
            System.out.println("Output : Nol");
        } else {

            String hasil = "";

            int ratus = angka / 100;   
            int sisa = angka % 100;    

           
            if (ratus == 1) {
                hasil = hasil + "Seratus ";
            } else if (ratus > 1) {
                hasil = hasil + satuan(ratus) + " Ratus ";
            }


            if (sisa == 10) {
                hasil = hasil + "Sepuluh ";
            } else if (sisa == 11) {
                hasil = hasil + "Sebelas "; 
            } else if (sisa > 11 && sisa < 20) {
                hasil = hasil + satuan(sisa % 10) + " Belas ";
            } else {
                int puluh = sisa / 10;
                int sat = sisa % 10;

                if (puluh >= 2) {
                    hasil = hasil + satuan(puluh) + " Puluh ";
                }
                if (sat > 0) {
                    hasil = hasil + satuan(sat) + " ";
                }
            }

            System.out.println("Output : " + hasil.trim());
        }

        input.close();
    }
}