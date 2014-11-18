import java.util.Scanner;


public class ifFunkcija {

		public static void main(String[] args) {
			int brPrvi ;
			System.out.println("Unesi prvi broj");
			Scanner in = new Scanner(System.in);
			brPrvi = in.nextInt() ;
			int brDrugi ;
			System.out.println("Unesi drugi broj");
			brDrugi = in.nextInt() ;
			
			if (  (brPrvi>=brDrugi) ){ 
					int razlika = brPrvi - brDrugi ;
					System.out.println("Razlika dva broja je " +razlika) ; }
					if ( (brDrugi>=brPrvi)){
				int razlikadva = brDrugi - brPrvi ;
				System.out.println("Razlika dva broja je " +razlikadva) ;
				}
			}
			
		}
