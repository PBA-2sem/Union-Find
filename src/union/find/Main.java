package union.find;

import implementations.QuickUnion;
import implementations.WeightedUnion;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);
        System.out.println("----------------QUICK---------------------");
        System.out.println("Initial state of tree: \n-------->" + qu);
        qu.union(3, 4);
        System.out.println(qu);
        qu.union(4, 9);
        System.out.println(qu);
        qu.union(8, 0);
        System.out.println(qu);
        qu.union(2, 3);
        System.out.println(qu);
        qu.union(5, 6);
        System.out.println(qu);
        qu.union(5, 9);
        System.out.println(qu);
        qu.union(7, 3);
        System.out.println(qu);
        qu.union(4, 8);
        System.out.println(qu);
        qu.union(6, 1);
        System.out.println(qu);

        System.out.println("----------------WEIGHTED---------------------");

        WeightedUnion wu = new WeightedUnion(10);
        System.out.println("Initial state of tree: \n-------->" + wu);
        wu.union(3, 4);
        System.out.println(wu);
        wu.union(4, 9);
        System.out.println(wu);
        wu.union(8, 0);
        System.out.println(wu);
        wu.union(2, 3);
        System.out.println(wu);
        wu.union(5, 6);
        System.out.println(wu);
        wu.union(5, 9);
        System.out.println(wu);
        wu.union(7, 3);
        System.out.println(wu);
        wu.union(4, 8);
        System.out.println(wu);
        wu.union(6, 1);
        System.out.println(wu);
    }

}
