
public class mantiksal {

	public static void main(String[] args) {
		
		int a=5;
		int b =3;
		
		/* ! bu sonucun zıttını almak için kullanılır .
		
		boolean sonuc =!(a>b);
		System.out.println(sonuc);
		sonuç false olacaktır  
		 */

		
		 boolean sonuc =a>2 && b<7;  //ve demek  || veya demek 0 veya 1 den hangisi varsa her türlü true bi tane olsa da yeterlidir sonuc true olur .ancaya ve işleminde bir tane false olursa sonıuc false olur .
		 System.out.println("Sonuç : " +sonuc );
		
	}
	

}
