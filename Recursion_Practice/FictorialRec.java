class FictorialRec
{
	static long fact(long n)
	{
		if(n==0 || n==1)
			return n;
		return fact(n-1)*n;
	}
	public static void main(String[] args) {
		long n = 10L;
		System.out.print(fact(n));
	}
	
}