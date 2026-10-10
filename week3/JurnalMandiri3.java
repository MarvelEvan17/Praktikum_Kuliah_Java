import java.util.Scanner;

public class JurnalMandiri3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username = "admin";
		String password = "java123"; 

		System.out.print("Masukan Username : ");
		String inputusername = input.next();
		System.out.print("Masukan Password : ");
		String inputpassword = input.next();

		if (inputusername.equals(username)){
			if (inputpassword.equals(password)){
				System.out.println("Login Berhasil");
			}else {
				System.out.println("password salah");
			}
		}else {
			System.out.println("username tidak ditemukan");
		}
	}
}