package array.com;

public class FindLengthofLongestConsecutiveSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,0,1,2};
        int longest=1;
        int current=1;
        for(int i=1; i<a.length; i++)
        {
        	if(a[i]==a[i-1])
        	{
        		continue;
        	}
        	else if(a[i]==a[i-1]+1)
        	{
        		current++;
        	}
        	else
        	{
        		if(current>longest)
        		{
        			longest=current;
        		}
        		current=1;
        	}
        }
        if(current>longest)
        {
        	longest=current;
        }
        
        System.out.println(longest);
	}

}
