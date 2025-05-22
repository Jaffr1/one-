package fsd53.str;

/*
Reverse String - use StringBuilder and use n/2 condition
Palindrome - use n/2 condition
Task
-----
Display the vowel characters and consonant count
Reverse first half only
check the given char is present or not user input
check the given String is present or not user input
print even length words
inp - india is my country and i like india
out - is my like 
 */
public class StringPro1 {
    public static void main(String[] args) {
//        stringReverse1();
//        stringReverse2();
        palindrome1();
        palindrome2();
    }

    public static void stringReverse1() {
        String original = "my name is java";
        String reverse = "";
//        for (int i = 0; i < s.length(); i++) {
        for (int i = original.length() - 1; i >= 0; i--) {
//            reverse+=original.charAt(i);
            System.out.println(reverse);
            reverse = reverse.concat(original.charAt(i) + "");
        }
        System.out.println("Original string is : " + original);
        System.out.println("Reverse string is : " + reverse);
    }

    public static void stringReverse2() {
        //swap logic
        String original = "myjava";
        String reverse = original;
        for (int i = 0; i < original.length() / 2; i++) {
            char start = original.charAt(i);
            char end = original.charAt(original.length() - i - 1);
            //now swap
        }
        System.out.println("Original string is : " + original);
        System.out.println("Reverse string is : " + reverse);
    }

    private static void palindrome1() {
        String original = "Level";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--)
            reverse = reverse.concat(original.charAt(i) + "");
        System.out.println((original.equalsIgnoreCase(reverse)) ? "Palindrome" : "Not a palindrome");
    }
    private static void palindrome2() {
        String original = "level";
        for (int i = 0; i <original.length()/2 ; i++) {
            if (original.charAt(i)!=original.charAt(original.length()-1-i)){
                System.out.println(original+" is not a palindrome");
                return;
            }
        }
        System.out.println(original+" is a palindrome");
    }
}