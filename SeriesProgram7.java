//Prime Number Series //

package seriesprograms;
import java.util.Scanner ;

public class SeriesProgram7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit : ");
		int n = sc.nextInt();
		int num = 1 , count= 0 ;
		while(num <= n)
		{
			for(int i = 1 ; i <= n ; i++)
			{
				if(num % i == 0)
				{
					count ++ ;
				}
			}
			if(count == 2)
			{
				System.out.println(" "+num);
			}
			count = 0 ;
			num ++ ;
		}
		sc.close();
	}

}


