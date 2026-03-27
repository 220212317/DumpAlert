package za.ac.cput.repository;

import za.ac.cput.entity.UserProfile;

import java.util.List;

public interface UserProfileRepository extends IRepository<UserProfile,String> {
    UserProfile create(UserProfile userProfile);

    UserProfile read(String id);

    UserProfile update(UserProfile userProfile);

    boolean delete(String id);

    List<UserProfile> getAll();
}
