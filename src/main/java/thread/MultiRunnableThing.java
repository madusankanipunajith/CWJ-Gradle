package thread;

public class MultiRunnableThing implements Runnable{
    private int threadNumber;
    public MultiRunnableThing(int number){
        this.threadNumber = number;
    }
    @Override
    public void run() {
        for (Integer i=1; i <= 5; i++){
           synchronized (i){
               System.out.println(i+ " from thread: "+ this.threadNumber);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
