package com.company;

/**
 * Implement a class that does string manipulation by overloading the following operators: <<, >>.
 */
public class StrShift {
    /** Subject which will be modified by << and >> operators */
    private StringBuilder Subject;

    /**
     * Set the subject to remain the state after manipulation.
     * @param subject Subject to modify with operator methods.
     */
    public StrShift(String subject) {
        Subject = new StringBuilder(subject);
    }

    /**
     *  Rotate n characters from right to left.
     * @param num_chars Number of characters to rotate.
     * @return Modified string.
     */
    public String BitLeftShiftOperator(int num_chars) {
        String first_chars = Subject.substring(0, Subject.length() - num_chars);
        String last_chars =  Subject.substring(Subject.length() - num_chars, Subject.length());
        setSubject(last_chars + first_chars);

        return getSubject();
    }

    /**
     * Rotate n characters from left to right.
     * @param num_chars Number of characters to rotate.
     * @return Modified string.
     */
    public String BitRightShiftOperator(int num_chars) {
        String first_chars = Subject.substring(0, num_chars);
        String last_chars =  Subject.substring(num_chars, Subject.length());
        setSubject(last_chars + first_chars);

        return getSubject();
    }

    /** Return the modified text */
    public String getSubject() {
        return Subject.toString();
    }

    /** Set the text to modify */
    public void setSubject(String subject) {
        Subject = new StringBuilder(subject);
    }

}
