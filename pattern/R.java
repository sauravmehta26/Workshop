public class R {
    public static void main(String[] args) {
        int n=7;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++ ){
                if(j == 1 || i==1 || j == n && i <= n/2+1 || i== n/2+1 /*|| i-j == 2*/ ){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
