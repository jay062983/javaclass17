package class17;

public class Task3 {
    public static void main(String[] args) {
        /*3) Create a method that will accept a
        String as a parameter and return a new String that consist only of vowels.
        Method should be available inside the class only where it was declared and executed by calling it is name.
        return type=> String
        name=>getOnlyvowels
        parameters=>String inputStr
         */

        System.out.println(getOnlyVowels("Adam"));
    }
   private static String getOnlyVowels(String inputStr){
        // vowels=> aeiouy
        //Adam
        return inputStr.replaceAll("AEIOUYaeiouy","");
    }
}
