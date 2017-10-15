package problema5.components;

import problema5.PCComponent;

public class Headphones extends PCComponent {
    private String manufacturer;
    private String model;
    private boolean isMicrophoneEquipped;
    private boolean isWired;

    public Headphones(String manufacturer, String model) {
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

    public boolean isMicrophoneEquipped() {
        return isMicrophoneEquipped;
    }

    public void setMicrophoneEquipped(boolean microphoneEquipped) {
        isMicrophoneEquipped = microphoneEquipped;
    }

    public boolean isWired() {
        return isWired;
    }

    public void setWired(boolean wired) {
        isWired = wired;
    }
}
