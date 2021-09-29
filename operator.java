

package loop;
import java.util.Scanner;
public class operator {

	public static void main(String[] args) {
//		Arithmatic operator
//		+ addition
//		- Sub
//		* mul
//		/ div
//		% mod 
//		++ inc
//		-- Dec

	int a=10,b=5,c;
	// c=a%b;
	
	// System.out.println(c);
	
//	Assignment operator
//	
//	=
//	+=
//	-=
//	*=
//	/=
//	%=
//	&=
//	!=
//	|=
//	>>=
//	<<=
//	^=
	// a 10 b 5
	a+=b;
	System.out.println(a);
		
//	comparission operator
//	
//	==
//	!=
//	>
//	<
//	<=
//	>=
	
	System.out.println(a<=b);
	
//	Logical operator
//	
//	&&
//	||
//	!

	//	int date=10;
//	byte age=18;
//	System.out.println(date!=10 && age<=18);
	
	
	String citizenship;
	String name;
	String virgin;
	String sex;
	int age;
	
	
	Scanner input=new Scanner(System.in);
	System.out.print("enter your Name:");
	name=input.nextLine();
	System.out.print("enter your Virgin:");
	virgin=input.nextLine();
	System.out.print("enter your Sex:");
	sex=input.nextLine();
	System.out.print("enter your citizenship:");
	citizenship=input.nextLine();
	System.out.print("enter your Age:");
	age=input.nextInt();
	System.out.println(citizenship.equals("indian") && age>=18);
	
	}
	

}




	
	
	
	