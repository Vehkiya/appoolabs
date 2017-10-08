package problema2;

public class Salariu {
    private Double salariulDeBaza;
    private Double indemnizatii;
    private Double salariulBrut;
    private Double impozit = 0.25;
    private Double salariulNet;

    Salariu(Double salariulDeBaza) {
        this.salariulDeBaza = salariulDeBaza;
        this.indemnizatii = 0.0;
        actualizeazaSalariile();
    }

    private void actualizeazaSalariile() {
        this.salariulBrut = this.salariulDeBaza + this.indemnizatii;
        this.salariulNet = this.salariulBrut - this.salariulBrut * this.impozit;
    }

    public void setSalariulDeBaza(Double salariulDeBaza) {
        this.salariulDeBaza = salariulDeBaza;
        actualizeazaSalariile();
    }

    public void setIndemnizatii(Double indemnizatii) {
        this.indemnizatii = indemnizatii;
        actualizeazaSalariile();
    }

    public void setImpozit(Double impozit) {
        this.impozit = impozit;
        actualizeazaSalariile();
    }

    public Double getSalariulDeBaza() {
        return salariulDeBaza;
    }

    public Double getIndemnizatii() {
        return indemnizatii;
    }

    public Double getSalariulBrut() {
        return salariulBrut;
    }

    public Double getImpozit() {
        return impozit;
    }

    public Double getSalariulNet() {
        return salariulNet;
    }

    @Override
    public String toString() {
        return "Salariu{" +
                "salariulDeBaza=" + salariulDeBaza +
                ", indemnizatii=" + indemnizatii +
                ", salariulBrut=" + salariulBrut +
                ", salariulNet=" + salariulNet +
                '}';
    }
}