package interviewPrep;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Predicate<T> - it takes one argument and returns boolean value test(T t)
// Function<T,R> - it takes one argument and returns some output apply(T t)
// Consumer<T t> -  it takes one argument and returns nothing accept(T t)
// Supplier<T> -  it  does not take any argument but returns a value get()

//centegy technologies test question
//    static void reverseString(){
//
//        String name = "this is a test";
//
//        String sb = "";
//        for(int i=name.length()-1; i>=0; i--){
//           sb = sb + name.charAt(i);
//
//        }
//        System.out.println(sb);
//    }

public class InterviewLogicalQuestions1 {

    public static void main(String[] args) {










        // remove duplicates (avanza interview question)
//        int[] array = {1,1,2,2,2,3,4,4,5,5,5,5,5};
//
//
//        System.out.print("unique value: ");
//        for (int i=0; i<array.length; i++){
//            boolean isTrue = true;
//            for (int j= 0; j<array.length; j++){
//
//                if (i != j && array[i] == array[j]){
//                    isTrue = false;
//                    break;
//                }
//
//            }
//           if (isTrue){
//               System.out.println(array[i]);
//           }
//        }


        // Remove duplicates
        //int count1=0;
//        int[] arr = {2,4,2,5,3,1,3,1,7};
//        for (int i=0; i< arr.length; i++){
//            boolean isTrue = true;
//        for (int j=0; j< arr.length; j++){
//
//            if (arr[j] == arr[i] && i != j) {
//                isTrue = false;
//                break;
//            }
//
//
//    }
//        if (isTrue)
//            System.out.println(arr[i]);
//
//
//}
//        System.out.println("duplicates: "+count1);


        //print duplicates
//        int count = 0;
//        int[] array = {2,2,4,5,3,3,1};
//        for (int i=0; i< array.length; i++){
//            for (int j=i+1; j < array.length; j++){
//                if (array[j] == array[i] && i != j){
//                    count++;
//                    System.out.println(array[i]);
//                    break;
//                }
//            }
//
//        }
//        System.out.println("duplicates: "+count);


//int count =0;
//char[] vowels = {'a', 'e' , 'i' , 'o', 'u'};
//
//        String s1 = "salman".toLowerCase();
//for (int i=0; i<s1.length()-1; i++){
//    for (char vow : vowels){
//        if (s1.charAt(i) == vow){
//            count++;
//
//        }
//
//    }
//    System.out.println(vowels[i]);
//}
//        System.out.println(count);





//         2nd highest
//        int[] arr = {2,3,4,5,6,7,8,9,10};
//        System.out.print("prime numbers: ");
//        int[] arr = {100, 85, 90, 60, 75, 95, 70, 65, 80, 55};
//        int first_highest = 0, second_highest = 0, high=0;
//
//
//
//        System.out.print("Array: ");
//        for (int num : arr){
//            System.out.print(num + " ");
//            if (num > first_highest){
//                first_highest = num;
//
//            }
//        }
//        System.out.println();
//        System.out.println("1st highest number in the array: " + first_highest);
//       // int[] arr = {100, 85, 90, 60, 75, 95, 70, 65, 80, 55};
//
//        for (int num1 : arr) {
//
//          System.out.println(num1);
//            if (num1 == first_highest)
//                 {
//                     continue;
//                 }
//
//          if (num1 > second_highest)
//                second_highest = num1;
//
//
//        }
//
//        if (second_highest < first_highest){
//            high = second_highest;
//            System.out.println("2nd highest number in the array: " + high);
////        }
//
//
//        // palindrome string
//        String s1 = "racecar";
//        s1 = s1.toLowerCase();
//        String s2 = "";
//
//
//        boolean isPalindrome = true;
//
//        for (int i = 0; i < s1.length() / 2; i++) {
//            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome)
//            System.out.println("palindrome");
//        else
//            System.out.println("not palindrome");
//
//        boolean found = false;
//        System.out.print("Non-repeating character: ");
//        for (int i = 0; i < s1.length(); i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < s1.length(); j++) {
//                if (i != j && s1.charAt(i) == s1.charAt(j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                System.out.print(s1.charAt(i) + " ");
//                found = true;
//            }
//
//        }
//








        // First non - repeating character in the string
        //String s = "google"; // Expected output - l
//        s = s.toLowerCase();
//
//        for (int i = 0; i < s.length(); i++) {
//            boolean status = true;
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    status = false;
//                    break;
//
//                }
//
//            }
//            if (status) {
//                System.out.println(s.charAt(i));
//                return;
//            }
//        }


//
//        String s1 = "Java is simple";
//        int count = 0;
//
//        String[] words = s1.split(" ");
//        System.out.println(words.length);
//
//        for (int i=0; i<s1.length(); i++){
//            if (s1.charAt(i) != ' ') {
//                count++;
//            }
//        }
//        System.out.println("characters in the string: " + count);
//
//        for (String s : words){
//            System.out.println(s);
//        }
//
//        int num = 9;
//        boolean status = true;
//
//
//
//            for (int i=2; i <= num/2; i++){
//                if (num % i == 0){
//                    System.out.println("not prime");
//                    status = false;
//                    break;
//                }
//            }
//            if (status){
//                System.out.println("prime");
//            }




        // Armstrong number & palindrome number.
//        int num = 153;
//        int sum = 0;
//        int digit = 0;

//        for (int i = num; i>0; i/=10){
//            digit = i % 10;
//            sum += digit * digit * digit; -> for armstrong
//            sum = sum * 10 + digit ; //-> for palindrome
//        }
//        System.out.println(num == sum ? "armstrong" : "not armstrong");
//        System.out.println(num == sum ? "palindrome" : "not palindrome");
//
//
//
//        int i, j,temp;
//        int[] num = {77,23,12,87,34,90};
//        for (i = 0; i < num.length; i++) {
//            for (j = 0; j < i; j++) {
//                if (num[i] < num[j]) {
//                    temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(num));


          // swapping two values without using third variable
//        int a = 2;
//        int b = 3;
//        a = a+b;
//        b = a-b;
//        a = a-b;



        //fibonacci series
//        int first=0, second=1,temp;
//        for (int i=1; i<=5; i++){
//            System.out.print(first + " ");
//            temp = second;
//            second = first + temp;
//            first = temp;

//            temp = first + second;
//            second = first;
//            first = temp;
//        }
    }
    }


