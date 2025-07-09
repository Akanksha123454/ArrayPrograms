package array.com;

public class ShuffleArray {

	public static void shuffle(int a[],int pos[])
	{
		int n=a.length;
		int max=1000;
		
		for(int i=0; i<a.length; i++)
		{
			a[pos[i]]=a[pos[i]]+a[i]%max*max;
		}
		for(int i=0; i<a.length; i++)
		{
			a[i]=a[i]/max;
		}
		System.out.println("display repos array:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,10};
		int pos[]= {2,4,1,0,3};
		
      shuffle(a,pos);
	}

}
