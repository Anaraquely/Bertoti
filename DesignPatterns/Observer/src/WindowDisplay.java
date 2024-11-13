public class WindowDisplay implements Observer {
    private Subject weatherStation;

    public WindowDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("WindowDisplay - Temp: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
