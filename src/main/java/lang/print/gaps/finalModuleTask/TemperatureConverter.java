package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float far = ((float) temperatureCelsius * ((float) 9 /5) + 32);
        System.out.println(far);
    }
}
