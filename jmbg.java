package jmbg;

public class jmbg {
	public static void main(String[] args) {
		String jmb = "0211989175034" ;
		String dateBirth = jmb.substring(0,2) ;
		System.out.println("Datum") ;
		System.out.println(dateBirth) ;
		
		String mm = jmb.substring(2,4) ;
		System.out.println("Mjesec") ;
		System.out.println(mm) ;
		
		String ggg = jmb.substring(4,7) ;
		System.out.println("Godina") ;
		System.out.println("1" +ggg) ;
		
		
		String rr = jmb.substring(7,9) ;
		System.out.println("Regija") ;
		System.out.println(rr) ;
		
		String bb = jmb.substring(9,11) ;
		System.out.println("Nesto") ;
		System.out.println(bb) ;
		
		String k = jmb.substring(11,13) ;
		System.out.println("Nesto drugo") ;
		System.out.println(k) ;
	}

}
