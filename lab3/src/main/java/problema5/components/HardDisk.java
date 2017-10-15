package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.PortType;

public class HardDisk extends PCComponent {
    private String manufacturer;
    private String model;
    private Integer sizeGB;
    private Integer speedRPM;
    private PortType dataPortType;

    public HardDisk(Integer sizeGB, PortType dataPortType) {
        this.sizeGB = sizeGB;
        this.dataPortType = dataPortType;
    }

    public HardDisk(String manufacturer, String model, Integer sizeGB, Integer speedRPM, PortType dataPortType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.sizeGB = sizeGB;
        this.speedRPM = speedRPM;
        this.dataPortType = dataPortType;
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

    public Integer getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(Integer sizeGB) {
        this.sizeGB = sizeGB;
    }

    public Integer getSpeedRPM() {
        return speedRPM;
    }

    public void setSpeedRPM(Integer speedRPM) {
        this.speedRPM = speedRPM;
    }

    public PortType getDataPortType() {
        return dataPortType;
    }

    public void setDataPortType(PortType dataPortType) {
        this.dataPortType = dataPortType;
    }
}
