package thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        for (int i=1; i <= 3; i++){
//            MultiThreadThing myThing = new MultiThreadThing(i);
//            myThing.start();
//        }

        for (int i=1; i<= 3; i++){
            MultiRunnableThing thing = new MultiRunnableThing(i);
            Thread thread = new Thread(thing);
            thread.start();
            //thread.join();
        }
    }
}
