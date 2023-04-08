public class Main {
    public static void main(String[] args) {
        TrafficLights trafficLights1 = new TrafficLights();

        int[]n = new int[10];
        n[3]=4;
        n[7]=2;

        for (int i = 0; i < n.length; i++) {
            trafficLights1.displayTrafficLight(n[i]);
        }
    }
}
