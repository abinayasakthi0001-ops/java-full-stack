
public class salem
{
	public static void main(String[] args) {
		
		assignment operators
        studnt 500,buy books 120 minus
         int s = 500;
         s-=120;
          System.out.println("remaining amnt = "+s);
          
		
		compny bonus 2000, updated salary 
        int s = 23000;
         s+=2000;
          System.out.println("updated salary = "+s);
		
		
		water tank 100l,20l added 
      int t = 100;
      t+=20;
        System.out.println("final total amnt = "+t);
		
		
		mobile battery 80%, 15% minus
      int b = 80;
      b-=15;
        System.out.println("remaining battery = "+b+("%"));
		
		
		
		stdnt doubles savings 1500
        int s = 1500;
        s*=2;
         System.out.println("after doubles of his savings = "+s);
		
		
		
	    LOGICAL OPERATOR TASKS
        
        stdnt attend exam  atendence and fees 
        int a = 78;
        String f = "paid";
         System.out.println((a>=75)&&(f=="paid"));
          System.out.println("student can attend the exam");
		
		
		
		user login email,passwrd
      String u = "abinnn";
      String p = "1234";
        System.out.println((u=="abi")||(p=="1234"));
		 System.out.println("user can login");
		
		
		
		
		 person movie age 18, ticket 
         int a = 30;
         String t = "ticket available";
          System.out.println((a>=18)&&(t=="ticket available"));
		 System.out.println("person can enter movie theatre");
		
		
		num lies between 1 - 100
		int num = 65;
		System.out.println((num>=1)&&(num<=100));
		System.out.println("65 lies between 1 to 100");
		
		
		stdnt cleared aptitde, technical round
          String a = "cleared";
          String t = "not cleared";
          System.out.println((a=="cleared")&&(t=="cleared"));
    	    System.out.println("stdnt connot gets placement");	
		
		
		
		
		BITWISE OPERATOR 
      And  2 numbers 
      int a =76;
      int b = 56;
       
         128     64    32     16     8     4     2     1
76-->    0        1     0      0     1     1     0     0 
56-->    0        0     1      1     1     0     0     0 
      
         0        0     0      0     1     0     0     0    <--8
		
		System.out.println(a&b);
		
		
		    
		OR TWO NUMBERS 
      int a = 65;
      int b = 98;
          128     64    32     16     8     4     2     1
65-->         0      1     0       0     0      0     0     1
98-->         0      1    1        0     0      0     1      1
              0      1     1       0     0      0      1     1       <--99
		
		System.out.println(a|b);
		
		
		XOR two numbers 
		int a = 47;
		int b = 87;
          128     64    32     16     8     4     2     1
47-->       0       0     1      0     1     1     1      1  		
87-->       0       1     0      1     0     1     1      1 		     
		    0       1     1      1     1      0    0      0      <--120
		System.out.println(a^b);
		
		
		left shift bitwise 
         int a = 56;
         int b = 76;
         System.out.println(a<<b);
		
		
		right shift bitwise 
      int a = 54;
      int b = 3;
      System.out.println(a>>b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
