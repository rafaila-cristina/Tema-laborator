public class Persoana {
    private String mNume;
    private String mPrenume;
    private String mFunctia;
    private String mAdresa;

    public Persoana(String mNume, String mPrenume, String mFunctia, String mAdresa) {
        this.mNume = mNume;
        this.mPrenume = mPrenume;
        this.mFunctia = mFunctia;
        this.mAdresa = mAdresa;
    }

    public String getmNume() {
        return mNume;
    }

    public void setmNume(String mNume) {
        this.mNume = mNume;
    }

    public String getmPrenume() {
        return mPrenume;
    }

    public void setmPrenume(String mPrenume) {
        this.mPrenume = mPrenume;
    }

    public String getmFunctia() {
        return mFunctia;
    }

    public void setmFunctia(String mFunctia) {
        this.mFunctia = mFunctia;
    }

    public String getmAdresa() {
        return mAdresa;
    }

    public void setmAdresa(String mAdresa) {
        this.mAdresa = mAdresa;
    }
}
