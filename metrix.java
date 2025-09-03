import java.util.Scanner;

public class metrix {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter rows and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int A[][]=new int[r][c];
		int B[][]=new int[r][c];
		int C[][]=new int[r][c];
		
		System.out.println("enter elements of matrix A:");
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter elements of matrix B:");
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("addition of matrixces:");
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]+"");
			}
		}
		
		sc.close();
	}
}
