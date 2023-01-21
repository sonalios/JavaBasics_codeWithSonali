public class Main {

    static{
        System.out.println("Welcome");
        System.out.println("Clone");
    }
    public static void main(String[] args) {
        String inputString = "gig step";
        System.out.println("Input string to reverse is:"+inputString);
        String outputString = "";
        StringReverseFunctions stringReverseFunctions = new StringReverseFunctions();
        //reverse String using charAt()
        outputString = stringReverseFunctions.reverseUsingCharAt(inputString);
        System.out.println("Reverse of a string using charAt method is:"+ outputString);
        //reverse string using StringBuilder
        outputString = stringReverseFunctions.reverseUsingStringBuilder(inputString);
        System.out.println("Reverse of a string using StringBuilder is:"+ outputString);
        //reverse string using StringBuffer
        outputString = stringReverseFunctions.reverseUsingStringBuffer(inputString);
        System.out.println("Reverse of a string using StringBuffer is:"+ outputString);
        //reverse string using recursion
        outputString = stringReverseFunctions.reverseUsingRecursion(inputString);
        System.out.println("Reverse of a string using recursion is:"+ outputString);

        //Swap Numbers  using Third variable
        int num1 = 10;
        int num2 = 5;
        int num3;
        System.out.println("Numbers before swap are:\n Num1:"+ num1+"\nNum2:"+num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Numbers after swap are:\n Num1:"+ num1+"\nNum2:"+num2);


        //Swap Numbers without using Third variable
        int n1 = 2;
        int n2 = 4;
        System.out.println("Numbers before swap are:\n Num1:"+ n1+"\nNum2:"+n2);
        n1 = n2 + n1;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Numbers after swap are:\n Num1:"+ n1+"\nNum2:"+n2);
    }
}