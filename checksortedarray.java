import java.util.Scanner;

public class checksortedarray
			{
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					int n;
					boolean isSorted=true;
					System.out.println("enter the no of eliments:");
					n=sc.nextInt();
					int arr[]=new int[n];
					
					System.out.println("enter the eliements:");
					for(int i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					
					
					//i dont know why this works actully;
					for(int i=0;i<n-1;i++)
					{
						if(arr[i]>arr[i+1])
						{
							isSorted=false;
						}
					}
					if(isSorted)
					{
						System.out.println("array is sorted");
					}
					else
					{
						System.out.println("array is not sorted:");
					}
				}
			}