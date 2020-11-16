public class Produse {

    private String denumire;
    private int pret;
    private String cod;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Descriere produs: \n");

        builder.append("Denumire: ");
        builder.append(this.denumire);
        builder.append("\n");

        builder.append("Pret: ");
        builder.append(this.pret);
        builder.append("\n");

        builder.append("cod: ");
        builder.append(this.cod);
        builder.append("\n");

        return builder.toString();
    }


}
