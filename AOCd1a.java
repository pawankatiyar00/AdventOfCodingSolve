/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AOCd1a
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0,a=0;
		while((c=System.in.read())!=-1){
			if((char)c=='(')a++;
			else if((char)c==')')a--;
		}
		System.out.println(a);
	}
}
