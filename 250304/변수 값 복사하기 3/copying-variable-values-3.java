public class Main {
    public static void main(String[] args) {
        int a = 1, b = 5, c = 3;
        a = c; a += c; b -= c;
        System.out.println(a+"\n"+b+"\n"+c);
    }
}