import java.util.*;
public class palin {

	public static void main(String[] args) {
		int s=0,r,a1,a2=0;
		
		System.out.println("enter a no :");
		Scanner a = new Scanner(System.in);
		a1 = a.nextInt();
		a.close();
		for(int i=2;i<a1;i++)
		{
			if(a1%i==0)
			{
				System.out.println("no");
				break;
			}
			else
			{
				System.out.println("yes");
				break;
			}
		}
		
	}

}
