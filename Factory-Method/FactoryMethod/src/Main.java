//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bebida cha = FabricaDeBebidas.createBebida("cha");
        Bebida cafe =  FabricaDeBebidas.createBebida("cafe");
        Bebida suco =  FabricaDeBebidas.createBebida("suco");

        cha.prepare();
        cafe.prepare();
        suco.prepare();
    }
}