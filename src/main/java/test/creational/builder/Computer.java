package test.creational.builder;

public class Computer {
    private String capacityHDD;
    private String brandHDD;
    private String capacityRAM;
    private String brandRAM;
    private String cpu;

    public String getCapacityHDD() {
        return capacityHDD;
    }

    public void setCapacityHDD(String capacityHDD) {
        this.capacityHDD = capacityHDD;
    }

    public String getBrandHDD() {
        return brandHDD;
    }

    public void setBrandHDD(String brandHDD) {
        this.brandHDD = brandHDD;
    }

    public String getCapacityRAM() {
        return capacityRAM;
    }

    public void setCapacityRAM(String capacityRAM) {
        this.capacityRAM = capacityRAM;
    }

    public String getBrandRAM() {
        return brandRAM;
    }

    public void setBrandRAM(String brandRAM) {
        this.brandRAM = brandRAM;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    private Computer(ComputerBuilder builder) {
        this.capacityRAM = builder.capacityRAM;
        this.capacityHDD = builder.capacityHDD;
    }

    public static class ComputerBuilder {
        String capacityHDD;
        String brandHDD;
        String capacityRAM;
        String brandRAM;
        String cpu;

        public ComputerBuilder(String cpu, String brandRAM, String brandHDD) {
            this.cpu = cpu;
            this.brandHDD = brandHDD;
            this.brandRAM = brandRAM;
        }

        public ComputerBuilder capacityRAM(String capacityRAM) {
            this.capacityRAM = capacityRAM;
            return this;
        }

        public ComputerBuilder capacityHDD(String capacityHDD) {
            this.capacityHDD = capacityHDD;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer created using BuilderDP having {" +
                "capacityHDD='" + capacityHDD + '\'' +
                ", brandHDD='" + brandHDD + '\'' +
                ", capacityRAM='" + capacityRAM + '\'' +
                ", brandRAM='" + brandRAM + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
