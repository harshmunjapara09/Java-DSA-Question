package Practice;

public class Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 12, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int row = mat.length;
        int col = mat[0].length;

//        zigzagFashoin(mat,row,col);
//        rowSum(mat,row,col);
//        colSum(mat,row,col);
        deleteMaxCol(mat,row,col);
//        deleteMaxRow(mat, row, col);
//        binarySearch(mat,row,col,4);
//        searchRowAndCol(mat,row,col,153);
        sortestPath(mat,row,col);
    }

    private static void sortestPath(int[][] mat, int row, int col) {
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(i==0 && j==0){
                    continue;
                } else if (i==0) {
                    mat[i][j] += mat[i][j-1];
                } else if (j==0) {
                    mat[i][j] += mat[i-1][j];
                }else {
                    mat[i][j] += Math.min(mat[i-1][j],mat[i][j-1]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }


    private static void searchRowAndCol(int[][] mat, int row, int col, int value) {
        int r = 0;
        int c = col - 1;

        while (r <= row-1 && c >= 0){
            if(mat[r][c]==value){
                System.out.println("Present");
                return;
            } else if (mat[r][c] > value) {
                c--;
            }else {
                r++;
            }
        }
        System.out.println("Not Present");
    }


    private static void binarySearch(int[][] mat, int row, int col, int value) {
        int top =0;
        int bottom = row-1;
        int rowBeToSearched = -1;

        while (top<=bottom){
            int mid = (top + bottom ) / 2;
            if(mat[mid][0] <= value && mat[mid][col-1] >= value){
                rowBeToSearched = mid;
                break;
            } else if (mat[mid][0] > value) {
                bottom = mid - 1;
            }else {
                top = mid + 1;
            }
        }
        if(rowBeToSearched == -1){
            System.out.println("Value is not Present");
            return;
        }
        int left = 0;
        int right = col - 1;

        while (left<=right){
            int mid = (left+right) / 2;
            if(mat[rowBeToSearched][mid] == value){
                System.out.println("Value is  Present");
                return;
            } else if (mat[rowBeToSearched][mid] > value) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }


    }


    private static void deleteMaxRow(int[][] mat, int row, int col) {
        int maxIndex = 0;
        for (int i = 0; i < col; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++) {
                if (mat[j][i] > max) {
                    max = mat[j][i];
                    maxIndex = j;
                }
            }
            for (int j = maxIndex; j < row - 1; j++) {
                mat[j][i] = mat[j + 1][i];
            }
        }
        row--;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void deleteMaxCol(int[][] mat, int row, int col) {
        int maxIndex = 0;
        for (int i = 0; i < row; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                    maxIndex = i;
                }
            }
            for (int j = maxIndex; j < col - 1; j++) {
                mat[i][j] = mat[i][j + 1];
            }
        }
        col--;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void colSum(int[][] mat, int row, int col) {
        int max = 0;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += mat[j][i];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

    private static void rowSum(int[][] mat, int row, int col) {
        int max = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += mat[i][j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

    private static void zigzagFashoin(int[][] mat, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
