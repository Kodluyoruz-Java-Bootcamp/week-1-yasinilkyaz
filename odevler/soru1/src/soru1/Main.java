package soru1;

public class Main {

    /**
     * Is palindrome boolean.
     * Palindrom kontrolü eden method.
     * @param number the number
     * @return the boolean
     */
    public static boolean isPalindrome(Long number) {
        StringBuilder reversed = new StringBuilder();
        String s = number.toString();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reversed.insert(0, ch);
        }
        return s.equals(reversed.toString());
    }


    /**
     * Recursive palindrome counter long.
     * Bu method return olarak kendini çağırarak bir döngü içerisinde if koşulu doğru ise
     * sonuçlara göre palindrom çıktısını sağlıyor.
     * @param number      the number
     * @param counter     the counter
     * @param firstNumber the first number
     * @return the long
     */
    public static long recursivePalindromeCounter(long number, long counter,int firstNumber) {
        if (isPalindrome(number)) {
            System.out.println("Bu sayıda="+firstNumber+", "+counter+". tekrarinda bulunan polindrom sayısı= "+number);
            return number;
        }
        return recursivePalindromeCounter(number + reverseNumber(number), counter + 1,firstNumber);
    }

    /**
     * Reverse number long.
     * Methodda gelen long ifadeyi string'e çeviriyor ve ters çevirip değeri geriye döndürüyor.
     * @param number the number
     * @return the long
     */
    public static long reverseNumber(Long number) {
        StringBuilder reversed = new StringBuilder();
        String s = number.toString();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reversed.insert(0, ch);
        }
        return Long.parseLong(reversed.toString());

    }

    public static void main(String[] args) {
        int lowerBound = 10;
        int upperBound = 100;

        for (int i = lowerBound; i <= upperBound; i++) {
            long count = recursivePalindromeCounter(i, 0,i);

        }

    }

}
