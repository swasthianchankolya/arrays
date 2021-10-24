import java.util.Scanner;

public class arrayreverse
			{
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the size of the array:");
					int n=sc.nextInt();
					
					//declare an array
					int arr[] = new int[n];
					int i;
					
					//array input
					System.out.println("enter the array eleiments");
					for(i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					
					//displaying original array
					System.out.println("the original array is:");
					System.out.println("\n");
					for(i=0;i<n;i++)
					{
						System.out.println(arr[i]);
					}
					
					
					//reverse operation
					int temp;
					int start=0;
					int end=n-1;
					 
					/*
					(ex:(1,2,3,4,5) here start is 1 and end is 5 and the index of 5 is
					4 bcz index of 1 is zero but size is 5 so index 0 is less then index 4
					so the eliements will be swapped,then start will be incrimented ,and 
					end will be decrimented and compared again
					*/
					
					while(start<end)
					{
						temp=arr[start];
						arr[start]=arr[end];
						arr[end]=temp;
						
						start++;
						end--;
						
					}
					System.out.println("printing revserse of the array:");
					for(int j=0;j<n;j++)
					{
						System.out.println(arr[j]);
					}
					
				}
			}