public class Patter7 {
// 1111
// 1001
// 1001
// 1111

public static void main(String[] args) {
    int n=4;
    for(int i =1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print(1);
            }else
                System.out.print(0);
            
        }
        System.out.println();
    }
}
}
