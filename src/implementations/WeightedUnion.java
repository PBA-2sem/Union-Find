package implementations;

public class WeightedUnion {

    private int[] tree;
    private int[] size;
    private String lastUnion = "";

    public WeightedUnion(int N) {
        tree = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        while (i != tree[i]) {
            tree[i] = tree[tree[i]];
            i = tree[i];
        }
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        lastUnion = String.format("|%d -> %d| ", p, q);
        int root1 = root(p);
        int root2 = root(q);

//        tree[root1] = root2;
        //Point smaller root to larger one
        if (size[root1] < size[root2]) {
            tree[root1] = root2;
        } else if (size[root1] > size[root2]) {
            tree[root2] = root1;
        } else {
            // same size, then make root1 one size larger
            tree[root2] = root1;
            size[root1]++;
        }
    }

    @Override
    public String toString() {
        String output = lastUnion;
        for (int i = 0; i < tree.length; i++) {
            output += tree[i] + " ";
        }
        return output;
    }
}
