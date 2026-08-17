public class LargestInArray {
    public static void main(String[] args){
        int[][] matrix = {
            {3,8,1},{9,4,7},{2,6,5}
        };
        int largest = matrix[0][0];
        for (int[] row : matrix){
            for(int num: row){
                if(num> largest) largest = num;
            }
        }
        System.out.println("Largest = "+ largest);
    }
    
}
