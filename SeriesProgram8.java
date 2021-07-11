
//Triangular Number Series //

package seriesprograms;
import java.util.Scanner ;

public class SeriesProgram8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			int num = (i * ( i + 1) / 2 ) ;
			System.out.print(" "+num);
		}
		sc.close();
	}

}

