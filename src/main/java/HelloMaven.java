public class HelloMaven {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String agrs[]) {
        HelloMaven HelloMaven = new HelloMaven();
        int res = HelloMaven.add(10, 20);
        System.out.println("10+20=" + res);
    }
}