package problema5.components;

import problema5.PCComponent;

public class Bluetooth extends PCComponent {
    private String manufacturer;
    private String version;

    public Bluetooth() {
        this.setOptional(true );
    }

    public Bluetooth(String manufacturer, String version) {
        this.manufacturer = manufacturer;
        this.version = version;
        this.setOptional(true);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
