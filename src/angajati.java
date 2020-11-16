import java.io.*;
import java.util.*;

public class angajati {
    private ArrayList<Persoana> mAngajati;

    public angajati(ArrayList<Persoana> mAngajati) {
        this.mAngajati = mAngajati;
    }

    public ArrayList<Persoana> getmAngajati() {
        return mAngajati;
    }

    public void setmAngajati(ArrayList<Persoana> mAngajati) {
        this.mAngajati = mAngajati;
    }

    @Override
    public String toString() {
        return "angajati{" +
                "mAngajati=" + mAngajati +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
