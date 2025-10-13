import java.util.Scanner;

public class Homework4 {

    static int gcd(int m, int n) {
        if (n == 0) return m;
        else if(m>n)return gcd(n, m % n);
        else return gcd(m,n%m);
    }

    static int gcd2(int m, int n) {
        while (n != 0) {
            if(m>n){
                int t = m%n;
                m=n;n=t;
            }else{
                int t=n%m;
                n=t;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m=sc.nextInt();int n =sc.nextInt();
        System.out.printf("두 수의 최대공약수는 "+gcd(m,n)+"입니다.");
    }
}
