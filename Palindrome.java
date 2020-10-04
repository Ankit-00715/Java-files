import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     int n=0,s=0;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int num=n;
     while(num!=0){
         int d=num%10;
         s=s*10+d;
         num/=10;
     }
     if(s==n)
    System.out.println("palindrome Number");
     else
     System.out.println("Not a palindrome Number");
    }
}
