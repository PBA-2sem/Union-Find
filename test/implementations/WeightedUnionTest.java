package implementations;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.BeforeClass;

/**
 *
 * @author awha
 */
public class WeightedUnionTest {

    private static WeightedUnion wu;
    private static HashMap<String, String> answers;

    @BeforeClass
    public static void beforeClass() {
        wu = new WeightedUnion(10);
        answers = new HashMap<>();
        //answers from http://www.bowdoin.edu/~ltoma/teaching/cs231/fall14/Material/UnionFind.pdf
        answers.put("34", "0123356789");
        answers.put("49", "0123356783");
        answers.put("80", "8123356783");
        answers.put("23", "8133356783");
        answers.put("56", "8133355783");
        answers.put("59", "8133335783");
        answers.put("73", "8133335383");
        answers.put("48", "8133335333");
        answers.put("61", "8333335333");
    }

    private String trimSout(WeightedUnion original) {
        String trimmed = original.toString().substring(9).replaceAll("\\s", "");
        return trimmed;
    }

    @Test
    public void testUnion1_3_4() {
        System.out.println("Testing union 3 & 4:");
        int p = 3;
        int q = 4;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }

    @Test
    public void testUnion2_4_9() {
        System.out.println("Testing union 4 & 9:");
        int p = 4;
        int q = 9;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion3_8_0() {
        System.out.println("Testing union 8 & 0:");
        int p = 8;
        int q = 0;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion4_2_3() {
        System.out.println("Testing union 2 & 3:");
        int p = 2;
        int q = 3;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion5_5_6() {
        System.out.println("Testing union 5 & 6:");
        int p = 5;
        int q = 6;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion6_5_9() {
        System.out.println("Testing union 5 & 9:");
        int p = 5;
        int q = 9;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion7_7_3() {
        System.out.println("Testing union 7 & 3:");
        int p = 7;
        int q = 3;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion8_4_8() {
        System.out.println("Testing union 4 & 8:");
        int p = 4;
        int q = 8;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnion9_6_1() {
        System.out.println("Testing union 6 & 1:");
        int p = 6;
        int q = 1;
        wu.union(p, q);
        System.out.println(wu);
        String lookup_key = "" + p + q;
        String expected = answers.get(lookup_key);
        String result = trimSout(wu);
        System.out.println("Answer " + expected + " should ewual result " + result);
        assertEquals(expected, result);
    }

}
