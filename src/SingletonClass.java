import javax.naming.OperationNotSupportedException;

public class SingletonClass {
    private static SingletonClass INSTANCE=null;

    private SingletonClass() throws Exception{
        if(INSTANCE!=null){
            throw new OperationNotSupportedException("Cannot create singleton object using reflection:Permission denied"); //first way
            //System.setSecurityManager(new SecurityManager()); //second way
        }
    }

    public static SingletonClass getInstance(){

        if(INSTANCE==null){
            try{
                INSTANCE=new SingletonClass();
            }catch(Exception exp){}

        }
        return INSTANCE;
    }
}
