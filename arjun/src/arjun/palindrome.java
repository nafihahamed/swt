package arjun;

public class palindrome {

	public  void arm() {
		try {
			int number =371,originalnumber,remainder,result=0;
			originalnumber =number;
			while (originalnumber != 0)
			{
				remainder = originalnumber % 10;
				result +=Math.pow(remainder,3);
				originalnumber /=10;
			}
			if(result ==number)
				System.out.println(number +"is an armstrong number.");
			else
				System.out.println(number +"is not an armstrong number.");
		}
		catch(Exception exception)
		{
			System.out.println(exception);
			
		}
	}
	public static void main(String[] args) {
		arnstrong obj=new arnstrong ();
		obj.arm()
;	}

}
