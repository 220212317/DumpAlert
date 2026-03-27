package za.ac.cput.repository;

import za.ac.cput.entity.Address;

import java.util.List;

/*
 * AddressRepository.java - Repository interface for Address entity
 * Author: Athi Sintiya (220212317)
 * Date: March 2026
 */

public interface AddressRepository extends IRepository<Address, String> {

    Address create(Address address);

    Address read(String id);

    Address update(Address address);

    boolean delete(String addressId);

    List<Address> getAll();
}