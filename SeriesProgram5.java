
//Square Number Series //

package seriesprograms;
import java.util.Scanner ;

public class SeriesProgram5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print(" "+(i*i));
		}
		sc.close();
	}

}
