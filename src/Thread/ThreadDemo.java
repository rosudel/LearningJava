package Thread;

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
                            //It returns the currently executed Thread name.

        //for (int i = 1; i <= 10; i++) {
            Thread th1 = new Thread(new DownloadFileTask());
                                    //DownloadFileTask is a thread

            th1.start();//now th1 will execute in a seperate thread.
       // }
    }

}
