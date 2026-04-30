//public class Main {
//    public static void main(String[] args) {
//        ComputadorFachada computador = new ComputadorFachada();
//        computador.ligarComputador();
//    }
//}

public class Main {
    public static void main(String[] args) {
        // 1. O cliente precisa instanciar manualmente cada subsistema
        Procesador procesador = new Procesador();
        Memoria memoria = new Memoria();
        HardDrive hardDrive = new HardDrive();

        // 2. O cliente precisa conhecer as constantes técnicas
        int BOOT_ADDRESS = 0x001;
        int BOOT_SECTOR = 1024;
        int SECTOR_SIZE = 512;

        // 3. O cliente é responsável por orquestrar a ordem correta (Lógica complexa)
        System.out.println("--- Tentando ligar manualmente (Sem Facade) ---");

        procesador.inicia();

        // E se o cliente esquecer de ler o HD antes de carregar na memória? O sistema quebra.
        String dados = hardDrive.ler(BOOT_SECTOR, SECTOR_SIZE);

        memoria.carrega(BOOT_ADDRESS, dados);

        procesador.executa();

        System.out.println("Sistema ligado com muito esforço do cliente.");

//        System.out.println("--- ligando com Fachada ---");
//
//        ComputadorFachada computadorFachada = new ComputadorFachada();
//        computadorFachada.ligarComputador();
    }
}