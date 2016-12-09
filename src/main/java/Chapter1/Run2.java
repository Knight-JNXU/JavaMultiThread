package Chapter1;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Run2 {
    public static void main(String[] args){
        Runnable runnable = new MyRunable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
