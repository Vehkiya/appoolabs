package problema5;

import problema5.components.*;

import java.util.Collection;
import java.util.Optional;

public class PC {
    private CPU cpu;
    private Motherboard motherboard;
    private Collection<Memory> memory;
    private PowerSupply powerSupply;
    private Collection<HardDisk> hardDisks;
    private Bluetooth bluetooth;
    private Headphones headphones;
    private Microphone microphone;
    private Collection<OpticalDrive> opticalDrives;
    private SoundCard soundCard;
    private WebCam webCam;
    private Wireless wireless;

    public PC(CPU cpu, Motherboard motherboard, Collection<Memory> memory, PowerSupply powerSupply, Collection<HardDisk> hardDisks) {
        if (!isCPUCompatible(cpu, motherboard)) {
            throw new IllegalArgumentException("CPU and Motherboard are not compatible!");
        }
        Optional<Memory> incompatibleMemory = memory.stream().filter(m -> !isMemoryCompatible(m, motherboard)).findFirst();
        if (incompatibleMemory.isPresent()) {
            throw new IllegalArgumentException("Memory and Motherboard are not compatible!");
        }
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.powerSupply = powerSupply;
        this.hardDisks = hardDisks;
    }

    private boolean isCPUCompatible(CPU cpu, Motherboard motherboard) {
        return cpu.getSocket().equals(motherboard.getCpuSocket());
    }

    private boolean isMemoryCompatible(Memory memory, Motherboard motherboard) {
        return motherboard.getMemorySlots().containsKey(memory.getMemoryType());
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Collection<Memory> getMemory() {
        return memory;
    }

    public void setMemory(Collection<Memory> memory) {
        this.memory = memory;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Collection<HardDisk> getHardDisks() {
        return hardDisks;
    }

    public void setHardDisks(Collection<HardDisk> hardDisks) {
        this.hardDisks = hardDisks;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public Microphone getMicrophone() {
        return microphone;
    }

    public void setMicrophone(Microphone microphone) {
        this.microphone = microphone;
    }

    public Collection<OpticalDrive> getOpticalDrives() {
        return opticalDrives;
    }

    public void setOpticalDrives(Collection<OpticalDrive> opticalDrives) {
        this.opticalDrives = opticalDrives;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public WebCam getWebCam() {
        return webCam;
    }

    public void setWebCam(WebCam webCam) {
        this.webCam = webCam;
    }

    public Wireless getWireless() {
        return wireless;
    }

    public void setWireless(Wireless wireless) {
        this.wireless = wireless;
    }
}
