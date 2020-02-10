/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

public class QuickUnion {

    private int[] id;
    private String lastUnion = "";

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
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
        id[i] = j;
    }
    @Override
    public String toString() {
        String output = lastUnion;
        for(int i = 0; i < id.length; i++) {
            output += id[i] + " ";
        }
        return output;
    }
}

