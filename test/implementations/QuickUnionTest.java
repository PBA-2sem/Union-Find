package implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.BeforeClass;

/**
 *
 * @author awha
 */
public class QuickUnionTest {

    private static QuickUnion qu;
    private static HashMap<String, String> answers;

    @BeforeClass
    public static void beforeClass() {
        qu = new QuickUnion(10);
        answers = new HashMap<>();
        //answers from http://www.bowdoin.edu/~ltoma/teaching/cs231/fall14/Material/UnionFind.pdf
        answers.put("34", "0124456789");
        answers.put("49", "0124956789");
        answers.put("80", "0124956709");
        answers.put("23", "0194956709");
        answers.put("56", "0194966709");
        answers.put("59", "0194969709");
        answers.put("73", "0194969909");
        answers.put("48", "0194969900");
        answers.put("61", "1194969900");
    }

    private String trimSout(QuickUnion original) {
        String trimmed = original.toString().substring(9).replaceAll("\\s", "");
        return trimmed;
    }

    @Test
    public void testUnion1_3_4() {
        System.out.println("Testing union 3 & 4:");
        int p = 3;
        int q = 4;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }

    @Test
    public void testUnion2_4_9() {
        System.out.println("Testing union 4 & 9:");
        int p = 4;
        int q = 9;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion3_8_0() {
        System.out.println("Testing union 8 & 0:");
        int p = 8;
        int q = 0;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion4_2_3() {
        System.out.println("Testing union 2 & 3:");
        int p = 2;
        int q = 3;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion5_5_6() {
        System.out.println("Testing union 5 & 6:");
        int p = 5;
        int q = 6;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion6_5_9() {
        System.out.println("Testing union 5 & 9:");
        int p = 5;
        int q = 9;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion7_7_3() {
        System.out.println("Testing union 7 & 3:");
        int p = 7;
        int q = 3;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion8_4_8() {
        System.out.println("Testing union 4 & 8:");
        int p = 4;
        int q = 8;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion9_6_1() {
        System.out.println("Testing union 6 & 1:");
        int p = 6;
        int q = 1;
        qu.union(p, q);
        System.out.println(qu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(qu);
        System.out.println("Answer " + expected + " should equal result " + result);
        assertEquals(expected, result);
    }

}
