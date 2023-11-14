import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[]) {

        Arg1 = Integer.parseInt(args[0]);
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

        int num2 = Arg1;
        int[] bin = new int[8];
        int index = 0;

        System.out.println("Converting the Value " + num2 + " to Binary...");

        while(num2 != 0)
        {bin[index++] = num%2;
            num2 /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print("Binary representation is: " + bin[i]);
        }

} }




