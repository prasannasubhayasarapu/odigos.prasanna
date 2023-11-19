
public class Sum {
	public static void main(String[] args) {
	int sum=0;
	int i=1;
	float a=1;
		for (i=1;i<=5;i++)
		{
			System.out.println(i);
			sum=i+sum;
			a=sum/i;
			
			
		}
		
		System.out.println("The sum of 5 no is:"+sum);
		System.out.println("The Average is:"+a);
	}


}