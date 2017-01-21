import java.util.Scanner;
class num
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a==0)System.out.println("zero");
		if(a>0)System.out.println("postive");
		if(a<0)System.out.println("negative");
	}
}