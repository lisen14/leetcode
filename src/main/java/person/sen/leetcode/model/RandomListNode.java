package person.sen.leetcode.model;

public class RandomListNode {
    int label;
    RandomListNode next, random;

    public RandomListNode(int x) {
        this.label = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RandomListNode)) {
            return false;
        }

        RandomListNode that = (RandomListNode) o;

        if (label != that.label) {
            return false;
        }
        if (next != null ? !next.equals(that.next) : that.next != null) {
            return false;
        }
        return random != null ? random.equals(that.random) : that.random == null;
    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (random != null ? random.hashCode() : 0);
        return result;
    }
}
