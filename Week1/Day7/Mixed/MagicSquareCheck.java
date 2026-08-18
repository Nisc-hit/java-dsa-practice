public class MagicSquareCheck {
    public static void main(String[] args){
        int[][] matrix = {
            {2,7,6},{9,5,1},{4,3,8}
        };
        int n = matrix.length;
        int magicSum = 0;
        for(int j=0;j<n;j++){
            magicSum += matrix[0][j];
        }
        boolean isMagic = true;
        for(int i=0;i<n;i++){
            int rowSum = 0;
            for(int j=0;j<n;j++){
                rowSum += matrix[i][j];
            }
            if(rowSum != magicSum) isMagic = false;
        }
        for( int j=0;j<n;j++){
            int colSum = 0;
            for(int i=0;i<n;i++){
                colSum += matrix[i][j];
            }
            if(colSum != magicSum) isMagic = false;
        }
         int primaryDiagonal = 0, secondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][n - 1 - i];
        }
        if (primaryDiagonal != magicSum || secondaryDiagonal != magicSum) isMagic = false;
        System.out.println("Is magic square? " + isMagic);
        System.out.println("Magic sum = " + magicSum);
    }
    
}
