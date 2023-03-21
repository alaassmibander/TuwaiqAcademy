import java.util.Scanner;

public class Main {
 Scanner s= new Scanner (System.in);

    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
//   Exercise 1
         System.out.println("Please Enter Two Numbers :");
         int x = s.nextInt();
         int y = s.nextInt();
         int sum =x+y;
         int sub=x-y;
         int mult =x*y;
         int div=x/y;
         int rem=x%y;
         System.out.println("The Sum is = "+sum);
         System.out.println("The Subtract is = "+sub);
         System.out.println("The Multiply is = "+mult);
         System.out.println("The Divide is = "+div);
         System.out.println("The Remainder is = "+rem);

//  Exercise 2
         System.out.print("Please Enter a String :");
         String m =s.nextLine();
         System.out.print("the string is : "+m.toLowerCase());


//Exercise 3
        System.out.print("please enter a number : ");
        int e = s.nextInt();
        if (e % 2 == 0)
            System.out.print("1");
        else System.out.print("0");


//Exercise 4
        System.out.print("please enter your role : ");
        String r=s.nextLine();
        if(r.equals("admin"))
            System.out.print("welcome admin");
        else if (r.equals("superuser"))
            System.out.print("welcome superuser");
        else
            System.out.print("welcome user");


//Exercise 5
      System.out.print("please enter the three numbers : ") ;
      int x=s.nextInt();
      int y=s.nextInt();
      int z=s.nextInt();
      boolean e=(x+y==z);
      System.out.print("the result is : "+e);


//Exercise 6
             int x=s.nextInt();
             int y=s.nextInt();
             int z=s.nextInt();
             if(x>y&&x>z)
                 System.out.print(x);
             else if (y>x&&y>z)
                 System.out.print(y);
             else System.out.print(z);

             
//Exercise 7
        System.out.print("please enter an integer between 1 to 7 : ");
        int p = s.nextInt();
        if (p == 1)
            System.out.print("Sunday");
        else if (p == 2)
            System.out.print("Monday");
        else if (p == 3)
            System.out.print("Tuesday");
        else if (p == 4)
            System.out.print("Wednesday");
        else if (p == 5)
            System.out.print("Thursday");
        else if (p == 6)
            System.out.print("Friday");
        else if (p == 7)
            System.out.print("Saturday");


    }}
