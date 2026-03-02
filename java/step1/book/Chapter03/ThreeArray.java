package Chapter03;

public class ThreeArray {
    public static void main(String[] args) {
        int countArr = 3;
        int rowsArr = 3;
        int columnsArr = 10;
        int[][][] mmArr = new int[countArr][rowsArr][columnsArr];
        int c, i, j, k=0;
        for (c=0; c<countArr; c++)
            for (i=0; i<rowsArr; i++)
                for (j=0; j<columnsArr; j++) {
                    mmArr[c][i][j] = k;
                    k++;
                }
        for (c=0; c<countArr; c++) {
            for (i = 0; i < rowsArr; i++) {
                for (j = 0; j < columnsArr; j++)
                    System.out.print(mmArr[c][i][j] + "\t");
                System.out.println();
            }
            System.out.println();
        }
    }
}