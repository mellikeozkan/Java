import java.util.Scanner;

public class deger_alma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınızı giriniz .");
		
		String isim = scanner.nextLine();
		
		System.out.println("Soydınızı giriniz .");
		
		String soyisim = scanner.nextLine();
		
		System.out.println("Adınız ve Soyadınız: "+ isim+ " " +soyisim);
		
		scanner.close();
	
		

	}

}
