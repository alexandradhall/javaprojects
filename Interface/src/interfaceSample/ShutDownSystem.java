package interfaceSample;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: steven.hickey
 * @Assignment Name: interfaceSample
 * @Date: Jul 20, 2015
 * @Subclass ShutDownSystem Description: Class used to call shutdown and suspend
 * processes by implementing their corresponding interface classes.
 */
//Imports
//Begin Subclass ShutDownSystem
public class ShutDownSystem implements ShutDown, Suspend {

    /**
     * Implementation of the Shutdown interface
     */
    @Override
    public void shutDown() {
        /* Calls to methods */
        shutDown_Heater();
        shutdown_GateValves();
        shutdown_Turbo();
        shutDown_Evacuate();
        suspend();
    }

    /**
     * Implementation of the Suspend interface
     */
    @Override
    public void suspend() {
        /* Call to method */
        suspend_Production();
    }

    /**
     * Heater shutdown method used to turn off heaters
     */
    private void shutDown_Heater() {
        System.out.println("Heater shutting down...");
        /* Code that runs a heater shutdown process call here */
        System.out.println("Heater power off...");
        System.out.println("Heater at ambient temperature.");
    }

    /**
     * Gate valve shutdown method to close gate valves
     */
    private void shutdown_GateValves() {
        System.out.println("Gate valves closing...");
        /* Code that closes gate valves call here */
        System.out.println("All gate valves closed.");
    }

    /**
     * Turbo shutdown method to shutdown HiVac turbo
     */
    private void shutdown_Turbo() {
        System.out.println("HiVac turbo spinning down...");
        /* Code that runs turbo shutdown process call here */
        System.out.println("HiVac turbo spun down\nCurrently @ 0.0 rpm.");
    }

    /**
     * Evacuate method to bring chamber to atmosphere
     */
    private void shutDown_Evacuate() {
        System.out.println("Pressure release valve on HiVac chamber opening...");
        /* Code that runs pressure release process call here */
        System.out.println("Pressure @ 1 atmosphere (760 torr)\nSafe to open chamber.");
    }

    /**
     * Suspend method used to suspend production line
     */
    private void suspend_Production() {
        /* Code that calls suspend production line process call here */
        System.out.println("The production line has been suspended.");
    }

} //End Subclass ShutDownSystem
