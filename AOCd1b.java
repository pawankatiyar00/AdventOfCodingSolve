/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AOCd1b
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0,pos=0,a=0;
		while((c=System.in.read())!=-1){
			pos++;
			if((char)c=='(')a--;
			else if((char)c==')')a++;
			if(a==1) break;
		}
		System.out.println(pos);
	}
}
