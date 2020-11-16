import java.util.ArrayList;

public class Clienti {
        private ArrayList<String> mClienti;
        private int tipClient;
        private boolean premium;
        private boolean obisnuit;
        private String nume;
        private int datorii;

        void set_tip(int tip) {
            this.tipClient = tip;
            if (this.tipClient == 1) {
                premium = true;
                obisnuit = false;
            }
            else
            {
                premium=false;
                obisnuit=true;
            }
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

        String get_nume()
        {
            return this.nume;
        }

        int get_datorie()
        {
            return this.datorii;
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
