class LazyInit{
    private static LazyInit obj;
    private LazyInit(){}
    public static LazyInit getInstance(){
        if(obj==null){
            obj=new LazyInit();
        }
        return obj;
    }
}
public class LazyInitTest {
    public static void main(String[] args) {
        LazyInit instance=LazyInit.getInstance();
        LazyInit
         instance2=LazyInit.getInstance();
        
        System.out.println("Instance="+instance);
        System.out.println("Instance="+instance2);
    }
}