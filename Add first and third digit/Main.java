import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int a=num1%10;
      int num=num1/100;
      System.out.println(a+num);
        
	}
}