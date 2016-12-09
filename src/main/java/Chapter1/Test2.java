package Chapter1;

/**
 * Created by Knight_JXNU on 2016/12/9.
 */
public class Test2 {
    public static void main(String[] args){
        try {
            MyThread2 thread2 = new MyThread2();
            thread2.setName("myThread");
            thread2.start();
            for (int i=0; i<10; i++){
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main:"+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
