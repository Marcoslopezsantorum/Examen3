public class Main {

    public static void main(String[] args) throws InterruptedException {


        Compartida  h1 = new Compartida("Suma");
        Compartida  h2 = new Compartida("Resta");
        Compartida  h3 = new Compartida("Suma");
        Compartida  h4 = new Compartida("Suma");
        Compartida  h5 = new Compartida("Resta");


        h1.sumar();


        h2.restar();

        h3.sumar();
        h4.sumar();
        h5.restar();





    }
}
