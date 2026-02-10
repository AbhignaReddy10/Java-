class CheckEvenOdd{
    public static boolean Check(int n){
int rem=n%2;
if (rem==0){
    return true;
}
else {
    return false;
}
    }
    public static void main(String [] rags){
        int n=  30;
        if (Check(n)==true){
        System.out.print("the number is even");
        }
        else{
            System.out.print("the number is odd");
        }


    }
}