package com.company;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test right shift and left shift operators.
 */
public class StrShiftTest {

    /** Test left shift operator */
    @Test
    public void bitLeftShiftOperator() throws Exception {
        StrShift example = new StrShift("Microsoft");
        assertEquals("The result should be 'tMicrosof'", "tMicrosof", example.BitLeftShiftOperator(1));
        assertEquals("The result should be 'ftMicroso'", "ftMicroso", example.BitLeftShiftOperator(1));
        assertEquals("The result should be 'softMicro'", "softMicro", example.BitLeftShiftOperator(2));
    }

    /** Test right shift operator */
    @Test
    public void bitRightShiftOperator() throws Exception {
        StrShift example = new StrShift("Microsoft");
        assertEquals("The result should be 'icrosoftM'", "icrosoftM", example.BitRightShiftOperator(1));
        assertEquals("The result should be 'crosoftMi'", "crosoftMi", example.BitRightShiftOperator(1));
        assertEquals("The result should be 'osoftMicr'", "osoftMicr", example.BitRightShiftOperator(2));
    }

    /** Test left and right shift operator */
    @Test
    public void bitRLeftShiftOperatorAndRightShiftOperator() throws Exception {
        StrShift example = new StrShift("Microsoft");
        assertEquals("The result should be 'tMicrosof'", "tMicrosof", example.BitLeftShiftOperator(1));
        assertEquals("The result should be 'ftMicroso'", "ftMicroso", example.BitLeftShiftOperator(1));
        assertEquals("The result should be 'softMicro'", "softMicro", example.BitLeftShiftOperator(2));

        assertEquals("The result should be 'oftMicros'", "oftMicros", example.BitRightShiftOperator(1));
        assertEquals("The result should be 'ftMicroso'", "ftMicroso", example.BitRightShiftOperator(1));
        assertEquals("The result should be 'Microsoft'", "Microsoft", example.BitRightShiftOperator(2));
    }
}
