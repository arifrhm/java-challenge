import java.util.*;

public class WeightedStrings {
    
    public static List<String> weightedStrings(String s, int[] queries) {
        List<String> result = new ArrayList<>();
        Set<Integer> weights = calculateWeights(s);
        
        for (int q : queries) {
            if (weights.contains(q)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        
        return result;
    }
    
    private static Set<Integer> calculateWeights(String s) {
        Set<Integer> weights = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            int currentWeight = 0;
            for (int j = i; j < s.length(); j++) {
                currentWeight += s.charAt(j) - 'a' + 1;
                weights.add(currentWeight);
                if (j + 1 < s.length() && s.charAt(j) != s.charAt(j + 1)) {
                    break;
                }
            }
        }
        
        return weights;
    }
    
    public static void main(String[] args) {
        String s = "abbcccd";
        int[] queries = {1, 3, 9, 8};
        List<String> result = weightedStrings(s, queries);
        System.out.println("Output: " + result); // [Yes, Yes, Yes, No]
    }
}
