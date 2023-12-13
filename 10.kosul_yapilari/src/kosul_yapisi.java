
public class kosul_yapisi {

	public static void main(String[] args) {
		/*
		 
		  bir kuruyemişçi toptancıdan 
		  12 kg leblebi kilosu  3.5 tl
		  25 kg fındık kilosu  15.7 tl
		  40 kg badem kilosu 22 tl den almıştır .
		  
		  
		  bu ürünleri satarken ;
		   leblebi kilosunu %50 fazlasına satmış 
		   fındık %40 fazlası 
		   badem %60 fazlasına satılmıştır 
		   
		   kuruyemişçi o günkü kazandığı para ile dükkkanının kirasını ödemek istemektedir 
		   kira tutarı 500 tl ,
		   kazandığı para 500 tl den yüksek ise kirayı ödeyebilsin değilse ödeyemesin 
		  
		 */
		      double leblebi =3.5;
		      double findik=15.7;
		      double badem=22;
		      
		      double maliyetTutar =(12*3.5)+(findik*25)+(badem*40);
		      
		      double satisTutar=((leblebi*1.5)*12)+((findik*1.4)*25) +((badem*1.6)*40);
		      
		      double karTutar= satisTutar- maliyetTutar;
		      
		      if (karTutar >500) {
		    	  System.out.println("kirayı ödeyebilirsin");
		      }
		 
		      else { 
		    	  System.out.println("kirayı ödemek için yeterli paranız bulunmamaktadır ");
		      }
                 System.out.println("maliyet tutarı :"+maliyetTutar);
                 System.out.println("satış tutarı :"+satisTutar);
                 System.out.println("kazanç Tutar :"+karTutar);;
	}

}
