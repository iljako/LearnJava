package Chapter03;

public class DuoArray {
    public static void main (String [] args) {
        int[][] mArr = new int[10][];
        int i, j, k = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < i + 1; j++) {
                mArr[i] = new int[i + 1];
                mArr[i][j] = k;
                k++;
                System.out.print("[" + i + j + "] " + mArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}