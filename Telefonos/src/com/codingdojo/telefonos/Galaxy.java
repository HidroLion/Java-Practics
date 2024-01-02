package com.codingdojo.telefonos;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	String unlocked = "Desbloqueo Por Dedo";
    	return unlocked;
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy "+getVersionNumber()+" from "+getCarrier());
    }
}
