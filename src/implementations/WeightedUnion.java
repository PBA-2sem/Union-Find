package implementations;

public class WeightedUnion {

    private int[] tree;
    private String lastUnion = "";

    public WeightedUnion(int N) {
        tree = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = i;
        }
    }

    private int root(int i) {
        while (i != tree[i]) {
            tree[i] = tree[tree[i]]; // the only difference from QuickUinon implementation
            i = tree[i];
        }
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        lastUnion = String.format("|%d -> %d| ", p, q);
        int i = root(p);
        int j = root(q);
        tree[i] = j;
    }
    
    @Override
    public String toString() {
        String output = lastUnion;
        for(int i = 0; i < tree.length; i++) {
            output += tree[i] + " ";
        }
        return output;
    }
}

