import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int pow=s.nextInt();
		System.out.println(powerOfN(num,pow));

	}
	public static int powerOfN(int num, int pow)
	{
		if(pow==0)
			return 1;
		int temp = powerOfN(num,pow/2);
		if(pow%2==0)
		{
			return temp*temp;
		}
		else
			return num*temp*temp;
	}

}
