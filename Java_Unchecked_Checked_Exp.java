import jdk.tools.jlink.internal.plugins.ExcludePlugin;

public class Java_Unchecked_Checked_Exp {
    public static void main(String args[]){
        int i=0;
        int j=9;/*
        try{    
            System.out.println(j/i);
        //}catch (IOException e){ 
        //}catch (ArithmeticException e){          
        }catch (Exception e){
            System.out.print("Exception occured.");
        }*/
        //System.out.println("After the catch block, no finally clause.");
    }
}
