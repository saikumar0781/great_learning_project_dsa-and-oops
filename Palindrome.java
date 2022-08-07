import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		boolean a = isPalin(str);
		System.out.println(a);
	}
		
	public static boolean isPalin(String str)
	{
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else
				return false;
		}
		return true;
	}
}
