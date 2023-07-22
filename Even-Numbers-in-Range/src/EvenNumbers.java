import java.util.Scanner;

public class EvenNumbers {
    public static int[] evenNumbers(int[] A, int[][] B, int queries){
        int[] result = new int[queries];
        for(int i=0;i<queries;i++) {
            int left = B[i][0];
            int right = B[i][1];
            int count = 0;
            for (int j = left; j <= right; j++) {
                if (A[j] % 2 == 0) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] A= new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int q= sc.nextInt();
        int[][] B= new int[q][2];
        for(int i=0;i<q;i++){
            B[i][0]= sc.nextInt();
            B[i][1]= sc.nextInt();
        }
        A= evenNumbers(A,B,q);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+ " ");
        }
    }
}
