public abstract class Om {
    private String nume;
    private String prenume;
    private Integer varsta;

    public Om() {
    }

    public Om(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        if (this instanceof Sofer && varsta < 18) {
            System.out.println("Soferul nu poate avea varsta mai mica de 18 ani!");
        }
        this.varsta = varsta;
    }
}
