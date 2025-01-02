public class Reverse {
    public static void main(String[] args) {
        int n=1234;
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("Reverse of Number:"+s);
    }
}
