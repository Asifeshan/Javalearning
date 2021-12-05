package practice;

import java.util.HashMap;
import java.util.Locale;

public class HomeWork8 {
//    //    problem 1
//    public static HashMap<String, Integer> returnHashMap(String[] value) {
//        HashMap<String, Integer> hMap = new HashMap<>();
//
//        for (String key : value) {
//            hMap.put(key, 0);
//        }
//        return hMap;
//    }
//
//    //     Problem 2
//    public static HashMap<String, Integer> HashmapLength(String[] strings) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (String s : strings) {
//            hashMap.put(s, s.length());
//        }
//        return hashMap;
//    }
//
//
//    //    problem 3
//    public static int[] fizzArray(int n) {
//        int[] myArray = new int[n];
//        for (int i = 0; i <= n - 1; i++) {
//            myArray[i] = i;
//        }
//        return myArray;
//    }
//}


//    problem 4
//    public int countHi(String str) {
//        int b = str.length()-1;
//        int x = 0;
////        str = str.toLowerCase(Locale.ROOT);
//        for (int i= 0;i<b; i++) {
//            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
//                x++;
//
//        }
//        return x;

//    How to count a certain word in a given string.
    public void countIs() {
        String string = "I want to say hi and i want to tell history";
        String countWord = "hi";
        String temp[] = string.split(" ");
        int count = 0;

        for (int i = 0; i< temp.length; i++) {
            if(countWord.equals(temp[i]))
                count++;

        }




      System.out.println("The word " + countWord + " occurs " + count + " times in the string");
    }










//    Problem 5
//    public  int loneSum(int a, int b, int c) {
//        if(a==b) {
//            if ( a==c)
//                return 0;
//            return c;
//
//        }
//        if(a==c)
//            return b;
//        if(b==c)
//            return a;
//        return (a+b+c);
//    }


}
