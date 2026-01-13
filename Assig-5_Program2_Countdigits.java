public class Program2_Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=98765;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
