package Abinn;
import java.util.Scanner;
public class while_loop_tasks {

	    public static void main(String[] args) {

//	    	1. Factorial of a Number
	    	
	        Scanner scan = new Scanner(System.in);
//
//	        System.out.print("Enter a number: ");
//	        int n = sc.nextInt();
//
//	        int fact = 1;
//
//	        for(int i = 1; i <= n; i++)
//	        {
//	            fact = fact * i;
//	        }
//
//	        System.out.println("Factorial = " + fact);
	    	
	    	
//	    	2.Print First 10 Natural Numbers in for loop
	    	
//	    	int n= scan.nextInt();
//	    	for(int i=1;i<=n;i++) {
//	    		System.out.println(i);
//	    	}
	   
	    	
//	    	in while
//	        
//	        int n= scan.nextInt();
//	        int i=1;
//	        while(i<=n) {
//	              System.out.println(i);
//	              i++;
//	        }
	    	
//	    	3.sum of 10 num
	        
//	        int sum = 0;
//
//	        for(int i = 1; i <= 10; i++)
//	        {
//	            sum = sum + i;
//	        }
//
//	        System.out.println("Sum = " + sum);
	    	
	    	
//	      4. multiplications table
	    	
//	        System.out.print("Enter number: ");
//	        int n = sc.nextInt();
//
//	        for(int i = 1; i <= 10; i++)
//	        {
//	            System.out.println(n + " x " + i + " = " + (n * i));
//	        }
	    	
	    	
//	       5. fibonacci series
	        
//	        System.out.print("Enter terms: ");
//	        int n = scan.nextInt();
//
//	        int a = 0;
//	        int b = 1;
//
//	        for(int i = 1; i <= n; i++)
//	        {
//	            System.out.print(a + " ");
//
//	            int c = a + b;
//	            a = b;
//	            b = c;
//	        }
	    	
	    	
//	    	6. palindrome
	        
//	       System.out.println("enter the num");
//            int num = scan.nextInt();
//            
//            int original = num;
//            int reverse = 0;
//	        
//	        while(num>0) {
//	          int digit= num%10;
//	          reverse=reverse*10+digit;
//	          num=num/10;
//	          
//	        }
//	        if(original==reverse) {
//	        	System.out.println("Given number is palaindrome");
//	        }else {
//                   System.out.println("Given number is not palindrome");
//	        }
	        
	        
//	       7. amstrong 153
	        
//	        System.out.println("enter the num");
//            int num = scan.nextInt();
//            
//            int original = num;
//            int sum = 0;
//	        
//	        while(num>0) {
//	          int digit= num%10;
//	          sum=sum+(digit*digit*digit);
//	          num=num/10;
//	          
//	        }
//	        if(original==sum) {
//	        	System.out.println("Amstrong number");
//	        }else {
//                   System.out.println(" not amstrong");
//	        }
	        
	    	
//	      8.  hcf
	        
//	     System.out.println("enter 1st number");
//	     int n1 = scan.nextInt();
//	     
//	     System.out.println("enter 2nd number");
//	     int n2 = scan.nextInt();
//	     int hcf=0;
//	     int i = 1;
//	     while(i<=n1 && i<=n2) {
//	    	 if(n1%i==0 && n2%i==0) {
//	    		 hcf=i; 
//	    	 }
//	    	 i++;
//	     }System.out.println("hcf = "+hcf);
	        
	        
//	     9.  hi, hello , hihello
	        
//	        for(int i = 1; i <= 50; i++)
//	        {
//	            if(i % 3 == 0 && i % 5 == 0)
//	            {
//	                System.out.println(i+" - hihello");
//	            }
//	            else if(i % 3 == 0)
//	            {
//	                System.out.println(i+" - hi");
//	            }
//	            else if(i % 5 == 0)
//	            {
//	                System.out.println(i+" - hello");
//	            }
//	            else
//	            {
//	                System.out.println(i);
//	            }
//	            System.out.println("******************************");
//	        }
	        
	        
//	       10.	prime number
	       
//	        System.out.print("enter number");
//	        
//	        int num = scan.nextInt();
//	        boolean prime=true;
//	        
//	        int i = 2;
//	        if(num<i) {
//	        	prime=false;
//	        }
//	        else {
//	        	while(num%i==0) {
//	        		prime=false;
//	        		i++;
//	        	}
//	        }
//	         
//	       if(prime) {
//	    	   System.out.println("prime number");
//	       }else {
//	    	   System.out.println("not prime number");
//	       }
	        
	        
//	      11. posible divisers til num 
	        
//	        System.out.println("enter number");
//	        int num=scan.nextInt();
//	        
//	        int i = 2;
//	        while(i<=num) {
//	        	if(num%i==0) {
//	        		System.out.println(i);
//	        		
//	        	}
//	        
//	        	i++;
//	        }
	        
	        
//	       12. sum of 1st n odd numbers & even numbers
	        
//	        int num= 20;
//	        
//	        int i=1;
//	        int even=0;
//	        int odd=0;
//	        int count1=1;
//	        int count2=1;
//	        while(i<=100) {
//	      	if(i%2==0) {
//	               if(count1<=20) {
//	                even=even+i;
//	                count1++;
//	                
//	               }
//	        		
//	        	}else{
//	                if(count2<=20) {
//	        		odd=odd+i;
//	        		count2++;
//	        		
//	                }
//	        	}
//	        	i++;
//	        }
//	          System.out.println("even numbers = "+even);
//	        System.out.println("odd numbers = "+odd);
//	        
	        
	        
//	    13. perfect square
	        
//	        int num=scan.nextInt();
//	        
//	        int square = 0;
//	        int i = 1;
//	        while(i<=num) {
//	        	square = square+num;
//	        i++;
//	        }
//	        
//	        System.out.println("perfect square : "+square);
	        
	        
//	    14.sum of first n odd numbers and even numbrs
//	        
//	        int num = 20;
//	        
//	        int oddsum=0;
//	        int evensum=0;
//	        int i = 1;
//	        while(i<=num) {
//	        	
//	        	oddsum=oddsum+((2*i)-1);
//	        	evensum=evensum+(2*i);
//	        	i++;
//	        }
//	        System.out.println("sum of odd numbers = "+oddsum);
//	        System.out.println("sum of even numbers = "+evensum);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       }
      }
	
	
	

