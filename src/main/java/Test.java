/**
 * @Auther: jiwang
 * @Date: 2018/9/10 10:36
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        new Test().init();
    }

    public void init() {
        final OutPuter outPuter = new OutPuter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outPuter.output("zhangfei");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outPuter.output("guanyu");
                }
            }
        }).start();
    }

    class OutPuter {
        public void output(String name) {
            int len = name.length();
            synchronized (name){
                for (int i = 0; i < len; i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
            }
            }
    }
}
