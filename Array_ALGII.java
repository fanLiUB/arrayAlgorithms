import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Array_ALGII{

  private static int longest_substring_length(String s){
    int result = 0;
    Map<Character, Integer> m = new HashMap<Character, Integer>(); 
    for (int i = 0, j = 0; j < s.length(); j++) {
        if (m.containsKey(s.charAt(j))) {
            i = Math.max(m.get(s.charAt(j)), i);
        }
        result = Math.max(result, j - i + 1);
        m.put(s.charAt(j), j + 1);
    }
    return result;
  }
  
  
  public static void main(String args[]){
    String s = "abcabcd";
    System.out.println(longest_substring_length(s));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++){
      sb.append("hey");
    }
    System.out.println(sb);
  }
}