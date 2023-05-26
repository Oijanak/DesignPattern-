class EagerInit {
    private static EagerInit obj=new EagerInit();
    private EagerInit(){}
    public static EagerInit getInstance(){
        return obj;
    }
    
}
public class EagerInitTest {
    public static void main(String[] args) {
        EagerInit instance=EagerInit.getInstance();
        EagerInit
         instance2=EagerInit.getInstance();
        
        System.out.println("Instance="+instance);
        System.out.println("Instance="+instance2);
    }
  
    
}


