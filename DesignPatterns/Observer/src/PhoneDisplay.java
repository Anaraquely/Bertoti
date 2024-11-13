public class PhoneDisplay implements Observer {
    private Subject weatherStation;

    public PhoneDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("PhoneDisplay - Temp: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
