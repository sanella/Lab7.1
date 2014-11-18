import java.util.Scanner;

public class Djeljivost {
	public static void main(String[] args) {
	int brPrvi;
	System.out.println("Unesi prvi broj") ;
	Scanner in = new Scanner(System.in);
	brPrvi = in.nextInt() ;
	double saDva = (double) (brPrvi % 2.0) ;
	System.out.println(saDva) ;
	
	double saTri = (double) (brPrvi % 3.0) ;
	System.out.println(saTri) ;
	
	double saCetiri = (double) (brPrvi % 4.0) ;
	System.out.println(saCetiri) ;
	
	double saPet = (double) (brPrvi % 5.0) ;
	System.out.println(saPet) ;

	if (  (saDva==0 && saTri==0) ){ 
		System.out.println("broj je djeljiv sa 6, 2 i 3"  ) ; }
	if ((saDva==0)){
		System.out.println("broj je djeljiv sa 2"  ) ; }
	if ((saTri==0)){
		System.out.println("broj je djeljiv sa 3"  ) ; }
	if ((saCetiri==0)){
		System.out.println("broj je djeljiv sa 4"  ) ; }
	if ((saPet==0)){
		System.out.println("broj je djeljiv sa 5"  ) ; }
	
	

	}
	
}
