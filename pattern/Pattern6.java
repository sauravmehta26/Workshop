public class Pattern6 {
//       1
//      121
//     12321
//    1234321
//     12321
//      121
//       1

public static void main(String[] args) {
    

int n=4;
for(int i=1;i<=n;i++){
    for(int s=1;s<=n-i;s++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    for(int j=i-1;j>0;j--){
        System.out.print(j);
    }
    System.out.println();
}
for(int i=n-1;i>0;i--){
    for(int s=1;s<=n-i;s++){
        System.out.print(" ");
    }
     for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
   for(int j=i-1;j>0;j--){
    System.out.print(j);
   }
   
   System.out.println();
}
}
}
