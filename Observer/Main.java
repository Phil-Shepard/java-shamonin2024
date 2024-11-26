package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        MobileDevice phone1 = new MobileDevice("Телефон 1");
        MobileDevice phone2 = new MobileDevice("Телефон 2");

        weatherStation.attach(phone1);
        weatherStation.attach(phone2);

        weatherStation.setWeather("Солнечно");
        weatherStation.setWeather("Дождливо");

        weatherStation.detach(phone1);
        weatherStation.setWeather("Облачно");
    }
}