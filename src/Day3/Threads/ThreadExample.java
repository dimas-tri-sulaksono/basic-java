package Day3.Threads;

/* thread (asyncrhonous)
*  untuk jalanin beberapa tugas secara bersamaan di latar belakang tanpa mengganggu proses utamanya */

class MyThread extends Thread {
    @Override
    public void run(){
        //super.run();
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread().getName() : buat ambil nama thread yang lagi jalan
            System.out.println(Thread.currentThread().getName() +" value : "+ i);

            try {
                // menghentikan thread selama 1 detik sebelum ke looping
                Thread.sleep(3000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
                System.out.println("Error : interrupted thread");
            }
        }
    }
}

public class ThreadExample{
    public static void main(String[] args) {
        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread0.start();     // thread pertama
        thread0.interrupt(); // interupsi thread pertama ketika lagi jalan buat nunjukin error
        thread1.start();     // thread pertama
        thread1.interrupt(); // interupsi thread pertama ketika lagi jalan buat nunjukin error
        thread2.start();     // thread kedua yang akan tetep jalan walaupun thread1 mati
    }
}