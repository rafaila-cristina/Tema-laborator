public class Produse {

    private String denumire_produs;
    private int pret;
    private String cod;

    public String getDenumire_produs() {
        return denumire_produs;
    }

    public int getPret() {
        return pret;
    }

    public String getCod() {
        return cod;
    }

    public void setDenumire_produs(String denumire_produs) {
        this.denumire_produs = denumire_produs;
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
        builder.append(this.denumire_produs);
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
