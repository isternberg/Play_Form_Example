package model;

import com.google.inject.ImplementedBy;

import java.util.List;

@ImplementedBy(DegreesServiceDummyImpl.class)
public interface DegreesService {

    public List<String> getDegrees();
}
