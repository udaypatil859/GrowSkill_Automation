public class Program5_EvenOrOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1230005;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int lastdigit=num%10;
			if(lastdigit%2==0)
				evencount++;
			else
				oddcount++;
			num=num/10;
		}
		System.out.println("Even: "+evencount);
		System.out.println("ODD: "+oddcount);
		

	}

}
