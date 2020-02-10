/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union.find;

import implementations.QuickUnion;
import implementations.WeightedUnion;

/**
 *
 * @author stanislavnovitski
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(7);
        System.out.println("Initial state of tree: " + qu);
        qu.union(2, 5);
        System.out.println(qu);
        qu.union(2, 3);
        System.out.println(qu);
        qu.union(1, 5);
        System.out.println(qu);
        qu.union(6, 2);
        System.out.println(qu);
        
        System.out.println("-------------------------------------");
        
        WeightedUnion wu = new WeightedUnion(7);
        System.out.println("Initial state of tree: " + wu);
        wu.union(2, 5);
        System.out.println(wu);
        wu.union(2, 3);
        System.out.println(wu);
        wu.union(1, 5);
        System.out.println(wu);
        wu.union(6, 2);
        System.out.println(wu);
    }
    
}
