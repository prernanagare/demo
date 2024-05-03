import java.util.*;

public class TokenRing{

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number of node:");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
		 System.out.print(i+"");
		}
		System.out.println("0");

		int choice=0;

		do{
			System.out.println("Enter sender:");
			int sender=sc.nextInt();
			
			System.out.println("Enter receiver:");
			int receiver=sc.nextInt();
			
			System.out.println("Enter data:");
			int data=sc.nextInt();
			
			int token=0;
			System.out.println("Token Passing:");
			for(int i=0;i<sender;i++)
			{
				System.out.println(" "+ i +" -->");
			
			}
			System.out.println(" "+sender);
			System.out.println("sender"+sender+ "is Data"+data);
			
			for(int i=sender;i!=receiver;i=(i+1)%n)
			{
				System.out.println("data"+data+ "is forwarded by "+i);
			}
			
			System.out.println("receiver"+receiver+ "is received "+data);
			
			token=sender;
			
			System.out.print("Want to send 1 yes , o for no");
			
			choice=sc.nextInt();
		}while(choice==1);

	}

}