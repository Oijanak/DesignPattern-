//Thread safe using method
class ThreadSafe{
    public static ThreadSafe obj;
    private ThreadSafe(){}
    public static synchronized ThreadSafe  getInstance(){
        if(obj==null){
            obj=new ThreadSafe();
        }
        return obj;
    }
}
public class ThreadsafeMethod{
    public static void main(String[] args) {
        ThreadSafe instance1=ThreadSafe.getInstance();
        ThreadSafe instance2=ThreadSafe.getInstance();
        System.out.println("Instance 1="+instance1);
        System.out.println("Instance2="+instance2);
    }
}