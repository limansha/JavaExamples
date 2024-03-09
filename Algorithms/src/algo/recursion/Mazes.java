package algo.recursion;

public class Mazes {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int paths = countPaths(rows,cols);
        System.out.println(paths);
    }

    private static int countPaths(int r ,int c) {
        if(r == 1 || c == 1) return 1;
        return countPaths(r-1,c) +  countPaths(r,c-1);
    }
    
}
