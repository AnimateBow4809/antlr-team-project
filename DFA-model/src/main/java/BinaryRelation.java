import java.util.Objects;

public class BinaryRelation {
    // The state we are currently in
    private Integer state;
    // The connector between two states
    private String alphabet;

    public BinaryRelation(Integer state, String alphabet) {
        this.state = state;
        this.alphabet = alphabet;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryRelation that = (BinaryRelation) o;
        return Objects.equals(state, that.state) && Objects.equals(alphabet, that.alphabet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, alphabet);
    }
}
