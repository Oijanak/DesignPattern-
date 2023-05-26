
class ThreadSafeBlock{
    private static ThreadSafeBlock obj;
    private ThreadSafeBlock(){}
    public static ThreadSafeBlock getInstance(){
        if(obj==null){
            synchronized(ThreadSafeBlockTest.class){
                if(obj==null){
                    obj=new ThreadSafeBlock();
                }
            }
        }
        return obj;
    }
}
public class ThreadSafeBlockTest {
    public static void main(String[] args) {
        ThreadSafeBlock instance1=ThreadSafeBlock.getInstance();
        ThreadSafeBlock instance2=ThreadSafeBlock.getInstance();
        System.out.println("Instance 1="+instance1);
        System.out.println("Instance2="+instance2);
    }
}
