package array.com;
import java.util.*;
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="swiss";
     char ch[]=str.toCharArray();
    
     for(int i=0; i<ch.length; i++)
     {
    	 int count=1;
    	 for(int j=i+1; j<ch.length; j++)
    	 {
    		 if(ch[i]==ch[j])
    		 {
    			 count++;
    		 }
    	 }
    	 if(count==1)
    	 {
    		System.out.println(ch[i]);
    		break;
    		 
    	 }
    	 
     }
     
     
	}

}
