public class Main {

        static MyLogger myLogger = new MyLogger("Main");

        public static boolean refactoredCheckIfPalindromeHelper(String str){
            if(str == null){
                myLogger.log(MyLogger.Level.ERROR,"String is null in the refactoredCheckIfPalindrome");
                return false;
            }
            str = str.toLowerCase();
            char[] strToArray = str.toCharArray();
            char[] strToArrayReversed = new char[strToArray.length];

            for (int i = strToArray.length - 1, j = 0; i >= 0; i--, j++) {
                strToArrayReversed[j] = strToArray[i];
            }
            String reversedStr = new String(strToArrayReversed);
            return reversedStr.equals(str);
        }
        public static void refactoredCheckIfPalindrome(String str){
            myLogger.log(MyLogger.Level.ERROR, "checkIfPalindrome was called");
            try {
                boolean result = refactoredCheckIfPalindromeHelper(str);
                if (!result) {
                    myLogger.log(MyLogger.Level.INFO, "Not a palindrome: " + str);
                    return;
                }
                myLogger.log(MyLogger.Level.INFO, "The word IS a palindrome: " + str);
            } catch (Exception e) {
                myLogger.log(MyLogger.Level.ERROR, "Something went wrong in checkIfPalindrome");
            }
        }


    public static void checkIfPalindrome(String str){
        myLogger.log(MyLogger.Level.INFO," checkIfPalindrome was called");
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

    public static void testLogger() {
        MyLogger logger = new MyLogger("LoggerTester");

        logger.log(MyLogger.Level.INFO, "This is an info message.");
        logger.log(MyLogger.Level.DEBUG, "This is a debug message.");
        logger.log(MyLogger.Level.ERROR, "This is an error message.");
    }



    public static void main(String[] args){
        String str = "DanCutasevici";
        checkIfPalindrome(str);
        refactoredCheckIfPalindrome(str);
        testLogger();
    }
}