/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union.find;

import implementations.QuickUnion;

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
        System.out.println(qu);
        qu.union(2, 5);
        System.out.println(qu);
        qu.union(1, 3);
        System.out.println(qu);
        qu.union(4, 5);
        System.out.println(qu);
        qu.union(6, 2);
        System.out.println(qu);
    }
    
}
