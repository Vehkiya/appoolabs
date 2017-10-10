package problema5.components.fixtures;

import static problema5.components.fixtures.CPUManufacturer.AMD;
import static problema5.components.fixtures.CPUManufacturer.INTEL;

public enum CPUSocket {
    LGA1151(INTEL),
    AM3(AMD),
    AM4(AMD);

    private CPUManufacturer compatibleCPUManufacturer;

    CPUSocket(CPUManufacturer compatibleCPUManufacturer) {
        this.compatibleCPUManufacturer = compatibleCPUManufacturer;
    }

    public CPUManufacturer getCompatibleCPUManufacturer() {
        return compatibleCPUManufacturer;
    }

    public void setCompatibleCPUManufacturer(CPUManufacturer compatibleCPUManufacturer) {
        this.compatibleCPUManufacturer = compatibleCPUManufacturer;
    }
}
