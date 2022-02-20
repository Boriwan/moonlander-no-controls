package cz.educanet.praha;


public class BurnedFuel implements ILanderControls {
    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        // t = s / v
        return altitude / velocity;
    }
}
