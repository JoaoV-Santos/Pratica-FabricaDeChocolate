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
        if(vazia) {
            vazia = false;
            System.out.println("A CALDEIRA FOI CHEIA");
        }
        else {
            System.out.println("A CALDEIRA JA ESTA CHEIA");
        }
    }

    public void ferver() {
        if(!fervida && !vazia) {

        }
    }

    public void drenar() {

    }


}
