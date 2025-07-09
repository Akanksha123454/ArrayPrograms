package array.com;
import java.util.*;
public class RemoveDuplicateEleFromCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     char ch[]=new char[5];
     System.out.println("Enter the values in array:");
     for(int i=0; i<ch.length; i++)
     {
    	 ch[i]=sc.next().charAt(0);
     }
     
     //remove duplicate element
     int size=ch.length;
     for(int i=0; i<size; i++)
     {
    	 for(int j=i+1; j<size; j++)
    	 {
    		 if(ch[i]==ch[j])
    		 {
    		  for(int k=j; k<size-1; k++)
    		  {
    			 ch[k]=ch[k+1];
    		  }
    		  size--;
    		 }
    	 }
     }
     
     System.out.println("Display after remove array:");
     for(int i=0; i<size; i++)
     {
    	 System.out.println(ch[i]);
     }
	}

}
