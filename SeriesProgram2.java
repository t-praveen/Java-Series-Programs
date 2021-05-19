//Geometric Series //

package seriesprograms;
import java.util.Scanner ; 


public class SeriesProgram2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st term : ");
		int a = sc.nextInt();
		System.out.print("Enter limit : ");
		int limit = sc.nextInt();
		System.out.print("Enter common ratio : ");
		int r = sc.nextInt();
		for(int i = 1 ; i <= limit ; i++)
		{
			System.out.println(" "+a);
			a = a * r ;
		}
		sc.close();
	}
}