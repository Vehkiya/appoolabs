import fixtures.TipAutoturism;
import fixtures.TipCarburant;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;

public class Masina {
    private String culoare;
    private String motor;
    private Integer caiPutere;
    private TipCarburant tipCarburant;
    private Year anFabricatie;
    private TipAutoturism tip;
    private Integer nrLocuri;
    private Collection<Object> imbunatariri;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(Integer caiPutere) {
        this.caiPutere = caiPutere;
    }

    public TipCarburant getTipCarburant() {
        return tipCarburant;
    }

    public void setTipCarburant(TipCarburant tipCarburant) {
        this.tipCarburant = tipCarburant;
    }

    public Year getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(Year anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public TipAutoturism getTip() {
        return tip;
    }

    public void setTip(TipAutoturism tip) {
        this.tip = tip;
    }

    public Integer getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public Collection<Object> getImbunatariri() {
        return imbunatariri;
    }

    public void setImbunatariri(Collection<Object> imbunatariri) {
        this.imbunatariri = imbunatariri;
    }

    public void adaugaImbunatatire(Object imbunatatire) {
        if (this.imbunatariri == null) {
            this.imbunatariri = new ArrayList<>();
        }
        this.imbunatariri.add(imbunatatire);
    }
}
