package eclipseDemo;

import java.util.Scanner;

public class MainSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four integer value");
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int small=w;
		if(x<small)
			small=x;
		if(y<small)
			small=y;
		if(z<y)
			small=z;
 System.out.println("the smallest value is: "+small);
	}

}
