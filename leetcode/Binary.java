package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Binary {
	
	public static void main(String[] args) {
		
//		int a=3;
//		String g=Integer.toBinaryString(a);
//		System.out.println(g);
//		int g1=Integer.highestOneBit(a);
//		int g11=Integer.bitCount(a);
//		System.out.println(g11);
		
		
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
		/*
		 * Set<Integer> set=new HashSet<Integer>();
		 * 
		 * for(int i:a) { set.add(i);
		 * 
		 * }
		 */
		int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
       System.out.println(j);
		//System.out.println(set);
        //System.out.println(set.size());
		
    }
	
		
		
		
	}


