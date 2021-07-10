
//Harmonic Series i.e. 1/1 + 1/2 + 1/3 + 1/4 + 1/5 ....//

package seriesprograms;
import java.util.Scanner ; 

public class SeriesProgram9 {

	public static void main(String[] args) {
		
		int num , i = 1 ;
		double rst = 0.0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for length of serirs : ");
		num = sc.nextInt();
		while(i <= num)
		{
			System.out.print("1/"+i+"+");
			rst = rst + (double) 1 / i ;
			i++ ;
		}
		System.out.println("\n\nSum of Harmonic Series is : "+rst);
		sc.close();
	}

}
