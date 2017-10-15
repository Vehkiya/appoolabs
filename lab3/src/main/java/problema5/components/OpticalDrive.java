package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.SupportedOpticalFormat;

import java.util.Collection;

public class OpticalDrive extends PCComponent {
    private String manufacturer;
    private String model;
    private Collection<SupportedOpticalFormat> supportedOpticalFormats;

    public OpticalDrive(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setOptional(true);
    }

    public OpticalDrive(String manufacturer, String model, Collection<SupportedOpticalFormat> supportedOpticalFormats) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.supportedOpticalFormats = supportedOpticalFormats;
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

    public Collection<SupportedOpticalFormat> getSupportedOpticalFormats() {
        return supportedOpticalFormats;
    }

    public void setSupportedOpticalFormats(Collection<SupportedOpticalFormat> supportedOpticalFormats) {
        this.supportedOpticalFormats = supportedOpticalFormats;
    }
}
