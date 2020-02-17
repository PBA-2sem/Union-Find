package implementations;

import interfaces.IUnionFind;

public class WeightedUnion implements IUnionFind {

    private int[] tree;
    private int[] size;
    private String lastUnion = "";
    private int count;

    public WeightedUnion(int N) {
        tree = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = i;
            size[i] = 1;
        }
        count = N;
    }

    @Override
    public int root(int p) {
        while (p != tree[p]) {
            p = tree[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        lastUnion = String.format("|%d -> %d| ", p, q);
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        // Make smaller root point to larger one.
        if (size[i] < size[j]) {
            tree[i] = j;
            size[j] += size[i];
        } else {
            tree[j] = i;
            size[i] += size[j];
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

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int count() {
        return count;
    }
}
