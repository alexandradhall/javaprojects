package interfaceSample;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: alexa
 * @Assignment Name: interfaceSample
 * @Date: Apr 13, 2021
 * @Subclass StartUpSystem Description: 
 */
//Imports

//Begin Subclass StartUpSystem
public class StartUpSystem implements StartUp {
    /**
     * Implementation of the StartUp interface
     */
    @Override
    public void startup (){
        /* Calls to methods */
        startup_Chamber();
        startup_HiVac();
        startup_Valves();
        startup_Heater();
        ready_Production();
    }

    /**
     * Chamber startup method used to pump chamber down
     */
    private void startup_Chamber() {
        System.out.println("Pumping down chamber...");
        System.out.println("Chamber pumped down and @ 0 torr.");
    }

    /**
     * HiVac turbo method to start up turbo
     */
    private void startup_HiVac() {
        System.out.println("HiVac turbo spinning up...");
        System.out.println("HiVac turbo @ speed.");
    }

    /**
     * Valves startup method to open gate valves
     */
    private void startup_Valves() {
        System.out.println("Gate valves opening...");
        System.out.println("All gate valves open.");
    }

    /**
     * Heater method to bring heater temp up
     */
    private void startup_Heater() {
        System.out.println("Heater power on..");
        System.out.println("Heater starting...");
        System.out.println("Heater at operating temperature.");
    }

    /**
     * ready_Production method used to ready production line
     */
    private void ready_Production() {
        System.out.println("System ready for production.");
    }

} //End Subclass StartUpSystem
