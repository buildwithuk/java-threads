
public class ThreadB implements Runnable {
    
    private App app;

    public ThreadB(App app) {
        this.app = app;
    }

    @Override
    public void run() {

        System.out.println("Name of thread: " + Thread.currentThread().getName());

        app.setA(app.getA() + 4);
        app.setB(app.getA() + " " + Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName() + " A: " + app.getA() + ", B: " + app.getB());

        app.testStack();
    }
}
