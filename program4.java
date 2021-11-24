import java.util.*;
public class Problem4
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=0;
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
	  
	   a[i]=sc.nextInt();
	  }
	  for(int i=0;i<a.length;i++){
	     System.out.print(a[i]+",");	
		 
		 }  
		 System.out.println();
	for(int i=0;i<a.length;i++){
	  if(a[i]%1==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("[1:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%2==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("2:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%3==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("3:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%4==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("4:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%5==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("5:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%6==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("6:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%7==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("7:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%8==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("8:"+ count+","); 
	count=0;
	for(int i=0;i<a.length;i++){
	  if(a[i]%9==0)
	  {
	  count=count+1;
	  }
	  
	}	System.out.print("9:"+ count+"]"); 
	  }
	  }
