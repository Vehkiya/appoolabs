package problema2.dateFixe;

public enum Indemnizatii {
    POST_MANAGERIAL(200.0),
    COPIL_SUB_3_ANI(300.0);

    Double valoare;

    Indemnizatii(Double valoare) {
        this.valoare = valoare;
    }

    public Double getValoare() {
        return valoare;
    }

    public void setValoare(Double valoare) {
        this.valoare = valoare;
    }
}
