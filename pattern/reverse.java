class reverse{
    public static void main(String[] args) {
       // int n=5;
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}