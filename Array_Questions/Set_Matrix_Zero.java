public class Set_Matrix_Zero {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean firstrowzero = false;
        boolean firstcolumnzero = false;

        for(int i = 0; i<m; i++){
            if(mat[i][0]==0){
                firstcolumnzero = true;
                break;
            }
        }

        for(int j = 0; j<n; j++){
            if(mat[0][j]==0){
                firstrowzero = true;
                break;
            }
        }

        for(int i=1; i<m; i++){
            for(int j =1; j<n; j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j =1; j<n; j++){
                if(mat[i][0] ==0 || mat[0][j]==0){
                    mat[i][j] =0;
                }
            }
        }

        if(firstrowzero){
            for(int j =0; j<n; j++){
                mat[0][j] =0;
            }
        }

        if(firstcolumnzero){
            for(int i =0; i<m; i++){
                mat[i][0] =0;
            }
        }

    }
    public static void main(String[] args) {
        Set_Matrix_Zero smz = new Set_Matrix_Zero();
        int[][] mat = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        smz.setZeroes(mat);

        // Print the matrix
        for (int[] row : mat) {
            for (int val : row) {

            }
        }
    }

}
