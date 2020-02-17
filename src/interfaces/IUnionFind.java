package interfaces;

public interface IUnionFind {

    void union(int p, int q);

    int root(int p);

    boolean connected(int p, int q);

    int count();
}
