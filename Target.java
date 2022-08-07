import java.util.Scanner;
public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		
		int n1=0;
		int n2=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					n1=i;
					n2=j;
					break;
				}
			}
		}
		System.out.println("["+n1+","+n2+"]");
		System.out.println("nums["+n1+"]+nums["+n2+"] = "+target);


}
}