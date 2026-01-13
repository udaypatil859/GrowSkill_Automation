public class Program7_Prime {
	static void isPrime(int num)
	{
		if(num==1)
			System.out.println("Neither prime nor composite");
		else if(num==2)
			System.out.println("Prime");
		else if(num%2==0)
			System.out.println("Not Prime");
		else
		{
			boolean flag=true;
			for(int fact=3;fact<num;fact=fact+2)
			{
				if(num%fact==0)
				{
					flag=false;
					System.out.println("not Prime");
					break;
				}
			}
			if(flag==true)
			System.out.println("Prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(9);
	}

}
