package IndianRailways;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ticket extends A {
	void Ticket1()throws IOException
	{
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	for(int sx=1; sx<=3;){
			System.out.print("SEARCH PASSENGER'S NAME: ");
		search = in.readLine();

		   	int s=1;
			for(x=0; x<=z; x++){
				if(search.equalsIgnoreCase(ticketS[x][0])){
					System.out.println("*************");
					System.out.println("*        PASSENGER'S DETAILS        *");
					System.out.println("*************");
					System.out.println("PASSENGER'S NAME: " + ticketS[x][0]);
					System.out.println("PASSENGER'S DESTINATION : " + ticketS[x][1]);
					System.out.println("FARE PRICE: " + ticketD[x][0]);
					System.out.println("NO. OF PASSENGERS: " + ticketI[x][0]);
					System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
					System.out.println("TOTAL FARE PRICE:  " + ticketD[x][2]);
					if(ticketS[x][2].equals("x")){
						System.out.println("PAY:  " +pay[x]);
						System.out.println("CHANGE:  " +change[x]);
						System.out.println("STATUS: PAID");
					}
					else{
						System.out.println("STATUS: NOT PAID");
					}
					System.out.println("*************");
					System.out.println("*************");
					s=0;
				    sx=4;
				}
			}	
		
			
			if (s==1){
				System.out.println("Passenger's Name not found!");
				sx++;
			}
			
    	}
}
}



