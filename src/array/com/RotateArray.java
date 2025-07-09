package array.com;
import java.util.*;
public class RotateArray {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			int a[] = new int[5];
			System.out.println("Enter a values in array:");
            for(int i=0; i<a.length; i++)
            {
            	a[i]=sc.nextInt();
            }
			
			int n = 2;
			while (n > 0) {
				int last = a[a.length - 1];
				for (int i = a.length-1; i >0; i--) {
					a[i]=a[i-1];

				}
				a[0] = last;
				n--;
			}
			System.out.println("Display array after rotate:");
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}

		}
}
