package com.example.shesh.Services;

import com.example.shesh.Models.Address;
import com.example.shesh.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    public Address getAddressById(Long id) {
    return repository.findById(id.intValue()).get();
    }

    public ArrayList<Address> getAddresss() {
        ArrayList<Address> addressList = new ArrayList<>();
        repository.findAll().forEach(address -> addressList.add(address));
        return addressList;
    }

    public Address setAddress(Address address) {
        return repository.save(address);
    }

    public Address updateAddress(Address address) {
        return repository.save(address);
    }

    public void deleteAddressById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllAddresss() {
        repository.deleteAll();
    }

    public void deleteAddress(Address address) {
        repository.delete(address);
    }
}
