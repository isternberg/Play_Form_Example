package models;

import com.google.inject.ImplementedBy;

import java.util.List;

@ImplementedBy(DegreeServiceDummyImpl.class)
public interface DegreeService {

    public List<String> getDegrees();
}
