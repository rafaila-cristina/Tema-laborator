import java.io.*;
import java.util.*;

public class angajati {
    private ArrayList<String> mAngajati;

    public angajati(ArrayList<String> mAngajati) {
        this.mAngajati = mAngajati;
    }

    public ArrayList<String> getmAngajati() {
        return mAngajati;
    }

    public void setmAngajati(ArrayList<String> mAngajati) {
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
