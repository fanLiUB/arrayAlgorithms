// a few simple algorithms

import java.util.Arrays;

class Array_ALG{
   // swap two chars in a char[]
   public static void swap(char[] str, int i, int j){
     char temp = str[i];
     str[i] = str[j];
     str[j] = temp;
   }
   
   // reverse a char[]
   // two-pointer technique
   public static void reverse(char[] str){
     int i = 0, j = str.length - 1;
     while (i < j){
       swap(str, i, j);
       i++;
       j--;
     }
   }
   
   // remove duplicates from sorted array
   // can't allocate new mem space
   public static int remove_duplicate(int[] l){
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
   public static int[] sumTo(int[] l, int target){
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
       
     int[] l = {2,2,5,6,7,8,8,12,12,13,23,45,46};
     int[] r = sumTo(l, 30);
     System.out.println(Arrays.toString(r));
  }
}