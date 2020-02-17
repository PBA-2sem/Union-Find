package implementations;

import interfaces.IUnionFind;


public class FirstFind implements IUnionFind {

    private int count = 0;
    private int[] pointSets = null;

    public FirstFind(int n) {
        this.count = n;
        this.pointSets = pointSets = new int[n];
        for (int i = 0; i < pointSets.length; i++) {
            pointSets[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        for (int i = 0; i < pointSets.length; i++) {
            if (pointSets[i] == pointSets[p]) {
                pointSets[i] = pointSets[q];
            }
        }
        this.count--;
    }

    @Override
    public int root(int p) {
        return pointSets[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return this.root(p) == this.root(q);
    }

    @Override
    public int count() {
        return count;
    }

}
