public class ProjetoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "UNO", 2025);
        Carro carro2 = new Carro("Honda", "Híbrido", 2023);

        carro1.mostrarInfo();
        carro2.mostrarInfo();

        carro1.ligar();
        carro2.ligar();
    }
}
