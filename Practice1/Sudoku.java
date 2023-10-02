package Practice1;

//     4. Given a 9×9 sudoku we have to evaluate it for its correctness. We have to check both the sub
//        matrix correctness and the whole sudoku correctness.


public class Sudoku {
    public static void main(String[] args) {
        int board[][] = {{7, 9, 2, 1, 5, 4, 3, 8, 6},
                         {6, 4, 3, 8, 2, 7, 1, 5, 9},
                         {8, 5, 1, 3, 9, 6, 7, 2, 4},
                         {2, 6, 5, 9, 7, 3, 8, 4, 1},
                         {4, 8, 9, 5, 6, 1, 2, 7, 3},
                         {3, 1, 7, 4, 8, 2, 9, 6, 5},
                         {1, 3, 6, 7, 4, 8, 5, 9, 2},
                         {9, 7, 4, 2, 1, 5, 6, 3, 8},
                         {5, 2, 8, 6, 3, 9, 4, 1, 7}};
        if(isValidDimensionSudoku(board) && isValidSudoku(board))
            System.out.println("Valid");
        else
            System.out.println("Not Valid");



    }

    private static boolean isValidSudoku(int[][] board) {
        //check row
        for(int i=0;i<9;i++){
            if(!isUnique(board[i]))
                return false;
        }
        for(int i=0;i<9;i++){
            int columnSudoku[] = new int[9];
            int ind = 0;
            for(int j=0;j<9;j++){
                columnSudoku[ind++]=board[j][i];
            }
            if(!isUnique(columnSudoku))
                return false;
        }
        return true;
    }

    private static boolean isUnique(int[] ints) {
        int a[] = new int[9];
        for(int e:ints)
            a[e-1]++;
        for(int e:a){
            if(e!=1)
                return false;
        }
        return true;
    }

    private static boolean isValidDimensionSudoku(int[][] board) {
        boolean flag = true;
        int r1 = 0, r2=3, c1=0, c2=3;
        for(int i=0;i<9;i++){
            if(i % 3 == 0 && i!=0){
                r1=r2;
                r2+=3;
                c1=0;
                c2=3;
            }
            flag = isSudoku(board,r1,r2,c1,c2);
            if(flag==false)
                break;

            c1 = c2;
            c2+=3;
        }
        return flag;
    }

    private static boolean isSudoku(int[][] board, int r1, int r2, int c1, int c2) {
        int a[] = new int[9];
        int j = c1;
        while(r1<r2){
            if(c1<c2){
                int val = board[r1][c1];
                a[val-1]++;
                c1++;
            }
            else{
                r1++;
                c1=j;
            }
        }
        for(int e : a){
            if(e!=1)
               return false;
        }
        return true;
    }
}
