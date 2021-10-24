import java.util.Scanner;

public class maximuminarray
			{
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					
					//taking size of array
					System.out.println("enter the size of the array:");
					int n=sc.nextInt();
					int arr[]=new int[n];
					
					
					//taking the array input
					System.out.println("enter the eliments of the array:");
					for(int i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					System.out.print("\n");
					
					
					
					//displaying the array
					System.out.print(" the eliments of the array:");
					for(int i=0;i<n;i++)
					{
						System.out.print(arr[i]+ " ");
					}
					System.out.print("\n");
					
					
					
					//checking for maximum element
					int large;
					large=arr[0];
					for(int i=0;i<n;i++)
					{
						if(large<arr[i])
						{
							large=arr[i];
						}
					}
					System.out.println(large);
				}
			}
					
					