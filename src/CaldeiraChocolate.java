public class CaldeiraChocolate {

    private boolean vazia = true;
    private boolean fervida = false;
    private static CaldeiraChocolate instancia;

    private CaldeiraChocolate() {
        System.out.println("INICIANDO UMA NOVA CALDEIRA");
    }

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {
        if(vazia) {
            vazia = false;
            System.out.println("A CALDEIRA FOI PREENCHIDA COM SUCESSO");
        }
        else {
            System.out.println("A CALDEIRA JA ESTA CHEIA");
        }
    }

    public void ferver() {
        if(!fervida && !vazia) {
            fervida = true;
            System.out.println("A CALDEIRA FOI FERVIDA COM SUCESSO");
        }
        else if (fervida) {
            System.out.println("A CALDEIRA JÁ FOI FERVIDA");
        }
        else if (vazia) {
            System.out.println("A CALDEIRA NÃO PODE SER FERVIDA POIS AINDA NÃO FOI CHEIA");
        }
    }

    public void drenar() {
        if(fervida && !vazia) {
            vazia = true;
            System.out.println("A CALDEIRA FOI DRENADA COM SUCESSO");
        } else if(!fervida) {
            System.out.println("A CALDEIRA SO PODE SER DRENADA APOS O PROCESSO DE FERVURA");
        }
    }


}
