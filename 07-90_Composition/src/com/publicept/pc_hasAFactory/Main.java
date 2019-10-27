package com.publicept.pc_hasAFactory;

public class Main {

    public static void main(String[] args) {

        /**
         * Create a PC with all components
         */
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);

        /**
         * call method:
         * PC.getMonitor() > Monitor.drawPixelAt()
         * call function drawPixelAt() from getMonitor() of the monitor object created by the pc object
         */
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");


        /**
         * call method:
         * PC.getMotherboard() > Motherboard.loadProgram()
         */
        thePC.getMotherboard().loadProgram("Windows 1.0");

        /**
         * call method:
         * PC.getTheCase() > Case.pressPowerButton()
         */
        thePC.getTheCase().pressPowerButton();
    }
}
