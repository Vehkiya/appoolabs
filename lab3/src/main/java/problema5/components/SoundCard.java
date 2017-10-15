package problema5.components;

import problema5.PCComponent;

public class SoundCard extends PCComponent {
    private String manufacturer;
    private String model;

    public SoundCard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
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
}
