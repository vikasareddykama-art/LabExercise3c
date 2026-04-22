package demo;

//3c. String Exercise Programs (Q6–Q10)

import java.util.Random;

public class StringExercises3c {

 public static void main(String[] args) {

     String str1 = "hello world from java";
     String str2 = "This is a very long sentence for testing";
     String str3 = "123456";
     int length = 8;
     String str4 = "Java is fun to learn";

     // Q6
     System.out.println("Q6: capitalizeWords -> " + capitalizeWords(str1));

     // Q7
     System.out.println("Q7: truncate -> " + truncate(str2, 20));

     // Q8
     System.out.println("Q8: isNumeric -> " + isNumeric(str3));

     // Q9
     System.out.println("Q9: generateRandomString -> " + generateRandomString(length));

     // Q10
     System.out.println("Q10: countWords -> " + countWords(str4));
 }

 // Q6: Capitalize first letter of each word
 public static String capitalizeWords(String str) {
     String[] words = str.split(" ");
     String result = "";

     for (String w : words) {
         result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
     }
     return result.trim();
 }

 // Q7: Truncate string with ellipsis
 public static String truncate(String str, int length) {
     if (str.length() <= length) {
         return str;
     }
     return str.substring(0, length) + "...";
 }

 // Q8: Check if numeric
 public static boolean isNumeric(String str) {
     return str.matches("\\d+");
 }

 // Q9: Generate random string
 public static String generateRandomString(int length) {
     String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     StringBuilder result = new StringBuilder();
     Random rand = new Random();

     for (int i = 0; i < length; i++) {
         result.append(chars.charAt(rand.nextInt(chars.length())));
     }
     return result.toString();
 }

 // Q10: Count number of words
 public static int countWords(String str) {
     String[] words = str.trim().split("\\s+");
     return words.length;
 }
}