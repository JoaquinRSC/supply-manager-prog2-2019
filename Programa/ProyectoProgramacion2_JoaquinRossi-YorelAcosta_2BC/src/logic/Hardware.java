// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public class Hardware extends Supply {
    private String brand = Constants.manufacturer;
    private String model = Constants.model;
    private String ramTech = Constants.ramTech;
    private short caseFormFactor = Constants.caseFormFactor;
    private int ramFreq = Constants.ramFreq;
    private int ramCapacity = Constants.ramCapacity;
    private int psuWatts = Constants.psuWatts;
    private int storageCapacity = Constants.storageCapacity;
    private String storageTech = Constants.storageTech;
    private short gpuMemory = Constants.gpuMemory;
    private int cpuCores = Constants.cpuCores;
    private double cpuFreq = Constants.cpuFreq;
    private boolean mbRgb = Constants.mbRgb;

    // Constructor: RAM
    public Hardware(String id, String description, double price, double basePrice,
                    int ramFreq, int ramCapacity, String brand, String ramTech, String model) {
        super(id, description, price, basePrice);
        this.price = calcRamPrice(ramTech, ramCapacity, ramFreq, basePrice);
        this.ramFreq = ramFreq;
        this.ramCapacity = ramCapacity;
        this.brand = brand;
        this.ramTech = ramTech;
        this.model = model;
    }

    // Constructor: Storage (HDD/SSD/M2/EXT)
    public Hardware(String id, String description, double price, double basePrice,
                    int storageCapacity, String storageTech, String brand, String model) {
        super(id, description, price, basePrice);
        this.price = calcStoragePrice(storageCapacity, storageTech, basePrice);
        this.storageTech = storageTech;
        this.storageCapacity = storageCapacity;
        this.brand = brand;
        this.model = model;
    }

    // Constructor: Case
    public Hardware(String id, String description, double price, double basePrice,
                    String model, short caseFormFactor, String brand) {
        super(id, description, price, basePrice);
        this.price = calcCasePrice(caseFormFactor, basePrice);
        this.model = model;
        this.caseFormFactor = caseFormFactor;
        this.brand = brand;
    }

    // Constructor: PSU (Power Supply Unit)
    public Hardware(String id, String description, double price, double basePrice,
                    String brand, String model, int psuWatts) {
        super(id, description, price, basePrice);
        this.price = calcPsuPrice(psuWatts, basePrice);
        this.brand = brand;
        this.model = model;
        this.psuWatts = psuWatts;
    }

    // Constructor: GPU
    public Hardware(String id, String description, double price, double basePrice,
                    String brand, String model, short gpuMemory) {
        super(id, description, price, basePrice);
        this.price = calcGpuPrice(gpuMemory, basePrice);
        this.brand = brand;
        this.model = model;
        this.gpuMemory = gpuMemory;
    }

    // Constructor: CPU
    public Hardware(String id, String description, double price, double basePrice,
                    String brand, int cpuCores, double cpuFreq, String model) {
        super(id, description, price, basePrice);
        this.price = calcCpuPrice(cpuCores, cpuFreq, basePrice);
        this.brand = brand;
        this.cpuCores = cpuCores;
        this.cpuFreq = cpuFreq;
        this.model = model;
    }

    // Constructor: Motherboard
    public Hardware(String id, String description, double price, double basePrice, boolean mbRgb) {
        super(id, description, price, basePrice);
        this.price = calcMotherboardPrice(mbRgb, basePrice);
        this.mbRgb = mbRgb;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getRamTech() { return ramTech; }
    public int getRamFreq() { return ramFreq; }
    public int getRamCapacity() { return ramCapacity; }
    public short getCaseFormFactor() { return caseFormFactor; }
    public int getPsuWatts() { return psuWatts; }
    public int getStorageCapacity() { return storageCapacity; }
    public String getStorageTech() { return storageTech; }
    public short getGpuMemory() { return gpuMemory; }
    public int getCpuCores() { return cpuCores; }
    public double getCpuFreq() { return cpuFreq; }
    public boolean isMbRgb() { return mbRgb; }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    // Price calculation methods
    // Formula: (basePrice + attribute bonuses) * 0.21 (IVA tax factor)

    public double calcRamPrice(String ramTech, int ramCapacity, int ramFreq, double basePrice) {
        double techBonus = 0.0;
        double capacityBonus = 0.0;
        double freqBonus = 0.0;

        switch (ramTech) {
            case "DDR3": techBonus = 18.0; break;
            case "DDR4": techBonus = 25.0; break;
            default:     techBonus = 18.0; break;
        }

        switch (ramCapacity) {
            case 4:  capacityBonus = 14.0; break;
            case 8:  capacityBonus = 18.0; break;
            case 16: capacityBonus = 36.0; break;
            default: capacityBonus = 14.0; break;
        }

        switch (ramFreq) {
            case 1600: freqBonus = 9.0;  break;
            case 1866: freqBonus = 12.0; break;
            case 2400: freqBonus = 20.0; break;
            case 2666: freqBonus = 25.0; break;
            case 3000: freqBonus = 36.0; break;
            default:
                freqBonus = ramTech.equals("DDR3") ? 9.0 : 20.0;
                break;
        }

        return (techBonus + capacityBonus + freqBonus + basePrice) * 0.21;
    }

    public double calcStoragePrice(int storageCapacity, String storageTech, double basePrice) {
        double techBonus = 0.0;
        double capacityBonus = 0.0;

        switch (storageTech) {
            case "HDD": techBonus = 8.0;  break;
            case "SSD": techBonus = 12.0; break;
            case "M2":  techBonus = 18.0; break;
            case "EXT": techBonus = 22.0; break;
            default:    techBonus = 8.0;  break;
        }

        switch (storageCapacity) {
            case 160:  capacityBonus = 10.0; break;
            case 260:  capacityBonus = 14.0; break;
            case 360:  capacityBonus = 20.0; break;
            case 500:  capacityBonus = 22.0; break;
            case 1000: capacityBonus = 35.0; break;
            case 2000: capacityBonus = 42.0; break;
            case 4000: capacityBonus = 48.0; break;
            default:   capacityBonus = 10.0; break;
        }

        return (techBonus + capacityBonus + basePrice) * 0.21;
    }

    public double calcCasePrice(short caseFormFactor, double basePrice) {
        double formFactorBonus = 0.0;

        switch (caseFormFactor) {
            case 1: formFactorBonus = 19.0;  break; // Desktop
            case 2: formFactorBonus = 24.99; break; // Modding
            case 3: formFactorBonus = 17.89; break; // Rack
            case 4: formFactorBonus = 11.19; break; // Mini Tower
        }

        return (formFactorBonus + basePrice) * 0.21;
    }

    public double calcPsuPrice(int psuWatts, double basePrice) {
        double wattsBonus = 0.0;

        switch (psuWatts) {
            case 500:  wattsBonus = 15.0; break;
            case 650:  wattsBonus = 18.0; break;
            case 850:  wattsBonus = 33.0; break;
            case 1000: wattsBonus = 49.0; break;
            default:   wattsBonus = 15.0; break;
        }

        return (wattsBonus + basePrice) * 0.21;
    }

    public double calcGpuPrice(short gpuMemory, double basePrice) {
        double memoryBonus = 0.0;

        switch (gpuMemory) {
            case 1:  memoryBonus = 13.54; break;
            case 2:  memoryBonus = 18.40; break;
            case 4:  memoryBonus = 34.65; break;
            case 6:  memoryBonus = 43.88; break;
            case 8:  memoryBonus = 59.55; break;
            case 11: memoryBonus = 68.99; break;
            default: memoryBonus = 13.54; break;
        }

        return (memoryBonus + basePrice) * 0.21;
    }

    public double calcCpuPrice(int cpuCores, double cpuFreq, double basePrice) {
        double coresBonus = 0.0;
        double freqBonus = 0.0;

        switch (cpuCores) {
            case 1: coresBonus = 12.65; break;
            case 2: coresBonus = 15.10; break;
            case 4: coresBonus = 29.44; break;
            case 6: coresBonus = 30.99; break;
            case 8: coresBonus = 54.51; break;
            default: coresBonus = 12.65; break;
        }

        if      (cpuFreq >= 1.0  && cpuFreq < 1.60) freqBonus = 8.77;
        else if (cpuFreq >= 1.60 && cpuFreq < 2.15) freqBonus = 13.67;
        else if (cpuFreq >= 2.15 && cpuFreq < 2.37) freqBonus = 117.97;
        else if (cpuFreq >= 2.37 && cpuFreq < 3.0)  freqBonus = 19.17;
        else if (cpuFreq >= 3.0  && cpuFreq < 3.4)  freqBonus = 36.17;
        else if (cpuFreq >= 3.4  && cpuFreq < 3.6)  freqBonus = 40.55;
        else if (cpuFreq >= 4.0)                     freqBonus = 52.99;

        return (coresBonus + freqBonus + basePrice) * 0.21;
    }

    public double calcMotherboardPrice(boolean mbRgb, double basePrice) {
        double rgbBonus = mbRgb ? 19.80 : 0.0;
        return (rgbBonus + basePrice) * 0.21;
    }
}
