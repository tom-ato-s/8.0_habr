//public class NewThread extends Thread{
//
//   public NewThread () {
//
//   }
//
//    @Override
//    public void run() {
//        System.out.println(getState());
//        try {
//            join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//
//        NewThread newThread = new  NewThread();
//        System.out.println(newThread.getState());
//        newThread.start();
//        System.out.println(newThread.getState());
//    }
//}