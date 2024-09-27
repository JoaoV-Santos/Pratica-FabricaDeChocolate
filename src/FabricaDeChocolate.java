public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate caldeiraChocolate = CaldeiraChocolate.getInstancia();
        caldeiraChocolate.drenar();
        caldeiraChocolate.ferver();
        caldeiraChocolate.encher();
        caldeiraChocolate.ferver();
        CaldeiraChocolate caldeiraChocolate1 = CaldeiraChocolate.getInstancia();
        caldeiraChocolate1.drenar();
        System.out.println(caldeiraChocolate1 == caldeiraChocolate);

    }
}
