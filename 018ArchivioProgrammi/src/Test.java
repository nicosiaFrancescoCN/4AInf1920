public class Test {
    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione(7, 53.6, "Via Molino Morra 10", "Cuneo");
        Villa villa = new Villa(20, 310.5, "Via di non lo so 14", "Cuneo", 3, 50, true);
        Appartamento appartamento1 = new Appartamento(7, 53.6, "Via Molino Morra 10", "Cuneo", 3, true, 2);
        Appartamento appartamento2 = new Appartamento(7, 53.6, "Via Molino Morra 10", "Cuneo", 3, true, 2);

        System.out.println(abitazione.toString());
        System.out.println(villa.toString());
        System.out.println(appartamento1.toString());

        boolean uguali = appartamento1.equals(appartamento2);
        System.out.println(uguali);
    }
}
