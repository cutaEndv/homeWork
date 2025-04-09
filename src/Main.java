public class Main {

        static MyLogger myLogger = new MyLogger("Main");


    public static void checkIfPalindrome(String str){
        myLogger.log(MyLogger.Level.ERROR," checkIfPalindrome was called");
        try {


            str = str.toLowerCase();
            char temp = 0;
            char[] strToArray = str.toCharArray();
            char[] strToArrayReversed = new char[strToArray.length];
            for (int i = strToArray.length - 1, j = 0; i >= 0; i--, j++) {
                temp = strToArray[i];
                strToArrayReversed[j] = temp;
            }

            String reversedStr = new String(strToArrayReversed);
            if (!reversedStr.equals(str)) {
                String output = " Function output in if statemend reuslted to TRUE ";
                myLogger.log(MyLogger.Level.INFO, output + "It's not a palindrome " + str + " " + reversedStr);
                return;
            }
            System.out.println("The word IS a palindrome " + reversedStr + " " + str);
        }catch (Exception e) {
            myLogger.log(MyLogger.Level.ERROR,"Something went wrong in the checkIfPalindrome");
        }
    }

    public static void main(String[] args){
        String str = "DanCutasevici";
        checkIfPalindrome(str);
    }
}