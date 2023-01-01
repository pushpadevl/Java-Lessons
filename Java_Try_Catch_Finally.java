public class Java_Try_Catch_Finally{
    public static void main(String []args){
        int i = Integer.parseInt(args[0]);

        System.out.println(method(i));
    }
    static String method(int i){
        try{
            System.out.println("Inside the try block");
            if(i!=0 && i%2==0){
                i += 10;
                return "Even";
              //  System.out.println("Value of i = "+i);
            }
                
            else throw new Exception("Exception occured.");
        }catch (Exception e){
            System.out.println("Inside the catch block");
            if(i!=0){
                i += 20;
                return "Not even";
            }
                
            else throw new Exception("Another exception.");
        }finally{
            System.out.println("Inside the finally block");
            return "Zero and value of i = "+i;
        }
        //System.out.println("After finally");
        //return Integer.toBinaryString(55);
    }
}