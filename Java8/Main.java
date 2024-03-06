package Java8;

class MyThreads extends Thread{
    public void run(){
       for(int i=0;i<10;i++){
           System.out.println("Child");
       }
    }
}
class Main{
   public static void main(String []a){
       Thread t=new MyThreads();
       t.start();
       for(int i=0;i<10;i++){
           System.out.println("Main");
       }
   }
}