class CheckSorted
{
	public static boolean checkSortArr(int[] arr)
	{
		if(arr.length <= 1)
			return true;
		if(arr[0]>arr[1])
			return false;
		int[] tmp = new int[arr.length-1];
		for(int i=1; i<arr.length; i++)
		{
			tmp[i-1]=arr[i];
		}
		boolean res = checkSortArr(tmp);
		// if(res)
		// 	return true;
		// else
		// 	return false;
		return res;
	}


	// Better Approch
	public static boolean checkSortArrImproved(int[] arr, int s_idx)
	{
		if(s_idx>=arr.length-1)
			return true;
		if(arr[s_idx] > arr[s_idx+1])
			return false;
		boolean res = checkSortArrImproved(arr, s_idx+1);
		return res;
	}

	public static void main(String[] args)
	{
		int[] a = {2,5,10,19,99};
		System.out.print(checkSortArrImproved(a,0));		
	}
}