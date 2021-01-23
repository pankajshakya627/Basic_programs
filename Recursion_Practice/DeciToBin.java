class DeciToBin
{
	static void deciToBin(int n)
	{
		if(n>0)
		{
			deciToBin(n/2);
			System.out.print(n%2+"");
		}
	}
	public static void main(String[] args) {
		int n= 10; 
		deciToBin(n);
	}
}