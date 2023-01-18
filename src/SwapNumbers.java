public class SwapNumbers {

    public void swapNumbers(int num1 , int num2){
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }
}
