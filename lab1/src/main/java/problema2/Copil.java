package problema2;

import problema2.dateFixe.Sex;

import java.time.LocalDate;

public class Copil {
    private LocalDate dataNasterii;
    private Sex sex;
    private String nume;
    private String prenume;

    public Copil(LocalDate dataNasterii, Sex sex) {
        this.dataNasterii = dataNasterii;
        this.sex = sex;
    }

    public Copil(LocalDate dataNasterii, Sex sex, String nume, String prenume) {
        this.dataNasterii = dataNasterii;
        this.sex = sex;
        this.nume = nume;
        this.prenume = prenume;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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

    public boolean varstaSubTreiAni() {
        return LocalDate.now().minusYears(this.dataNasterii.getYear()).getYear() <= 3;
    }

    @Override
    public String toString() {
        return "Copil{" +
                "dataNasterii=" + dataNasterii +
                ", sex=" + sex +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
