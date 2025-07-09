package array.com;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="samaya";
     char ch[]=s.toCharArray();
     
     int n=ch.length;
     int start=n/2-2;
     for(int i=start; i<start+4; i++)
     {
    	 ch[i]='#';
     }
     System.out.println("display");
     for(int i=0; i<ch.length; i++)
     {
    	 System.out.println(ch[i]);
     }
	}

}
