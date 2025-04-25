package org.interviewBit;

/* Given an array of size N, find the majority element. The majority element is the element that appears more
than floor(N/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.*/

public class Solution {
    public int majorityElement(final int[] A) {
    int candidate=0;
    int count=0;
    for(int num: A){
        if(count==0){
            candidate=num;
        }
        count+=(num==candidate) ? 1 : -1;
    }
    return  candidate;
    }
}