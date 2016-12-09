package Chapter1;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Test3 {
    public static void main(String[] args){
        MyThread3 t10 = new MyThread3(0);
        MyThread3 t11 = new MyThread3(1);
        MyThread3 t12 = new MyThread3(2);
        MyThread3 t13 = new MyThread3(3);
        MyThread3 t14 = new MyThread3(4);
        MyThread3 t15 = new MyThread3(5);
        MyThread3 t16 = new MyThread3(6);
        MyThread3 t17 = new MyThread3(7);
        MyThread3 t18 = new MyThread3(8);
        MyThread3 t19 = new MyThread3(9);
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
    }
}
