import java.util.*;

public class Problem3
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();

   if(a%2!=0)
   {
   for(int i=1;i<=2*a;i++)
   {
     if(i%2!=0)
	 {
	 System.out.print(i+",");}
   }
   }
   else
   {
     for(int j=1;j<2*a-1;j++)
	 {
	 if(j%2!=0){
	 System.out.print(j+",");}
  }
 }
 }
 }
 
