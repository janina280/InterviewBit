package org.interviewBit;

/* Find the intersection of two sorted arrays OR in other words, given 2 sorted arrays, find all the elements which
occur in both arrays.

NOTE: For the purpose of this problem ( as also conveyed by the sample case ), assume that elements that appear
 more than once in both arrays should be included multiple times in the final output. */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[] intersect(final int[] A, final int[] B) {
        List<Integer> result= new ArrayList<>();
        int i=0,j=0;

        while (i<A.length && j<B.length){
           if(A[i]==B[j]){
               result.add(A[i]);
            i++;
            j++;}
           else if(A[i]<B[j] ){
               i++;
           }
           else{
               j++;
           }
        }
        int[] arrResult=new int[result.size()];
        for(int k=0;k<result.size();k++){
            arrResult[k]=result.get(k);
        }
return  arrResult;

    }
}