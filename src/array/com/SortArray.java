package array.com;

public class SortArray {
  public static void main(String args[])
  {
int a[]={10,40,20,60,30,70,90,50};
//sort array
	for(int i=0; i<a.length;i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("after sorting");
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	int maxCount=1;
	int count=1;
	
	//longest consecitive seq
	for(int i=1; i<a.length; i++)
	{
		if(a[i]==a[i-1])
		{
			continue;
		}
		else if(a[i]==a[i-1]+1)
		{
			count++;
		}
		else
		{
			if(count>maxCount)
			{
				maxCount=count;
			}
		}
	}
	System.out.println(maxCount);
}
}