import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c; a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int sum = a+b+c; int ave = sum/3;
        System.out.println(sum+"\n"+ave+"\n"+(sum-ave));
    }
}