public class Produse {

    private String denumire;
    private int pret;
    private String cod;

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public String getCod() {
        return cod;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

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
