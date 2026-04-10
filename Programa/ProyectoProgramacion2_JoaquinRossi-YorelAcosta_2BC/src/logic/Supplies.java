// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

import java.util.ArrayList;

public class Supplies {
    private ArrayList<Supply> supplies;

    public Supplies() {
        supplies = new ArrayList<>();
    }

    // Getters / Setters
    public ArrayList<Supply> getSupplies() { return supplies; }
    public void setSupplies(ArrayList<Supply> supplies) { this.supplies = supplies; }

    // Methods
    public Supply get(int index) {
        return supplies.get(index);
    }

    public int size() {
        return supplies.size();
    }

    public String getId(int index) {
        return supplies.get(index).getId();
    }

    public void remove(int index) {
        supplies.remove(index);
    }

    public void add(Supply supply) {
        supplies.add(supply);
    }
}
