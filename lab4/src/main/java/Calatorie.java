import java.util.Collection;

public class Calatorie {
    private Masina masina;
    private Sofer sofer;
    private Collection<Pasager> pasageri;

    public Calatorie(Masina masina, Sofer sofer) {
        this.masina = masina;
        this.sofer = sofer;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Collection<Pasager> getPasageri() {
        return pasageri;
    }

    public void setPasageri(Collection<Pasager> pasageri) {
        this.pasageri = pasageri;
    }
}
