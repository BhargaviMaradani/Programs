//finding the even num in the list,printing sequenceof num and occuranceof a num in the list using java8//
import java.util.*;
import java.lang.Integer;
import java.util.Scanner;
import java.util.stream.*;
public class FindingNumbers
{
    public static void main(String[] args) 
	{
		
	   //finding the sequence of a number using java8//
	   
            IntStream natural = IntStream.iterate(0, i -> i + 1);

                natural
		
                .limit(10)
                .forEach(System.out::println);
				
				//finding the sequence of a number using java8//
				
				//this is method2 for finding the sequenceof numbers //
                  
				
				//finding the even number using java8//
				
				
				 Stream.iterate(1, element->element+1)
                .filter(element->element%2==0)
                .limit(5)
                .forEach(element->System.out.println("Even number is:" +element));
				
				//finding the count of the  numbers present in the sequence using java8//
				
				
				 /*
				 count=Stream.of(0,i->i+1);
				 .count();
				 System.out.printf("There are %d integers in the sequence %n", count);*/
				
         
    


        //finding the even num in the list,printing sequenceof num and occuranceof a num in the list using java7//


		//printing the list of sequence numbers//
		
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements: ");
		
		//finding the occuranceof a number in the sequence//
		
        for(int i=0;i<n;i++)
		{
            a[i]=sc.nextInt();
        }
		
          System.out.println("Please enter a element from array to check its occurance : ");
		  
          int occurance = sc.nextInt();
		  
          for(int i=0;i<n;i++)
		  {
			  
             if(a[i]==occurance)
             count++;
          }
	   
		System.out.print(occurance + " is present " + count + " times\n");
		
          //finding the even numbers in the list//		
	
        for( int  j = 0;  j< n; j++)
		{
            if(a[j]%2==0) 
			{
                System.out.println("\n Even number is: " + a[j]);
			}
		

		}
	} 
}    
