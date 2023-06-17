package CanBo;

import java.util.ArrayList;

public class CabreManagement {
    private ArrayList<Cabre> management;

    public CabreManagement() {
        this.management = new ArrayList<Cabre>();
    }

    public CabreManagement(ArrayList<Cabre> management) {
        this.management = management;
    }
    public void addCabre(Cabre cabre){
        this.management.add(cabre);
    }

    public void findCabre(String name) {
        this.management.indexOf(name);
    }

    public void showCabre() {
    }
}
