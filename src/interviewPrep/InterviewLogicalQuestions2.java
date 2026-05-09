package interviewPrep;


public class InterviewLogicalQuestions2{

    public static void main(String[] args) {

        //print alternate
//            int[] array = {1,2,3,4,5,6,7};
//
//            for (int i=0; i<array.length; i+=2){
//
//                System.out.print(array[i] + " ");
//
//            }



          // find element at index
//        int x = 3;
//        int[] array = {1,2,3,4,5,6,7};
//        for (int i=0; i<array.length; i++){
//            if (x == array[i]){
//                System.out.println("found at index : " + i);
//                break;
//            }
//
//        }

        // 2 Sum – Count pairs with given sum
//        int target = 2;
//        int[] arr = {1,1,1,1};
//        int sum;
//        int count =0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                sum = arr[i] + arr[j];
//                if (target == sum){
                    //count++;
                    //System.out.println("arr[i] : " + arr[i] + " , " + "arr[j] : " + arr[j]);
                    //System.out.println("i: " +i);
                    //System.out.println("j: " +j);
//                }
//
//            }
//
//        }
//        System.out.println(count);

        //Count pairs with given difference
//        int target = 4;
//        int[] arr = {8,16,12,16,4,0};
//        int count =0;
//        int count1 = 1;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                int minus = arr[i] - arr[j];
//                if (Math.abs(minus) == target){
//                    count++;
//                    System.out.println("arr[i] : " + arr[i] + " , " + "arr[j] : " + arr[j]);
//                    System.out.println("i: " +i);
//                    System.out.println("j: " +j);
//                }
//
//            }
//
//        }
//        System.out.println(count);


        // prime numbers from an array.
//        int[] array = {2,3,4,5,6,7,8,21};
//        for (int i = 0; i<array.length; i++) {
//            boolean isTrue = true;
//            for (int j = 2; j <= array[i]/2; j++) { // prime number logic
//                if (array[i] % j == 0 ) {
//                    isTrue = false;
//                    System.out.println("i: " +i + " j: " + j + " in inner loop");
//                    break;
//                }
//                System.out.println("hello");
//            }
//            if (isTrue) {
//                System.out.println("prime number: " + array[i]);
//            }
//        }


//        int start = 2;
//        int end = 60;
//        System.out.print("prime numbers: ");
//        for(int i = start; i<=end; i++){
//            boolean isTrue = true;
//            for (int j = 2; j<=i/2; j++){
//                if(i % j == 0){
//                    isTrue = false;
//                    break;
//                }
//            }
//            if (isTrue){
//                System.out.print(i + " ");
//            }
//        }




// anagram strings // anagrams means length should be equal of two string & also characters.
//        String s1 = "owelv";
//        String s2 = "vowel";
//       int count =0;
//        for (int i=0; i<s1.length(); i++){
//            for (int j=0; j<s1.length(); j++){
//                if (s1.charAt(i) == s2.charAt(j) ){
//                    count++;
//                    break;
//                }
//            }
//        }
//        if (count == s1.length()){
//            System.out.println("anagram");
//        }








    }

}



