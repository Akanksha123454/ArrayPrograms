package array.com;

public class SecondLargestWithoutSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,4,6,5,8,9,2};
    
    int largest=0;
    int second=0;
    int n=a.length;
    if(n<2)
    {
    	System.out.println("array must have atleast 2 element");
    }
    if(a[0]>a[1])
    {
    	 largest=a[0];
    	 second=a[1];
    }
    if(a[0]<a[1])
    {
    	largest=a[1];
    	second=a[0];
    			
    }
    for(int i=2; i<n; i++)
    {
    	if(a[i]>largest)
    	{
    		second=largest;
    		largest=a[i];
    	}
    	else if(a[i]<largest&&a[i]>second&& largest==second)
    	{
    		second=a[i];
    	}
    }
	}

}
