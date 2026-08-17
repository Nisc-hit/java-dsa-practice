public class RotateMatrix90 {
    public static void main(String[] args){
        int[][] matrix={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=matrix[i][j];
            }
        }
        for(int[] row:rotated){
            for(int num:row){
                System.out.println(num+" ");
            }
            System.out.println();
        }
    }
    
}
