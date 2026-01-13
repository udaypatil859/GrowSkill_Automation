public class Program6_DigitAndZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		int originalnum=num;
		int countDigit=0;
		int result=0;
		while(num>0)
		{
			countDigit++;
			num=num/10;
		}
		if(countDigit==1)
		{
			result=originalnum*10;
		}
		else if(countDigit==2)
		{
			result=originalnum*100;
		}
		else
		{
			result=originalnum;
		}
		System.out.println(result);	

	}

}
