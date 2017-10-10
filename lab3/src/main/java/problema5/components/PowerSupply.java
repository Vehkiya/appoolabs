package problema5.components;

import problema5.PCComponent;

public class PowerSupply extends PCComponent {
    private String manufacturer;
    private String model;
    private Integer power;

    public PowerSupply(String manufacturer, String model, Integer power) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.setOptional(false);
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

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
