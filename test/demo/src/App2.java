package test.demo.src;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        String res = str[0];
        int i = 1;
        while (i < str.length) {
            while (str[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
            i++;
        }
        // String in = Solution.longestCommonPrefix(str);
        // System.out.println("hell word");
        System.out.println(res);

    }

}

class Solution1 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String res = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
            i += 1;
        }
        return res;

    }

    public void setZeroes(int[][] matrix) {
        boolean row[]=new boolean [matrix.length];
        boolean  col []=new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;

                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < col.length; i++) {
            if (col[i]) {
                for (int j = 0; j < matrix.length; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }
        
    }

}
