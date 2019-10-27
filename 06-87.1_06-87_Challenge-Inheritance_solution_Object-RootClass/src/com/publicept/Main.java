package com.publicept;

/**
 * "Object"
 * Is the root class of all Objects created
 * All Classes automatically inherit from the Object class!!!
 * -> open with: right-click on Object > Go To > Declaration or Usages (cmd + B)
 */
/* equivalent... */
//public class Main {
public class Main extends Object{


    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}
