package test.demo.src;


public class Demo {
    public static void main(String args[]) {
        int [][] aa={{1,2,3},{4,5,6},{7,8,9}};
        int result[] = Solution_rotate.findDiagonalOrder(aa);
        for (var x : result)
    System.out.println(x);
    }

}

class Solution_rotate{ //旋转二维数组
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
       
    public void rotate1(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n << 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = t;
            }
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;

            }
        }

    }
    /*
    public void setZeroes(int[][] matrix) {
        int zero[][] = new int[][];
    }
    */
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int result[] = new int[matrix.length * matrix[0].length];
        int count = 0;
        int i=0,j=0;
        boolean signal = false;
        while (count < matrix.length * matrix[0].length) {
            for (; i - 1 >= 0 && j + 1 < matrix[0].length && !signal; i -= 1, j += 1) { //下一个是否越界
                result[count++] = matrix[i][j];
            }
            result[count++] = matrix[i][j];
            if (count == matrix.length * matrix[0].length)
                break;
            if (i==0||j== matrix[0].length-1) {
                if (i == 0&&j< matrix[0].length - 1) {
                    j += 1;
                }
                else if (j == matrix[0].length - 1) {
                    i += 1;
                }
                signal = true;
            }
            for (; j - 1 >= 0 && i + 1 < matrix.length && signal; j -= 1, i += 1) {
                result[count++] = matrix[i][j];
            }
            result[count++] = matrix[i][j];
            if (count == matrix.length * matrix[0].length)
                break;
            if (j==0||i==matrix.length-1) {
                if (j == 0&&i< matrix.length - 1) {
                    i++;
                }
                else if (i == matrix.length - 1) {
                    j++;
                }
                signal = false;
                
            }
           
        }

        return result;
    }
}
