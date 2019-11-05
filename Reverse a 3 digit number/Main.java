import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    a=n%10;
    int x=n/10;
    b=x%10;
    c=n/100;
    int ne=a*100+b*10+c;
    System.out.println(ne);
  }
}