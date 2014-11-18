import java.util.Scanner;


public class IfZadatak {
	public static void main(String[] args) {
		int brPrvi;
		System.out.println("Unesi prvi broj");
		Scanner in = new Scanner(System.in);
		brPrvi = in.nextInt() ;
	
		
		if (  (brPrvi<=100) ){ 
			System.out.println("Broj je manji od 100"  ) ; }
		else if ( (brPrvi<= 1000) ){
			System.out.println("Broj je manji od 1000"  ) ; }
		else if ( (brPrvi<= 10000) ){
			System.out.println("Pretjerao si "  ) ; }
	
		}
	
	}