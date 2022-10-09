package IndianRailways;


	import java.util.Scanner;
	
	public class Food_Order extends A implements B {
	static Scanner scan= new Scanner(System.in);
int total;
	static String[] foodlist={"1) Chicken Biryani ","2) Meals","3)Chapathi","4)Vada","5)Samosa"};
	static int number;


	public  void getFood(){
	System.out.println("Please select a Food Item");
	for(int i=0;i<foodlist.length;i++){



	System.out.println(foodlist[i]);
	}
	number=scan.nextInt();
	System.out.println("Your Food Order is "+foodlist[number-1].substring(3,foodlist[number-1].length()));
	getSeats();
	}
	public  void getSeats(){
		
	System.out.println("Please Choose the Quantity of Selected Food Item");
	
	String seats=(scan.next());
	int i=Integer.parseInt(seats);
	System.out.println("Thank you,\nYou have selected "+seats+" Quantity of "+foodlist[number-1].substring(3,foodlist[number-1].length()) );
	if(number==1)
	{
		
      total=150*i;
    		  		
	}
	else if(number==2)
	{
		total=120*i;
	}
	else if(number==3)
	{
		total=60*i;
	}
	else if(number==4)
	{
		total=50*i;
	}
	else if(number==5)
	{
		total=20*i;
	}	
	else
	{
		System.out.println("Invalid choice");
	}
	System.out.println("Total Fare :"+total);
	}
	


	}

