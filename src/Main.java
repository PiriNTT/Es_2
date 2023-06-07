public class Main {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile("Ferrari", "488 GBT", 2022, "Rosso");
        Automobile auto2 = new Automobile("BMW", "X5", 2001, "Nero");
        auto1.mostraDettagli();
        auto2.mostraDettagli();
        auto2.setColore("Rosso");
        auto2.mostraDettagli();
    }
}