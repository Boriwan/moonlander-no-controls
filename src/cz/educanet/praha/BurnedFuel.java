package cz.educanet.praha;


public class BurnedFuel implements ILanderControls {
    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        // time = altitude / velocity
        double time = altitude / velocity;
        return 0;
    }
}
