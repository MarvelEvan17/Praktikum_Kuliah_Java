import java.util.Scanner;

public class JurnalMandiri1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Sebuah bilangan :");
		int bilangan = input.nextInt();

		if (bilangan > 0){
			System.out.println("itu adalah bilangan " + bilangan);
		} else {
			System.out.println("Bukan sebuah bilangan!");
		}
	}
}