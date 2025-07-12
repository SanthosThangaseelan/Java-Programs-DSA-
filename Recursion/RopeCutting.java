public class RopeCutting{
    static int maxPieces(int n, int a,int b,int c){
        if(n == 0)
            return 0;
        else if(n <0)
            return -1;
        int temp1 = maxPieces(n-a, a, b, c);
        int temp2 = maxPieces(n-b, a, b, c);
        int temp3 = maxPieces(n-c, a, b, c);

        int max = Math.max(temp3, Math.max(temp1, temp2));
        if(max == -1)
            return -1;
        else    
            return max + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxPieces(15,5, 8, 7));
    }
} 