package memory;

public class StackFrame {

    public void method1() {
        System.out.println("this is method 1");
        method2();
        System.out.println("exiting method 1");
    }

    public void method2() {
        System.out.println("this is method 2");
        method3();
        System.out.println("exiting method 2");
    }

    public void method3() {
        System.out.println("this is method 3");
        System.out.println("exiting method 3");
    }
}
