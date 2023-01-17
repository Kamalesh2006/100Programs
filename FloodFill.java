class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int temp = image[sr][sc];
        image[sr][sc]=color;
        if(sr>0 && image[sr-1][sc]==temp){
            image = floodFill(image,sr-1,sc,color);
        }if(sr<image.length-1 && image[sr+1][sc]==temp){
            image = floodFill(image,sr+1,sc,color);
        }if(sc<image[0].length-1 && image[sr][sc+1]==temp){
            image = floodFill(image,sr,sc+1,color);
        }if(sc>0 && image[sr][sc-1]==temp){
            image = floodFill(image,sr,sc-1,color);
        }
        return image;
    }
}
