import java.util.*;
class NewRunnableClass implements Runnable{
    int v=0;
    NewRunnableClass(int i){
        v=i;
    }
    @Override
    public synchronized void run() {
        System.out.println("Thread "+v + " "+System.currentTimeMillis());
    }
}
class Java_Threads{
    public static void main(String [] ags){
        
        Thread[] tarr = new Thread[3];
        for(int i=1;i<4;i++){
            NewRunnableClass temp = new NewRunnableClass(i);
            tarr[i-1] = new Thread(temp);
            
        }
        for(int i=0;i<3;i++){
            System.out.println((double)System.currentTimeMillis()/1000);
            tarr[i].start();
        }
        
        
    }
}
// Thread in array format
// Thread class extension VS Runnable interface impl 
// return in try catch finally
// Synchronize method attribute with threads