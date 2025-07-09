package array.com;

public class AngBetHrAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hr=13;
		int min=40;
		
		if(hr>12)
		{
			hr=hr-12;
		}
		
		int minangle=min*6;
		int hrangle=(int) (hr*30+(0.5*min));
		
		int ang=Math.abs(hrangle-minangle);
		
		ang=Math.min(ang, 360-ang);
		System.out.println(ang);
	}

}
