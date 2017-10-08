package problema2;

import problema2.dateFixe.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static problema2.dateFixe.Sex.FEMININ;
import static problema2.dateFixe.SporDeVechime.*;
import static problema2.dateFixe.TipPost.SEF;

public class Angajat {
    private String nume;
    private String prenume;
    private String idnp;
    private Sex sex;
    private Post post;
    private LocalDate dataAngajarii;
    private Salariu salariu;
    private List<Copil> copii;

    public Angajat(String nume, String prenume, String idnp, Sex sex, Post post, LocalDate dataAngajarii, Double salariuDeBaza) {
        this.nume = nume;
        this.prenume = prenume;
        this.idnp = idnp;
        this.sex = sex;
        this.post = post;
        this.dataAngajarii = dataAngajarii;
        this.salariu = new Salariu(salariuDeBaza);
        actualizeazaIndemnizatii();
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

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public Sex getSex() {
        return sex;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        if (post == null) {
            throw new IllegalArgumentException("Postul ocupat nu poate fi nul");
        }
        this.post = post;
        actualizeazaIndemnizatii();
    }

    public LocalDate getDataAngajarii() {
        return dataAngajarii;
    }

    public Salariu getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariuDeBazaNou) {
        Salariu salariulNou = new Salariu(salariuDeBazaNou);
        salariulNou.setImpozit(this.salariu.getImpozit());
        salariulNou.setIndemnizatii(this.salariu.getIndemnizatii());
        this.salariu = salariulNou;
        actualizeazaIndemnizatii();
    }

    public List<Copil> getCopii() {
        return copii;
    }

    public void setCopii(List<Copil> copii) {
        this.copii = copii;
    }

    public void adaugaCopil(Copil copil) {
        if (this.copii != null) {
            this.copii.add(copil);
        } else {
            this.copii = new ArrayList<>();
            this.copii.add(copil);
        }
        actualizeazaIndemnizatii();
    }

    private void actualizeazaIndemnizatii() {
        Double indemnizatieNoua = 0.0;
        this.salariu.setIndemnizatii(0.00);

        if (this.post.getTip().equals(SEF)) {
            indemnizatieNoua += Indemnizatii.POST_MANAGERIAL.getValoare();
        }

        if (this.sex.equals(FEMININ) && this.copii != null) {
            for (Copil c : copii) {
                if (c.varstaSubTreiAni()) {
                    indemnizatieNoua += Indemnizatii.COPIL_SUB_3_ANI.getValoare();
                }
            }
        }

        indemnizatieNoua += this.salariu.getSalariulDeBaza() * calculeazaTipulSporuluiDeVechime().getProcentaj();

        this.salariu.setIndemnizatii(indemnizatieNoua);
    }

    private SporDeVechime calculeazaTipulSporuluiDeVechime() {
        int vechimeAni = LocalDate.now().minusYears(this.dataAngajarii.getYear()).getYear();
        if (vechimeAni < 3) {
            return FARA_SPOR;
        } else if (vechimeAni < 5) {
            return CINCI_PROCENTE;
        } else if (vechimeAni < 10) {
            return ZECE_PROCENTE;
        } else if (vechimeAni < 15) {
            return CINCISPREZECE_PROCENTE;
        } else if (vechimeAni < 20) {
            return DOUAZECI_PROCENTE;
        } else {
            return DOUAZECI_SI_CINCI_PROCENTE;
        }

    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", idnp='" + idnp + '\'' +
                ", sex=" + sex +
                ", post=" + post +
                ", dataAngajarii=" + dataAngajarii +
                ", salariu=" + salariu +
                ", copii=" + copii +
                '}';
    }
}
