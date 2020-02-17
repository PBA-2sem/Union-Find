package implementations;

import interfaces.IUnionFind;

public class QuickUnion implements IUnionFind {

    private int[] tree;
    private String lastUnion = "";
    private int count;

    public QuickUnion(int N) {
        tree = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = i;
        }
        this.count = N;
    }

    public int root(int p) {
        while (p != tree[p]) {
            p = tree[p];
        }
        return p;
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
        for (int i = 0; i < tree.length; i++) {
            output += tree[i] + " ";
        }
        return output;
    }

    @Override
    public boolean connected(int p, int q) {
        {
            return root(p) == root(q);
        }
    }

    @Override
    public int count() {
        return count;
    }

}
