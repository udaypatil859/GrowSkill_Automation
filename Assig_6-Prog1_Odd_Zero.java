public class Program7_Odd_Zero {

	public static void main(String[] args) {
		int num=5678;
		int newNum=0;
		int count=0;
		while(num>0)
		{
			count++;
			int lastdigit=num%10;
			if(count==2)
				newNum=lastdigit*10+newNum;
			else if(count==4)
				newNum=lastdigit*1000+newNum;
			num=num/10;	
		}
		System.out.println(newNum);
	}

}
