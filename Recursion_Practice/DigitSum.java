class DigitSum
{
	public static int digitSum(int n)
	{
		if(n<=9)
			return n;
		return (digitSum(n/10)+(n%10));
	}
	public static void main(String[] args) {
		int n = 1067;
		System.out.print(digitSum(n));
	}
}