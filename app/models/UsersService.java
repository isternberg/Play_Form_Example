package models;

import com.google.inject.ImplementedBy;

import java.util.List;

@ImplementedBy(UserServiceDummyImpl.class)
public interface UsersService {
    List<User> getUsers();

}
