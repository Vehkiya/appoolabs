package problema2.dateFixe;

public enum SporDeVechime {
    FARA_SPOR(0.0, "0-3 ani vechime"),
    CINCI_PROCENTE(0.05, "3-5 ani vechime"),
    ZECE_PROCENTE(0.10, "5-10 ani vechime"),
    CINCISPREZECE_PROCENTE(0.15, "10-15 ani vechime"),
    DOUAZECI_PROCENTE(0.20, "15-20 ani vechime"),
    DOUAZECI_SI_CINCI_PROCENTE(0.25, "20+ ani vechime");


    Double procentaj;
    String descriere;

    SporDeVechime(Double procentaj, String descriere) {
        this.procentaj = procentaj;
        this.descriere = descriere;
    }

    public Double getProcentaj() {
        return procentaj;
    }

    public void setProcentaj(Double procentaj) {
        this.procentaj = procentaj;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
