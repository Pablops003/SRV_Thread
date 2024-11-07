//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =  Thread.startVirtualThread(() ->{
            int i = 0;
            while(true) System.out.println(i++);
        });


        Thread thread1 =  Thread.startVirtualThread(() ->{
            int i = 0;
            while(true) System.out.println("hola");
        });

        thread.join();
    }
}