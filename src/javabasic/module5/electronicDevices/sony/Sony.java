package javabasic.module5.electronicDevices.sony;

import javabasic.module5.electronicDevices.elecDevices.Notebook;

public class Sony extends Notebook {
    public Sony(String name, double weight, double ram, double hdd) {
        super(name, weight, ram, hdd, false);
    }
}
