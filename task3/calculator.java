package Calculator;
import java.util.*;
public class calculator {
	public static void main(String [] args) {
		System.out.println("welcome to simple calculator of two numbers");
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter first digit: ");
			double a=s.nextDouble();
			System.out.println("Enter second digit: ");
			double b=s.nextDouble();
			System.out.println("enter operators in [+, -, *, /, %]\n e for exit\n");
			System.out.println("Enter an Arithmetic Operator");
			char o=s.next().charAt(0);
			
			switch(o) {			
						
			case '+':	Addition add=new Addition();
						System.out.println("Result= "+add.operation(a, b));
						break;
			case '-':	Subtraction sub=new Subtraction();
						System.out.println("Result= "+sub.operation(a, b));
						break;
			case '*':	Multiplication mul=new Multiplication();
						System.out.println("Result= "+mul.operation(a, b));
						break;
			case '/':	Division div=new Division();
						if (b==0)
							System.out.println("Second digit can't be Zero");
						else
							System.out.println("Result= "+div.operation(a, b));
						break;
			case '%':	Modulus mod=new Modulus();
						if (b==0)
							System.out.println("Second digit can't be Zero");
						else
							System.out.println("Result= "+mod.operation(a, b));
						break;
			case 'e':   System.out.println("you are exited");
						return;
			default:	System.out.println("Enter valid operator");
						break;
			}
			
		}
	}

}