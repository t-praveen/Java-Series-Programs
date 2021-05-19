//Arithmetic Series.//

package seriesprograms;
import java.util.Scanner ; 


public class SeriesProgram1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st term : ");
		int a = sc.nextInt();
		System.out.print("Enter limit : ");
		int limit = sc.nextInt();
		System.out.print("Enter common difference : ");
		int d = sc.nextInt();
		for(int i = 1 ; i <= limit ; i++)
		{
			System.out.print(" "+a);
			a = a + d ; //Adding difference with term .
		}
		sc.close();
		
	}

}
