package problema5.components.fixtures;

import static problema5.components.fixtures.MemoryUsage.GPU;
import static problema5.components.fixtures.MemoryUsage.RAM;

public enum MemoryType {
    DDR1(RAM),
    DDR2(RAM),
    DDR3(RAM),
    DDR4(RAM),
    GDDR3(GPU),
    GDDR4(GPU),
    GDDR5(GPU);

    private MemoryUsage usage;

    MemoryType(MemoryUsage usage) {
        this.usage = usage;
    }

    public MemoryUsage getUsage() {
        return usage;
    }

    public void setUsage(MemoryUsage usage) {
        this.usage = usage;
    }
}
