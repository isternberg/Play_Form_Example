package model;

import java.util.Arrays;
import java.util.List;

public class DegreesServiceDummyImpl implements  DegreesService {
    @Override
    public List<String> getDegrees() {
        List<String> degrees = Arrays.asList("Angewandte Informatik", "Bauingenieurwesen",
                "Bekleidungstechnik", "Betriebswirtschaftslehre", "Computer Engineering",
                "Elektrotechnik", "Facility Management", "Fahrzeugtechnik", "Game Design",
                "Immobilienwirtschaft", "Industrial Design");
        return degrees;
    }
}
