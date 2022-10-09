package IndianRailways;
import java.io.*;
public class IndianRailways extends A{
	public static void main(String args[]) throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
	 
	    
	    for(int i=1;i<4;){
			System.out.print("Enter Username: ");
			user = in.readLine();
			System.out.print("Enter Password: ");
			password = in.readLine();
	    
	    	//"available[]" is the SEAT AVAILABLE//
			//store 20 seats every destination [1-5]//
	    	for(int o=1; o<=5; o++){
	    		available[o]=20;
	  		}
	    
	    	//if user and password are correct proceed to MAIN MENU//
	    	if(user.equals("1") && password.equals("1")){
	    	
	    		for(int x=1; x==1;){
	    			//the MAIN MENU//
	    			System.out.println("****************");
	    			System.out.println("* RAILWAY RESERVATION SYSTEM   *");
	    			System.out.println("****************");
	    			System.out.println("* [1] Destination                   *");
	    			System.out.println("* [2] Passengers                    *");
	    			System.out.println("* [3] Billing                       *");
	    			System.out.println("* [4] View                          *");
	    			System.out.println("* [5] Food_Order                    *");
	    			System.out.println("* [6] Exit                          *");
	    			System.out.println("*************");
	    			System.out.println("*************\n");
	    	
	    			for(x=1; x==1;){
						System.out.print("ENTER CHOICE: ");
						choice=in.readLine();
						
						//if CHOICE is "1" display the DESTINATION//
						if (choice.equals("1")){
				journey j=new journey();
				System.out.println(j instanceof journey);
				 
						}
						
						//if CHOICE is "2" proceed to Ticket Booking//
						else if (choice.equals("2")){
							A p=new Passenger();
							p.Passenger1();
							System.out.println(p instanceof Passenger);
						}
						
						else if (choice.equals("3")){
				          
				            A f=new Fare();
				            f.Fare1();
				            System.out.println(f instanceof Fare);
				            
						}
						
						else if (choice.equals("4")){
							
							A t=new Ticket();
							t.Ticket1();
							System.out.println(t instanceof Ticket);
	
						}		
                        else if (choice.equals("5")){
							
							Food_Order f=new Food_Order();
							f.getFood();
							System.out.println(f instanceof Food_Order);
							
							
	
						}		
						
						else if(choice.equals("6")){
							A e =new Exit();
							e.Exit1();
							System.out.println(e instanceof Exit);
							
						}
					
						else{
							System.out.println("Invalid Input!");
							x=1;
						}
	    			
	    	
	    			for(y=1; y==1;){
	    				if(end==1){
	    					break;
	    				}
	    				System.out.print("Do you want another transaction? [Y/N]: ");
	   				 	yn = in.readLine();
	    	
	    				if (yn.equalsIgnoreCase("y")){
	    					x=1;
	    					y=0;
	    				}
	    				else if (yn.equalsIgnoreCase("n")){
	    					System.out.println("\nThank You!!!");
	    					x=0;
	    					break;
	    				}
	    				else{
	    					System.out.println("Invalid Input!!!");
	    					y=1;
	    				}
	    			}
	    			}
	    		}
	    		i=4;
	    	}
	    	else{
	    		System.out.println("\nInvalid user or password!\n");
	    		i++;
			}
		
	    }
	    
	    }
	    
	}
