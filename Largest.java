
class Largest_new 
{
	public static void main(String args[])
	{
		int arr[]={2,30,56};
		System.out.println(LargestNumber(arr));
	}
	public static String LargestNumber(int[] arr)
	{
		int l=arr.length;
		for(int i=0;i<l;i++)
		{
			for(int j=1;j<l-i;j++)
			{
				if(helper(arr[j],arr[j-1]))
				{
					swap(arr,j,j-1);
				}
			}
		}

		String res="";
		for(int i=0;i<arr.length;i++)
		{
			res+=Integer.toString(arr[i]);
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(res.charAt(i)=='0')
			{
				flag=true;
			}
			else
				break;
		}
		res = flag?"0":res;
		return res;
	}
	public static boolean helper(int a,int b)
	{
		String p = Integer.toString(a);
		String q = Integer.toString(b);
		String first = p+q;
		String second = q+p;

		int i=0,j=0;
		int l= first.length();
		while(i<l && first.charAt(i)==second.charAt(j))
		{
			i++;
			j++;
		}
		if(i==l) return false;
		if(second.charAt(i)-'0' < first.charAt(j)-'0')
		{
			return true;
		}
		return false;
	}
	public static void swap(int[] arr, int i, int j)
	{
	    int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}