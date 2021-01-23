class ArrSum
{
	public static int sumArr(int[] arr, int startIdx)
	{
		if(startIdx>=arr.length)
			return 0;
		 return (sumArr(arr,startIdx+1)+arr[startIdx]);
	}
	public static void main(String[] args) {
		int[] n = {1,7,2,3};
		System.out.print(sumArr(n,0));
	}
}