public class ExceptionHandling {

    public static void main(String[] args){
        try{
            System.out.println("in try block");

           int i = 2/0;
            return;

           // new ExceptionHandling().go();
        }catch(Exception e){
            System.out.println("in Exception "+e);
            return;
        }finally{
            System.out.println("in finally block");
        }
    }

    public void go(){
        System.out.println("in go");
        go();
    }
}
