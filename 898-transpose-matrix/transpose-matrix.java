class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length; int column=matrix[0].length;
        int[][] tranpose=new int[column][rows];
     for(int i=0;i<rows;i++) {
        for(int j=0;j<column;j++){
            tranpose[j][i]=matrix[i][j];
        }

     }  
    return tranpose;}
}