package Chapter1;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Run {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
