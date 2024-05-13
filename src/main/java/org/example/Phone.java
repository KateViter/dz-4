package org.example;

public class Phone {
    private int version = 11;

    public int getVersion() {
        System.out.printf("--- %s ---%n",this.version);
        return version;
    }
}
