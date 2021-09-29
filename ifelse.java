package loop;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int bacardi=210;
		int vodka=180;
		int cost;
		Scanner input=new Scanner(System.in);
        System.out.print("enter your cost:");
        cost=input.nextInt();
        if(cost>=180 && cost<210) 
        	System.out.println("you can buy the vodka");
        	
        else if(cost>=210)
        	System.out.println("you can buy the bacardi or something else");
        
        else
        	System.out.println("you doesn't have enough money to buy alcohols....");
        
	}

}
