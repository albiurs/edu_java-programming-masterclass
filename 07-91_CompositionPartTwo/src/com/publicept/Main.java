package com.publicept;

import com.publicept.hasAHouse.*;
import com.publicept.pc_hasAFactory.*;

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

        // call method:
        // PC.powerUp()
        // call function powerUp() from thePC object
        thePC.powerUp();


        /**
         * Challenge: house-room-composition
         */
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, "White");

        Bed bed = new Bed("modern", 4, 30, 2, 1);

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedroom = new Bedroom("Urs's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
