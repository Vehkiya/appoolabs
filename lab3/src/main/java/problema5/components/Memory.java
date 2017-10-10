package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.MemoryType;

public class Memory extends PCComponent {
    private String manufacturer;
    private MemoryType memoryType;
    private Integer memorySizeGB;
    private Integer frequency;

    public Memory(MemoryType memoryType, Integer memorySizeGB) {
        this.memoryType = memoryType;
        this.memorySizeGB = memorySizeGB;
    }

    public Memory(String manufacturer, MemoryType memoryType, Integer memorySizeGB, Integer frequency) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.memorySizeGB = memorySizeGB;
        this.frequency = frequency;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    public Integer getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(Integer memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
