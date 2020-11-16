import java.util.ArrayList;

public class Clienti {
        private ArrayList<String> listaClienti;
        private String tipClient;
        private String nume;
        private int datorii;

        void set_tip(String tip)
        {
            this.tipClient=tip;
        }

        void set_nume(String nume)
        {
            this.nume=nume;
        }

        void set_datorii(int n)
        {
            this.datorii=n;
        }

        void adugare_datorii(int n)
        {
            this.datorii+=n;
        }

        void platire_datorii(int n)
        {
            this.datorii=this.datorii-n;
        }

        

    @Override
    public String toString() {
        return "Clienti{" +
                "listaClienti=" + listaClienti +
                ", tipClient='" + tipClient + '\'' +
                ", nume='" + nume + '\'' +
                ", datorii=" + datorii +
                '}';
    }


}
