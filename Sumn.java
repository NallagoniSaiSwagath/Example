class  Sum1{
    public static void main(String[] args) {
        int n=143;
        int sum=0;
        do{
            int m=n%10;//143%10=3
            sum=sum+m;
            n=n/10;
        }while(n!=0);
        System.out.println(sum);
    }
}