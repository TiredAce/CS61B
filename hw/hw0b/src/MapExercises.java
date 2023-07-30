import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        int cur = 0;
        for (char i = 'a'; i <= 'z'; i ++) {
            tm.put(i, ++ cur);
        }
        return tm;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int num: nums) {
            tm.put(num, num * num);
        }
        return tm;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (String word: words) {
            if (tm.containsKey(word)) {
                tm.put(word, tm.get(word) + 1);
            } else {
                tm.put(word, 1);
            }
        }
        return tm;
    }
}
