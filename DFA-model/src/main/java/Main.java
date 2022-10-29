import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Simulating the automata on page 12 of series 2 slides
public class Main {
    public static void main(String[] args) {
        // Making the relation map
        HashMap<BinaryRelation, Integer> relations = new HashMap<>();
        relations.put(new BinaryRelation(0, "a"), 1);
        relations.put(new BinaryRelation(1, "a"), 0);
        relations.put(new BinaryRelation(0, "b"), 2);
        relations.put(new BinaryRelation(2, "b"), 0);
        relations.put(new BinaryRelation(1, "b"), 3);
        relations.put(new BinaryRelation(3, "b"), 1);
        relations.put(new BinaryRelation(2, "a"), 3);
        relations.put(new BinaryRelation(3, "a"), 2);
        // Making an DFA object
        DFA dfa = new DFA(new ArrayList<>(List.of(new Integer[]{0, 1, 2, 3})), new ArrayList<>(List.of(new Integer[]{2}))
                , new ArrayList<>(List.of(new String[]{"a", "b"})), 0, relations);
        System.out.println(dfa.checkString("aabab"));
    }
}
