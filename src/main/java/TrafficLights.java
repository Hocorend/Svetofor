public class TrafficLights {

    private ColorLight lightСolor = ColorLight.RED;

    private void switchLightGreen(int amountCars) {
        while (amountCars>0) {
            lightСolor = ColorLight.GREEN;
            amountCars--;
            System.out.println("The traffic light is " + lightСolor.name());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void switchLightRed(){
        lightСolor = ColorLight.RED;
        System.out.println("The traffic light is " + lightСolor.name());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayTrafficLight(int amountCars){
        if (amountCars>0) switchLightGreen(amountCars);
        else switchLightRed();
    }


}
