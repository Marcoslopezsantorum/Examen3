public class Compartida extends Thread{

    public Compartida(String str){
        super(str);
    }

    static  int producto = 1;
    static  boolean numero = false;

    public synchronized int sumar() throws InterruptedException {
        while (numero == true && producto > 3) {


            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
        numero = true;
        producto = producto +1;
        System.out.println("Suma " + producto);
        numero = false;
        notify();
        return producto;
    }

    public synchronized int restar() throws InterruptedException {


        while (numero == true && producto < 0) {


            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
        numero = true;
        producto = producto -1;
        System.out.println("Resta " + producto);
        numero = false;
        notify();
        return producto;
    }


}
