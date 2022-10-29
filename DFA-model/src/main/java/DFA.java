import java.util.ArrayList;
import java.util.HashMap;

public class DFA {
    // The states our automata can go to
    private ArrayList<Integer> states;
    // The final states of our automata
    private ArrayList<Integer> finalStates;
    // The list of our alphabets
    private ArrayList<String> alphabets;
    // The current state we are in
    private Integer currentState;
    // Map of all relations between states
    private HashMap<BinaryRelation, Integer> relations;

    public DFA(ArrayList<Integer> states, ArrayList<Integer> finalStates, ArrayList<String> alphabets, Integer currentState, HashMap<BinaryRelation, Integer> relations) {
        this.states = states;
        this.finalStates = finalStates;
        this.alphabets = alphabets;
        this.currentState = currentState;
        this.relations = relations;
    }

    // Delta function used to move between the states
    public void deltaFunction(String alphabet) {
        if (!alphabets.contains(alphabet) || relations.get(new BinaryRelation(currentState, alphabet)) == null) {
            return;
        }
        currentState = relations.get(new BinaryRelation(currentState, alphabet));
    }

    // Function to check a string
    public boolean checkString(String s) {
        for (int i = 0; i < s.length(); i++) {
            deltaFunction(String.valueOf(s.charAt(i)));
        }
        if (finalStates.contains(currentState)) {
            currentState = 0;
            return true;
        } else {
            currentState = 0;
            return false;
        }
    }

    public ArrayList<Integer> getStates() {
        return states;
    }

    public void setStates(ArrayList<Integer> states) {
        this.states = states;
    }

    public ArrayList<Integer> getFinalStates() {
        return finalStates;
    }

    public void setFinalStates(ArrayList<Integer> finalStates) {
        this.finalStates = finalStates;
    }

    public ArrayList<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(ArrayList<String> alphabets) {
        this.alphabets = alphabets;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public HashMap<BinaryRelation, Integer> getRelations() {
        return relations;
    }

    public void setRelations(HashMap<BinaryRelation, Integer> relations) {
        this.relations = relations;
    }
}
