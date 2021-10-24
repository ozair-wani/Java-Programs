class ArrayToFunction
{
	static void sort(int [] arr)
	{
		int i,j;
		for( i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
					{arr[i]^=arr[j];
					arr[j]^=arr[i];
					arr[i]^=arr[j];}
		}
	}
	public static void main(String args[])
	{
		int[] nums={5,3,4,1,2};
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		sort(nums);
		System.out.println("\nAfter sorting: ");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}
}