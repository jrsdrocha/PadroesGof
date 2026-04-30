public class ComputadorFachada {
    private Procesador procesador = null;
    private Memoria memoria = null;
    private HardDrive hardDrive = null;

    ComputadorFachada() {
        this.procesador = new Procesador();
        this.memoria = new Memoria();
        this.hardDrive = new HardDrive();
    }

    public void ligarComputador() {
        procesador.inicia();
        int BOOT_ADDRESS = 0X001;
        int BOOT_SECTOR = 1024;
        int SECTOR_SIZE = 512;
        procesador.inicia();
        String hdBootInfo = hardDrive.ler(BOOT_SECTOR, SECTOR_SIZE);
        memoria.carrega(BOOT_ADDRESS, hdBootInfo);
        procesador.executa();

        System.out.println("Computador pronto para ser usado! ");

    }
}
