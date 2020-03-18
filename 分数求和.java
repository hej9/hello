import java.util.*;

public class 分数求和
{
	public static void main(String[] args)
	{
		System.out.println("分数求和");

		Scanner input = new Scanner(System.in);

		System.out.print("分母: ");
		int n = input.nextInt();
		double result=0;
		for(int i=1;i<=n;i++)
		{
			result += 1.0 / i;
		}
		System.out.printf("%.2f", result);
	}
}
