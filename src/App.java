public class App {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void testStack() {

        int i = 0;
        String u = "U in test stack ";

        i++;

        System.out.println("Values: " + u + i);
    }

    public static void main(String[] args) {

        App app = new App();

        Thread t1 = new Thread(new ThreadA(app));
        Thread t2 = new Thread(new ThreadB(app));

        t1.start();
        t2.start();
    }
}
