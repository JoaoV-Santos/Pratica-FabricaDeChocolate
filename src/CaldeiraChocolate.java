public class CaldeiraChocolate {

    private boolean vazia;
    private boolean fervida;
    private static CaldeiraChocolate instancia;

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {

    }

    public void ferver() {

    }

    public void drenar() {
        
    }


}
