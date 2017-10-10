package problema5.components;

import problema5.PCComponent;
import problema5.components.fixtures.CPUSocket;
import problema5.components.fixtures.MemoryType;
import problema5.components.fixtures.MotherboardFormFactor;
import problema5.components.fixtures.PortType;

import java.util.Map;

public class Motherboard extends PCComponent {
    private String manufacturer;
    private String model;
    private CPUSocket cpuSocket;
    private MotherboardFormFactor formFactor;
    private Map<MemoryType, Integer> memorySlots;
    private Map<PortType, Integer> portTypes;

    public Motherboard(CPUSocket cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public Motherboard(String manufacturer, String model, CPUSocket cpuSocket, MotherboardFormFactor formFactor, Map<MemoryType, Integer> memorySlots, Map<PortType, Integer> portTypes) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cpuSocket = cpuSocket;
        this.formFactor = formFactor;
        this.memorySlots = memorySlots;
        this.portTypes = portTypes;
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

    public CPUSocket getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(CPUSocket cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public MotherboardFormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public Map<MemoryType, Integer> getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(Map<MemoryType, Integer> memorySlots) {
        this.memorySlots = memorySlots;
    }

    public Map<PortType, Integer> getPortTypes() {
        return portTypes;
    }

    public void setPortTypes(Map<PortType, Integer> portTypes) {
        this.portTypes = portTypes;
    }
}
