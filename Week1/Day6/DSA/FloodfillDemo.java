class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            fill(image, sr, sc, originalColor, color);
        }
        return image;
    }
    private void fill(int[][] image, int r, int c, int originalColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
        if (image[r][c] != originalColor) return;
        image[r][c] = newColor;
        fill(image, r + 1, c, originalColor, newColor);
        fill(image, r - 1, c, originalColor, newColor);
        fill(image, r, c + 1, originalColor, newColor);
        fill(image, r, c - 1, originalColor, newColor);
    }
}
// Standalone test version
public class FloodfillDemo {
    static void fill(int[][] image, int r, int c, int original, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
        if (image[r][c] != original) return;
        image[r][c] = newColor;
        fill(image, r + 1, c, original, newColor);
        fill(image, r - 1, c, original, newColor);
        fill(image, r, c + 1, original, newColor);
        fill(image, r, c - 1, original, newColor);
    }
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        fill(image, 1, 1, 1, 2);
        for (int[] row : image) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}