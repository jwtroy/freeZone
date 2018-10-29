/**
 * @Auther: jiwang
 * @Date: 2018/10/29 10:16
 * @Description:
 */
public class Singleton {
   /* private static Singleton singleton = new Singleton();*/  //放在此处
    private static int counter1;
    private static int counter2 = 0;
    private static Singleton singleton = new Singleton();
    private Singleton(){
        counter1++;
        counter2++;
    }
    public static Singleton getInstance(){
        return singleton;
    }

    public static class Mytest{
        public static void main(String[] args){
            Singleton singleton = Singleton.getInstance();
            System.out.println("counter1="+singleton.counter1);
            System.out.println("counter2="+singleton.counter2);

        }
    }
}
