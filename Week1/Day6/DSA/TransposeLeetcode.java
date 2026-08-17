class Solution{
    public int[][] transpose(int[][] matrix){
        int rows = matrix.length,cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j< cols;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}


public class TransposeLeetcode {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,},{4,5,6}};
        int rows = matrix.length,cols = matrix[0].length;
        int[][] result = new int [cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[j][i]= matrix[i][j];
            }
        }
        for(int [] row : result){
            for(int num: row)System.out.println(num+" ");
            System.out.println();
        }
    }

    
}
