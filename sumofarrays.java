import java.util.Scanner;
public class sumofarrays
		{
			public static void main(String[] args)
			{
				int mat1[][]=new int [2][2];
				int mat2[][]=new int [2][2];
				int sum[][]=new int [2][2];
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the values of matrix 1");
				for(int i=0;i<2;i++)
					{
						for(int j=0;j<2;j++)
						{
							mat1[i][j]=sc.nextInt();
						}
					}
				System.out.println("enter the values of matrix 2");
				for(int i=0;i<2;i++)
					{
						for(int j=0;j<2;j++)
						{
							mat2[i][j]=sc.nextInt();
						}
					}
				System.out.println(" values of matrix 1 is");
				for(int i=0;i<2;i++)
					{
						for(int j=0;j<2;j++)
						{
							System.out.print(mat1[i][j]+" ");
						}
						System.out.print("\n");
					}
				System.out.println(" values of matrix 2 is");
				for(int i=0;i<2;i++)
					{
						for(int j=0;j<2;j++)
						{
							System.out.print(mat2[i][j]+" ");
						}
						System.out.print("\n");
					}
				System.out.println(" some of array is");
				for(int i=0;i<2;i++)
					{
						for(int j=0;j<2;j++)
						{
							sum[i][j]=mat1[i][j]+mat2[i][j];
							System.out.print(sum[i][j]+" ");
							
						}
						System.out.print("\n");
					}
				
			}
		}
				
		