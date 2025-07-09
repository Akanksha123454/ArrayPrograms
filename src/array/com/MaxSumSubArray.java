package array.com;
//find subarray with max sum
public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum=0;
		int sum=0;
		int start=0, end=0,tempStart=0;
		for(int i=0; i<a.length; i++)
		{   
			sum=sum+a[i];
			
			if(sum>maxSum)
			{
				maxSum=sum;
				start=tempStart;
				end=i;
			}
			if(sum<0)
			{
				sum=0;
				tempStart=i+1;
			}
			
		}
		System.out.println("maxSum of subarray: "+maxSum);
		System.out.print("Subarray: ");
		for(int i=start; i<=end; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}


}
