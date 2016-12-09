package Chapter1;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class MyThread3 extends Thread {
    private int i;
    public MyThread3(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
