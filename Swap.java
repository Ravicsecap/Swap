import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.print("enter any two number:- ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before Swapping "+ a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+ a+" "+b);

	}

}
