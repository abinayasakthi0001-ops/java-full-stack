package Abinnn;

public class Abi {
   public static void main(String[] args) {
	   
	 //   1 2 3 4 5 increment 
	   
	 //   for(int i = 1;i<=5;i++) {
		//    System.out.print(i+" ");          <--- 1 2 3 4 5
	 //   }


	   
  // num in vertical increment                <--- 1
  //                                               2
  //    for(int i = 1;i<=5;i++) {                  3
  //  	  System.out.println(i+" ");               4
  //    }                                          5
   
   
  // decrement num hori                     <--  5 4 3 2 1
  
	 //  for(int i = 5;i>=1;i--) {
		//   System.out.print(i+" ");
	 //  }
   
   
  // dcrement num vert                      <---      5
	 //                                               4
	 //   for(int i = 5;i>=1;i--) {                   3
		//    System.out.println(i+" ");              2
	 //   }                                           1
   

	   
  //   square with same num                   <--     1 1 1 1 1
  //                                                  2 2 2 2 2
	 //    for(int i = 1;i<=5;i++) {                  3 3 3 3 3
	 //    	for(int j = 1;j<=5;j++) {                 4 4 4 4 4
	 //    		System.out.print(i+" ");              5 5 5 5 5
	 //    	}System.out.println();
	 //    }


	   
  // square with diff num                <--    1 2 3 4 5
  //                                            1 2 3 4 5
  //  for (int i =1;i<=5;i++) {                 1 2 3 4 5
  //   	for(int j = 1;j<=5;j++) {               1 2 3 4 5
  //  		System.out.print(j+" ");            1 2 3 4 5
  //  	}System.out.println();
  //  }
   

	   
  // sqaure in *                            <---          * * * * *
  //                                                      * * * * *
  // for(int i = 1;i<=5;i++) {                            * * * * *
	 //   for(int j = 1;j<=5;j++) {                       * * * * *
		//    System.out.print("*"+" ");                  * * * * *
	 //   }System.out.println();
  // }
   

	   
	 //   half pyramid                           <--  *
	 //                                               * *
	 //   for(int i = 1;i<=5;i++) {                   * * *
		//    for (int j = 1;j<=i;j++) {              * * * *
		// 	   System.out.print("*"+" ");             * * * * *
		//    }System.out.println();
	 //   }
   

	   
  // inverted half pyramid                    <--    * * * * *
  //                                                 * * * *
  // for (int i = 1;i<=5;i++) {                      * * * 
	 //   for(int j = 5;j>=i;j--) {                  * * 
		//    System.out.print("*"+" ");             *
	 //   }System.out.println();
  // }
   

	   
  // inverted hollow pyramid                      <-- * * * * *
  //                                                  *     *
  // for(int i = 1;i<=5;i++) {                        *   *
	 //   for (int j = 5;j>=i;j--) {                  * * 
		//    if((i==1)||(j==5)||(i==j)) {            *
		// 	   System.out.print("*"+" ");
		//    }else {
		// 	   System.out.print(" "+" ");
		//    }
	 //   }System.out.println();
  // }


	   
	   //    	hollow half pyramid in num           <---     *
//                                                            * *
//    	for(int i = 1;i<=5;i++) {                             *   * 
//       	 for(int j = 1;j<=i;j++) {                        *     *
//       		                                              * * * * *
//       		if((j==1)||(j==i)||(i==5)) {
//                System.out.print("*"+" ");
//       		 }else {
//       			System.out.print(" "+" ");
//       		 }
//       	 }System.out.println();
//        }


	   
  // full pyramid                         <--                      *
  //                                                             * * *  
  // for(int i = 1;i<=5;i++) {                                 * * * * * 
	 //   for(int j= 5;j>=i;j--) {                           * * * * * * * 
		//    System.out.print(" "+" ");                    * * * * * * * * *
	 //   }
	 //   for(int j = 1;j<=i;j++) {
		//    System.out.print("*"+" ");
	 //   }
	 //   for(int j = 1;j<=i-1;j++) {
		//    System.out.print("*"+" ");
	 //   }
	 //   System.out.println();
  // }


	   
	 //   inverted full pyramid               <--    * * * * * * * * *
  //                                                   * * * * * * *
  // for(int i = 1;i<=5;i++) {                           * * * * * 
	 //   for(int j = 1;j<=i;j++) {                        * * * 
		//    System.out.print(" "+" ");                     *
	 //   }
	 //   for(int j =5;j>=i;j--) {
		//    System.out.print("*"+" ");
	 //   }
	 //   for(int j =5;j>=i+1;j--) {
		//    System.out.print("*"+" ");
	 //   }
	 //   System.out.println();
  // }

	   

	   // HOLLOW FULL PYRAMID
    	
//    	for(int i = 1;i<=5;i++) {                       <--      *
//    	 	for(int j= 5;j>=i;j--) {                           *   * 
//                System.out.print(" "+" ");                 *       *     
//    	                                                  *            *
//    		for (int j=1;j<=i-1;j++) {                   * * * * * * * * *
//    			if((j==1)||(i==5)){
//    				System.out.print("*"+" ");
//    			}else {
//    				System.out.print(" "+" ");
//    			}
//    	}
//    		for(int j = 1;j<=i;j++) {
//    		if((i==5)||(j==i)) {
//    			System.out.print("*"+" ");
//    		}else {
//    			System.out.print(" "+" ");
//    		}
//    			
//    		}System.out.println();
//    		
//    	}

	   
    	
//    	half pyramid in num                       <---- 1
//    	                                                1 2
//     for(int i = 1;i<=5;i++) {                        1 2 3
//    	 for(int j = 1;j<=i;j++) {                      1 2 3 4
//    		 System.out.print(j+" ");                   1 2 3 4 5
//    	 }System.out.println();
//     }

	   
    
//    	inverted half pyramid in num                <--- 5 4 3 2 1
//                                                       5 4 3 2 
//     for(int i =1;i<=5;i++) {                          5 4 3
//    	 for(int j = 5;j>=i;j--) {                       5 4
//    		 System.out.print(i+" ");                    5
//    	 }System.out.println();
//     }
     

	   
//    	hollow half pyramid in num                   <---     *
//                                                            * *
//    	for(int i = 1;i<=5;i++) {                             *   * 
//       	 for(int j = 1;j<=i;j++) {                        *     *
//       		                                              * * * * *
//       		if((j==1)||(j==i)||(i==5)) {
//                System.out.print("*"+" ");
//       		 }else {
//       			System.out.print(" "+" ");
//       		 }
//       	 }System.out.println();
//        }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
}
