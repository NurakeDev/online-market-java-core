package repository;

import model.Measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeasurementRepository {
    public static List<Measurement> measurements = new ArrayList<>();

    public static List<Measurement> getMeasurements() {
        return measurements;
    }

    public static void setMeasurements(List<Measurement> measurements) {
        MeasurementRepository.measurements = measurements;
    }

    public static void startMeasurements(){

        measurements = new ArrayList<>();

        Arrays.asList(
                new Measurement(1L, "kg"),
                new Measurement(2L, "metr"),
                new Measurement(3L, "litr"),
                new Measurement(4L, "dona")
        ).forEach(measurement -> measurements.add(measurement));

    }

    public static Measurement getMeasurementByName(String name){
        for (Measurement measurement : measurements) {
            if (measurement.getName().equalsIgnoreCase(name)){
                return measurement;
            }
        }
        return null;
    }

    public static void viewM(){
        System.out.println(measurements);
    }
}
