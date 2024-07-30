import java.util.Scanner;
public class Currency{
public static void main(String[]args)
{
int curr;
System.out.println("Enter the Currency:");
Scanner s=new Scanner(System.in);
curr=s.nextInt();
curr=curr%2000;
System.out.println(curr);
curr=curr%1000;
System.out.println(curr);
curr=curr%500;
System.out.println(curr);
curr=curr%200;
System.out.println(curr);
curr=curr%100;
System.out.println(curr);
curr=curr%50;
System.out.println(curr);
curr=curr%20;
System.out.println(curr);
curr=curr%10;
System.out.println(curr);
curr=curr%5;
System.out.println(curr);
curr=curr%2;
System.out.println(curr);
curr=curr%1;
System.out.println(curr);
}
}
