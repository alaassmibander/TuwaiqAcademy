import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// Exercise 1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if ((i % 5 == 0)) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }


// Exercise 2
                  String l = s.nextLine();
                  for (int i = l.length() - 1; i >= 0; i--) {
                      System.out.print(l.charAt(i));
                  }


// Exercise 3
                    System.out.print("please enter a positive integer : ");
                    int l = s.nextInt();
                    if (l > 0) {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println("the multiplication table is :" + (l * i));
                        }
                    } else System.out.println("please only positive numbers !");


// Exercise 4
                  System.out.print("please enter a number : ");
                  int u = s.nextInt();
                  int vic = 1;
                  for (int i = 1; i <= u; i++) {
                      vic = vic * i;

                  }
                  System.out.print(vic);


// Exercise 5
                 int u = s.nextInt();
                 int k = s.nextInt();
                 int o = 1;
                 for (int i = 1; i <= k; i++) {
                     o = o * u;
                 }
                 System.out.print(o);


// Exercise 6
                 int i=s.nextInt();
                 int sumO=0;
                 int sumE=0;

                  while(i!=-1){
                   if(i%2==0){
                       sumE+=i;
                   }else sumO+=i;
                   i=s.nextInt();
                  }
                  System.out.print("the sum of even numbers : "+ sumE+"\n the sum of odd numbers : "+ sumO) ;


// Exercise 7
                 System.out.print("please enter a positive integer : ");
                 int num = s.nextInt();
                 if (num > 0) {
                     boolean flag = false;
                     for (int i = 2; i <= num / 2; ++i) {
                         // condition for non prime number
                         if (num % i == 0) {
                             flag = true;
                             break;
                         }
                     }
                     if (!flag) System.out.println(num + " is a prime number.");
                     else System.out.println(num + " is not a prime number.");

                 } else System.out.print("please enter a positive integer!!");


// Exercise 8
                 int num, pov = 0, neg = 0, zer = 0;
                 char c;
                 do {
                     System.out.print("Please enter a number : ");
                     num = s.nextInt();
                     if (num >= 0) {
                         if (num > 0) {
                             pov++;
                         } else zer++;
                     } else neg++;
                     System.out.print("Enter y to continue :");
                     c = s.next().charAt(0);
                 } while (c == 'y');
                 System.out.println("Positive numbers: " + pov + "\nNegative numbers: " + neg + "\nZero numbers: " + zer);


// Exercise 9
                 for (int i = 1; i <= 4; i++) {
                     System.out.println("Week " + i);
                     for (int j = 1; j <= 7; j++) {
                         System.out.println("Day" + j);
                     }
                 }


// Exercise 10
                 System.out.print("please enter a word :");
                 String f = s.nextLine();
                 String l = "";
                 for (int i = f.length() - 1; i >= 0; i--) {
                     l += f.charAt(i);
                 }
                 if (f.equals(l)) {
                     System.out.print("the word is palindrome ");
                 } else System.out.println("the word is not palindrome");
    }
}
