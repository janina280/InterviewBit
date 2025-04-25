package org.interviewBit;


/*Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1. */
public class Main {
    public int[] getRow(int A) {
            int[] row = new int[A + 1];
            row[0] = 1;

            for (int i = 1; i <= A; i++) {
                for (int j = i; j > 0; j--) {
                    row[j] = row[j] + row[j - 1];
                }
            }
            return row;
        }
}