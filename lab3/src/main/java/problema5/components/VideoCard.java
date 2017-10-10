package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.MemoryType;

public class VideoCard extends PCComponent {
    private String manufacturer;
    private String gpuModel;
    private String model;
    private Integer memorySizeGB;
    private MemoryType memoryType;

    public VideoCard(String manufacturer, String gpuModel) {
        this.manufacturer = manufacturer;
        this.gpuModel = gpuModel;
        this.setOptional(false);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(Integer memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }
}
