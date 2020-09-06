package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsSurroundingText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsWithinText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsBeforeText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketTextNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void textCloseTextOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void openBracketNoClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closeOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void deepNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[ [] []]]"));
    }

    @Test
    public void textOnly() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }


}
