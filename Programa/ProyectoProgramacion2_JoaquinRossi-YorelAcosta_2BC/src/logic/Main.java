// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Supply> supplies = new ArrayList<>();

        // A PC requires at minimum 7 component types:
        // Motherboard, RAM, Storage, CPU, GPU, Case, PSU

        // RAM
        Supply ram1 = new Hardware("R001", "RAM Memory", 0.0, 30.0, 2400, 8,  "HyperX",  "DDR4", "xA23");
        Supply ram2 = new Hardware("R002", "RAM Memory", 0.0, 30.0, 2666, 16, "TridentZ", "DDR4", "x1G3");
        supplies.add(ram1);
        supplies.add(ram2);

        // Storage
        Supply disk1 = new Hardware("DSK001", "Storage", 0.0, 20.0, 500,  "SSD", "WD",  "7dA0SSW");
        Supply disk2 = new Hardware("DSK002", "Storage", 0.0, 20.0, 160,  "M2",  "SMG", "0FSSW");
        Supply disk3 = new Hardware("DSK003", "Storage", 0.0, 20.0, 4000, "HDD", "WD",  "7200SSW");
        supplies.add(disk1);
        supplies.add(disk2);
        supplies.add(disk3);

        // Case
        Supply case1 = new Hardware("CAS001", "Case", 0.0, 19.0, "MG23", (short) 1, "AORUS");
        supplies.add(case1);

        // PSU
        Supply psu1 = new Hardware("SPL001", "PSU", 0.0, 15.2, "KJF",        "31AAS",     650);
        Supply psu2 = new Hardware("SPL002", "PSU", 0.0, 15.2, "Thermaltake", "USP23FULLY", 500);
        supplies.add(psu1);
        supplies.add(psu2);

        // GPU
        Supply gpu1 = new Hardware("GPU001", "GPU", 0.0, 14.66, "NVIDIA", "QCYO",   (short) 6);
        Supply gpu2 = new Hardware("GPU002", "GPU", 0.0, 14.66, "MSI",    "WTR200", (short) 4);
        supplies.add(gpu1);
        supplies.add(gpu2);

        // CPU
        Supply cpu1 = new Hardware("CPU001", "CPU", 0.0, 48.0, "Intel", 8, 4.0, "IG89");
        Supply cpu2 = new Hardware("CPU002", "CPU", 0.0, 48.0, "AMD",   6, 3.2, "R5 1600");
        supplies.add(cpu1);
        supplies.add(cpu2);

        // Motherboard
        Supply mb1 = new Hardware("MB001", "Motherboard", 0.0, 20.3, true);
        Supply mb2 = new Hardware("MB002", "Motherboard", 0.0, 20.3, false);
        supplies.add(mb1);
        supplies.add(mb2);

        // Build a quote using selected supply IDs
        // Selected: R002, DSK003, CAS001, SPL001, GPU001, CPU001, MB001
        String[] selectedIds = {"R002", "DSK003", "CAS001", "SPL001", "GPU001", "CPU001", "MB001"};
        int[]    quantities  = {2,      4,         1,        1,        1,        1,        1};

        double supplyCostSum = 0.0;
        double subtotal = 0.0;

        for (int x = 0; x < selectedIds.length; x++) {
            String targetId = selectedIds[x];
            for (Supply s : supplies) {
                if (targetId.equals(s.getId())) {
                    supplyCostSum += s.getPrice();
                    subtotal      += s.getPrice() * quantities[x];
                }
            }
        }

        // Labor cost = 10% of supply cost sum, with IVA applied
        double laborCost = (supplyCostSum * 0.10) * 21;

        Quote quote = new PcAssembly(
            "QUOTE#001", laborCost, subtotal, 0.0, laborCost,
            "001", "Tobias", "Modding"
        );

        System.out.println("Quote ID : " + quote.getQuoteId());
        System.out.println("Client   : " + quote.getClientName());
        System.out.println("Subtotal : $" + String.format("%.2f", quote.getSubtotal()));
        System.out.println("Labor    : $" + String.format("%.2f", quote.getLaborCost()));
        System.out.println("Total    : $" + String.format("%.2f", quote.getTotal()));
    }
}
