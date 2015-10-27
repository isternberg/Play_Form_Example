package models;

import com.google.inject.ImplementedBy;

import java.util.List;

@ImplementedBy(UserserviceImpl.class)
public interface UserService {

    public  List<User> getAllUsers();

    public void create(User user);

    public void delete(Long id);

}
