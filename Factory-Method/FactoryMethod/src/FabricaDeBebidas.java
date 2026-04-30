public class FabricaDeBebidas {
    public static Bebida createBebida(String type) {
        switch (type.toLowerCase()){
            case "cha":
                return new Cha();
            case "cafe":
                return new Cafe();
            case "suco":
                return new Suco();
                default:
                    new IllegalArgumentException("Não temos disponivel esse tipo de bebida." + type);
        }
        return null;
    }
}
