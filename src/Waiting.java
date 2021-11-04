//https://habr.com/ru/post/440436/
//
//Многопоточность
//        8.0. Состояния
//        Задача:
//        Выведите состояние потока перед его запуском​, после запуска и во время выполнения.
//


public class Waiting {

    public static void main(String[] strings) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (lock) {
                        lock.notifyAll();
                        lock.wait(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        synchronized (lock){
            thread.start(); // Запустим поток
            System.out.println(thread.getState()); //RUNNABLE
            lock.wait(); // Будем ждать, пока поток не запустится
            System.out.println(thread.getState()); // WAITING
            lock.notifyAll();
            System.out.println(thread.getState()); // BLOCKED
        }
    }

}
