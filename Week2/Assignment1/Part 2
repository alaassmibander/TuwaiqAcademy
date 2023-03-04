import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("please enter the size eo the array :");
            int x = s.nextInt();
            int[] num = new int[x];
            System.out.println("please enter the operation you want :");
            System.out.println("To add an element to the array enter (1)");
            System.out.println("To display the array enter (2)");
            System.out.println("To search for an element in the array enter (3)");
            System.out.println("To sort the the array enter (4) : ");
            int y = s.nextInt();
            if (y == 1) {
                System.out.print("please fill the elements of the array: ");
                for (int i = 0; i < num.length; i++) {
                    num[i] = s.nextInt();
                }
            } else if (y == 2) {
                System.out.print(Arrays.toString(num));

            } else if (y == 3) {
                System.out.print("please enter the number you want to search for :");
                int d = s.nextInt();
                for (int i = 0; i < num.length; i++) {
                    if (num[i] == d)
                        System.out.println("we found the number on the index : " + i);

                     else System.out.print("we did not find the number ");

                }
            } else if (y == 4) {
                Arrays.sort(num);
            }
        }catch (InputMismatchException e){
            System.out.println(" INPUT IS NOT AN INTEGER  !!");
        }
        catch (NegativeArraySizeException e){
            System.out.println("ONLY POSITIVE INTEGERS ARE ACCEPTED ");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
