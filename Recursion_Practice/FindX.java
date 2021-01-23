class FindX
{
	public static int findX(int[] arr, int startIdx, int x)
	{
		int res=0;
		if(startIdx>=arr.length)
			return 0;
		if(x==arr[startIdx])
			return 1;
		res = findX(arr, startIdx+1, x);
		return res;
	}
	public static void main(String[] args) {
		int[] n = {1,7,2,3,909};
		int x=909;
		System.out.print(findX(n,0,x));
	}
}