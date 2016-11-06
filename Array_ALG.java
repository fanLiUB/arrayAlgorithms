// a few simple algorithms

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Array_ALG{
   // swap two chars in a char[]
   private static void swap(char[] str, int i, int j){
     char temp = str[i];
     str[i] = str[j];
     str[j] = temp;
   }

   // reverse a char[]
   // two-pointer technique
   private static void reverse(char[] str){
     int i = 0, j = str.length - 1;
     while (i < j){
       swap(str, i, j);
       i++;
       j--;
     }
   }

   // remove duplicates from sorted array
   // can't allocate new mem space
   private static int remove_duplicate(int[] l){
     int len = l.length;
     if (len <= 1)
       return len;
     for (int i = 1; i < l.length; i++){
       if (l[i] == l[i-1]){
         len -= 1;
       }
     }
     return len;
   }

   // given a list of ints l, and a target int t
   // find the indices of two int in l
   // which sum to t
   // index 1 < index 2
   private static int[] sumTo(int[] l, int target){
     int[] res = {-1,-1};
     if (l.length < 2)
       return res;
     int low = 0, hi = l.length - 1;
     while (low < hi){
       if (l[low] + l[hi] < target)
         low ++;
       else if (l[low] + l[hi] > target)
         hi --;
       else{
         res[0] = low;
         res[1] = hi;
         return res;
       }
     }
     return res;
   }


   // given a list of chars l
   // output the frequency o each char in l
   private static void countFreq(char[] l){
     Map<Character, Integer> m = new HashMap<Character, Integer>();
     for (int i = 0; i < l.length; i++){
       if (m.containsKey(l[i])){
         m.put(l[i], m.get(l[i]) + 1);
       }
       else {
         m.put(l[i], 1);
       }
     }
     for (Map.Entry<Character, Integer> entry : m.entrySet()){
       System.out.println("'" + (char)(entry.getKey()) + "' = " + entry.getValue());
     }
   }

   // given two strings a and b
   // determine if a is an anagram of b
   private static Boolean anagram(String a, String b){
     int[] la = new int[26];
     int[] lb = new int[26];

     for (int i = 0; i < a.length(); i++){
       la[a.charAt(i) - 97] += 1;
     }

     for (int j = 0; j < b.length(); j++){
       lb[b.charAt(j) - 97] += 1;
     }

     System.out.println("la = " + Arrays.toString(la));
     System.out.println("lb = " + Arrays.toString(lb));

     return Arrays.equals(la, lb);
    }

   public static void main (String args[]){
//   char[] str1 = { 'a', 'b', 'c', 'd', 'e' };
//   char[] str2 = { 'a', 'b', 'c', 'd', 'e', 'f' };
//   reverse(str1);
//   reverse(str2);
//   System.out.println(str1);
//   System.out.println(str2);

//    int[] l = {2,4,5,6,6,7,8,8,9,12,22,23,23};
//    System.out.println(Arrays.toString(l));
//    int len = remove_duplicate(l);
//    System.out.println("\n" + l.length + "\n" + len);
//    System.out.println(Arrays.toString(l));

//     int[] l = {2,2,5,6,7,8,8,12,12,13,23,45,46};
//     int[] r = sumTo(l, 30);
//     System.out.println(Arrays.toString(r));
//     char[] l = "raeshew3WRHTSYARTR".toCharArray();
//     countFreq(l);

//     String s1 = "abcdefg";
//     String s2 = "acbgfde";
//     System.out.println(anagram(s1, s2));
//     s1 = "car";
//     s2 = "rat";
//     System.out.println(anagram(s1, s2));
//     s1 = "iamlordvoldemort";
//     s2 = "tommarvoloriddle";
//     System.out.println(anagram(s1, s2));
  }
}
