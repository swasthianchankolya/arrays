import java.util.Scanner;

public class minimuminarray
			{
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					
					//taking size of array
					System.out.println("enter the size of the array:");
					int n=sc.nextInt();
					int arr[]=new int[n];
					int i;
					int max=0;
					int min=0;

					System.out.println("enter the element:");
					for(i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					
					//displaying the array
					System.out.println("original array:");
					for(int element:arr)
					{
					System.out.println(element);	
					}
					
					//finding max element
					for(int element:arr)
					{
						if(element>max)
						{
							max=element;
						}
					}
					System.out.println("maximum element is");
					System.out.println(max);
					
					
					
					
				}
			}
