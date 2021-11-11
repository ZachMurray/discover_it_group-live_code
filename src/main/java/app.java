import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class app {

    public static void main(String[] args) {
        System.out.println(isPalindrome("isPalindrome"));
        System.out.println(isPalindrome("qwertytrewq"));
        System.out.println(writeFibonacci().toString());
    }

    public static boolean isPalindrome(String inputString) {
        int halfpoint = inputString.length()/2;
        String inputStringFront = inputString.substring(0, halfpoint+1);
        String inputStringBackReverse = new StringBuilder(inputString.substring(halfpoint, inputString.length())).reverse().toString();
        if (inputStringFront.equals(inputStringBackReverse))
            return true;
        return false;
    }

    public static List<BigInteger> writeFibonacci() {
        return writeFibonacci(0, 1, 60);
    }

    private static List<BigInteger> writeFibonacci(int startNumber1, int startNumber2, int count) {
        List<BigInteger> returnList = new ArrayList<BigInteger>();
        returnList.add(BigInteger.valueOf(startNumber1+startNumber2));
        returnList.add(BigInteger.valueOf(startNumber2).add(returnList.get(0)));

        for (int i=returnList.size()-1; i<count; i++)
            returnList.add(returnList.get(i-1).add(returnList.get(i)));
        return returnList;
    }

}
