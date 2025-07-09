package array.com;
import java.util.*;
import java.util.Scanner;

public class RemoveDuplicateEleFromCharArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     char ch[]=new char[5];
	     System.out.println("Enter the values in array:");
	     for(int i=0; i<ch.length; i++)
	     {
	    	 ch[i]=sc.next().charAt(0);
	     }
	     
	     char res[]=new char[ch.length];
	     
	     int index=0;
	     for(int i=0; i<ch.length; i++)
	     {
	    	 boolean flag=false;
	    	 for(int j=i+1; j<ch.length; j++)
	    	 {
	    		 if(ch[i]==ch[j])
	    		 {
	    			 flag=true;
	    		 }
	    	 }
	    	 if(!flag)
	    	 {
	    		 res[index++]=ch[i];
	    	 }
	     }
	     System.out.println("Display after remove array:");
	     for(int i=0; i<index; i++)
	     {
	    	 System.out.println(res[i]);
	     }
	}

}
