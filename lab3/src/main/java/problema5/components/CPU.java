package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.CPUManufacturer;
import problema5.components.fixtures.CPUSocket;

public class CPU extends PCComponent {
    private CPUManufacturer manufacturer;
    private String model;
    private CPUSocket socket;
    private Double frequency;
    private Integer coreCount;
    private Integer threadCount;
    private Integer thermalDesignPower;

    public CPU(CPUManufacturer manufacturer, CPUSocket socket) {
        this.manufacturer = manufacturer;
        this.socket = socket;
    }

    public CPU(CPUManufacturer manufacturer, String model, CPUSocket socket, Double frequency, Integer coreCount, Integer threadCount, Integer thermalDesignPower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.socket = socket;
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.threadCount = threadCount;
        this.thermalDesignPower = thermalDesignPower;
    }

    public CPUManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(CPUManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPUSocket getSocket() {
        return socket;
    }

    public void setSocket(CPUSocket socket) {
        this.socket = socket;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public Integer getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
    }

    public Integer getThermalDesignPower() {
        return thermalDesignPower;
    }

    public void setThermalDesignPower(Integer thermalDesignPower) {
        this.thermalDesignPower = thermalDesignPower;
    }
}