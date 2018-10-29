/**
 * @Auther: jiwang
 * @Date: 2018/9/10 14:11
 * @Description:
 */
public class PrintTest {
    public static void main(String[] agrs){

        new PrintTest().init2();


    }
    public void init2(){
        final TestInner testInner = new TestInner();
        testInner.print2(0,40000);
    }
    public void init(){
       final TestInner testInner = new TestInner();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testInner.print(0,10000);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testInner.print(10000,20000);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testInner.print(20000,30000);
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testInner.print(30000,40000);
            }
        }).start();
    }
    class TestInner{
        synchronized public void  print(int a,int b) {
            long t1 = System.currentTimeMillis();
            for(int i=a; i<b; i++){
                System.out.print(i+" ");
            }
            System.out.println("结束");
            long t2 = System.currentTimeMillis();
            System.out.println(t2-t1);
        }
        public void print2(int a,int b){
            long t1 = System.currentTimeMillis();
            for(int i=a; i<b; i++){
                System.out.print(i);
            }
            System.out.println();
            long t2 = System.currentTimeMillis();
            System.out.println(t2-t1);
        }
    }
}

