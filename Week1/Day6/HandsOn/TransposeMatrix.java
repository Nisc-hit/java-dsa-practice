public class TransposeMatrix {
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},{4,5,6}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                transpose[j][i]= matrix[i][j];
            }
        }
        for(int[] row : transpose){
            for(int num : row){
                System.out.println(num+" ");
            }
            System.out.println();
        }
    }
    
}
