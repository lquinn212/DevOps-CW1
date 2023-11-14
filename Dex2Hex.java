import java.util.InputMismatchException;
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int inputDecimal;

        try {
            inputDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input is invalid. Please enter a decimal value.");
            scanner.nextLine();
            inputDecimal = scanner.nextInt();
        }


        Arg1 = Integer.parseInt(args[inputDecimal]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");


        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

} }


