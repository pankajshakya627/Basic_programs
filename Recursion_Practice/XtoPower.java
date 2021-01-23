class XtoPower
{
	static int powerX(int n, int x)
	{
		if(x==0 || n==1)
			return 1;
		return n*(powerX(n,x-1));
	}
	public static void main(String[] args) {
		int n = 9;
		int x=2;
		System.out.print(powerX(n,x));
		
	}
}