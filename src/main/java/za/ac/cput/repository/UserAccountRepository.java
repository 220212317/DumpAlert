package za.ac.cput.repository;

import za.ac.cput.entity.UserAccount;

import java.util.List;

public interface UserAccountRepository extends IRepository<UserAccount,String> {
    UserAccount create(UserAccount userAccount);

    UserAccount read(String id);

    UserAccount update(UserAccount userAccount);

    boolean delete(String id);

    List<UserAccount> getAll();
}
