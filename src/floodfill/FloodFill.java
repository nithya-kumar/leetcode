package floodfill;

public class FloodFill {
	int c = 0;
    int nc = 0;
    int[][] img;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        nc = newColor;
        img = image;
        if (img.length == 0)
            throw new IllegalArgumentException();
        if (sr < 0 || sr > img.length)
            throw new IllegalArgumentException();
        if (sc < 0 || sc > img[0].length)
            throw new IllegalArgumentException();
        c = image[sr][sc];
        if (c == nc)
            return image;
        floodFillRecursive(sr, sc);
        return image;
    }
    
    public void floodFillRecursive(int i, int j) {
        if (i >= 0 && i < img.length && j >= 0 && j < img[0].length && img[i][j] == c) {
            img[i][j] = nc;
            floodFillRecursive(i - 1, j);
            floodFillRecursive(i + 1, j);
            floodFillRecursive(i, j + 1);
            floodFillRecursive(i, j - 1);
        }
    }
}
