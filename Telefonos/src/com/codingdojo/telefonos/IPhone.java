package com.codingdojo.telefonos;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	String unlocked = "Desbloqueo Facial";
    	return unlocked;
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone "+getVersionNumber()+" from "+getCarrier());
    }
}
