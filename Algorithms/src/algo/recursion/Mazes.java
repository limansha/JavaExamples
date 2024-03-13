package algo.recursion;

public class Mazes {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        //the maze has only to possiblities right and down
        int paths = countPaths(rows,cols);
        System.out.println(paths);
        printPaths("",rows,cols);
    }

    private static int countPaths(int r ,int c) {
        if(r == 1 || c == 1) return 1;
        return countPaths(r-1,c) +  countPaths(r,c-1);
    }
    
    private static void printPaths(String sb,int r ,int c) {
        if(r == 1 && c == 1) {
            System.out.println(sb);
        }
        if(r > 1){
            printPaths(sb+"D",r-1,c);
        }
        if(c > 1){
            printPaths(sb+"R",r,c-1);
        }
    }
}
