package com.tns.inheritance;//hirarchial 

 class TelecomRegulatory 
 {
	 void call() 
	 {
		 System.out.println("calling");
	 }
	 void Internet()
	 {
		 System.out.println("Internet"); 
	 }
	 class Airtel extends TelecomRegulatory 
	 {
		 void paymentsBank() 
		 {
			 System.out.println("airtel payments bank");  
		 }
	 }
	 class jio extends TelecomRegulatory 
	 {
		 void jiomart() 
		 {
			 System.out.println("mart");  
		 }
	 }
	 class vodaphone extends TelecomRegulatory 
	 {
		 void vitv() 
		 {
			 System.out.println("vi tv");  
		 }
	 }
	 
	 
	 
	 
	 

}
