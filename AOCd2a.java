/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AOCd2a
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String str;
		String ar[];
		int a=0,b=0,c=0,sum=0,small=0;
		while(sc.hasNextLine()){
			str=sc.nextLine();
			ar=str.split("x");
			a=Integer.parseInt(ar[0]);
			b=Integer.parseInt(ar[1]);
			c=Integer.parseInt(ar[2]);
			if(a*b<b*c && a*b<c*a) small=a*b;
			else if(b*c<c*a) small=b*c;
			else small=c*a;
			
			sum=sum+2*(a*b+b*c+c*a)+small;
			//System.out.println(Arrays.toString(ar));
		}
		System.out.println(sum);
	}
}
