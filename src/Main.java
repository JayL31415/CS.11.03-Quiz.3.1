public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int assertEquals) {
        if (assertEquals <= 49) {
            return 'F';
        } else if (assertEquals >= 50 && assertEquals <= 59) {
            return 'E';
        } else if (assertEquals >= 60 && assertEquals <= 69) {
            return 'D';
        } else if (assertEquals >= 70 && assertEquals <= 79) {
            return 'C';
        } else if (assertEquals >= 80 && assertEquals <= 89) {
            return 'B';
        } else if (assertEquals >= 90) {
            return 'A';
        } else {
            return 'a';
        }

    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int fbNum) {
        if (fbNum % 3 == 0 && fbNum % 5 == 0) {
            return "fizzbuzz";
        }
        if (fbNum % 3 == 0) {
            return "fizz";
        }
        if (fbNum % 5 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + str + firstTwoChars;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int num1, int num2, int num3) {
        return num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1;

    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String firstPart = str.substring(0, str.length() - 3);
            String lastPart = str.substring(str.length() - 3);
            return firstPart + lastPart.toUpperCase();
        }
    }


    }

