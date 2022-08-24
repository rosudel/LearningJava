package Thread;

public class DownloadFileTask implements Runnable{
    //Runnable is an interface. It needs to implement to make a thread.

    @Override
    public void run(){  //operations for the thread are here.
        System.out.println("Downloading a file");
        System.out.println(Thread.currentThread().getName());
    }
}
