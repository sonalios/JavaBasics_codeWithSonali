import com.sun.org.apache.xpath.internal.operations.Bool;

public class StringReverseFunctions {

    public void checkNullOrEmpty(String inputString){
        Boolean checkFlag = Boolean.TRUE;
        if(inputString == null){
            throw new IllegalArgumentException("Null is not a valid input String");
        }else if(inputString.isEmpty()){
            throw new IllegalArgumentException("String should not be empty to check the reverse of string");
        }

    }

    public String reverseUsingCharAt(String inputString){
        String outputString = "";
        checkNullOrEmpty(inputString);
        int len = inputString.length();
        //below for loop is started from length-1 because in java indexing starts from 0 and not 1
        for(int i = len-1;i>=0; i--){
            outputString = outputString+ inputString.charAt(i);
        }
        return outputString;
    }
    public String reverseUsingStringBuilder(String inputString){
        String outputString = "";
        checkNullOrEmpty(inputString);
        outputString = new StringBuilder(inputString).reverse().toString();
        return outputString;
    }

    public String reverseUsingStringBuffer(String inputString){
        String outputString = "";
        checkNullOrEmpty(inputString);
        outputString = new StringBuffer(inputString).reverse().toString();
        return outputString;
    }

    public String reverseUsingRecursion(String inputString){
        String outputString = "";
        checkNullOrEmpty(inputString);
        outputString = rev(inputString);
        return  outputString;
    }

    private String rev(String inputString){
        //recursion here is always take the last character in final string, then perform recursion on length of inputString- lastCharacter
        if(inputString.length() == 0){
            return " ";
        }
        return inputString.charAt(inputString.length()-1) + rev(inputString.substring(0, inputString.length() - 1));
    }
}
