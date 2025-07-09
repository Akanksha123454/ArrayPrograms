package array.com;

public class ValidString {
    public static boolean isValid(char str[],int length )
    {
    	int low=0,high=0;
    	for(int i=0; i<length; i++)
    	{
    		char ch=str[i];
    		if(ch=='(')
    		{
    			low++;
    			high++;
    		}
    		else if(ch==')')
    		{
    			low--;
    			high++;
    		}
    		if(high<0)
    		{
    			return false;
    		}
    		if(low<0)
    		{
    			low=0;
    		}
    	
    	}
		return low==0;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(*))";
		char ch[]=str.toCharArray();
      boolean res=isValid(ch,ch.length);
      System.out.println(res);
	}

}
