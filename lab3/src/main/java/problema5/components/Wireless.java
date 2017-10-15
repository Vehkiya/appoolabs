package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.WirelessType;

import java.util.Collection;

public class Wireless extends PCComponent {
    private String manufacturer;
    private String model;
    private Collection<WirelessType> supportedTechnologies;

    public Wireless(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setOptional(true);
    }

    public Wireless(String manufacturer, String model, Collection<WirelessType> supportedTechnologies) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.supportedTechnologies = supportedTechnologies;
        this.setOptional(true);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Collection<WirelessType> getSupportedTechnologies() {
        return supportedTechnologies;
    }

    public void setSupportedTechnologies(Collection<WirelessType> supportedTechnologies) {
        this.supportedTechnologies = supportedTechnologies;
    }
}
