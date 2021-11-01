package com.example.shesh.Controllers;

import com.example.shesh.Models.Address;
import com.example.shesh.Services.AddressService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AddressController {

    @Autowired
    AddressService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addaddress")
    public Address addAddress(@Valid @RequestBody Address address, BindingResult result) {
        return service.setAddress(address);
    }

    @PutMapping("/editaddress/{id}")
    public Address updateAddress(@PathVariable(value = "id") Long id, @Valid @RequestBody Address address) {
        return service.updateAddress(address);
    }

    @GetMapping("/address/{id}")
    public String getAddress(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getAddressById(id));
    }

    @GetMapping("/addresss")
    public String getAddresss() {
        return gson.toJsonTree(service.getAddresss()).toString();
    }

    @DeleteMapping("/deleteaddress/{id}")
    public void deleteAddress(@PathVariable(value = "id") Long id) {
        service.deleteAddressById(id);
    }

    @DeleteMapping("/deleteaddress")
    public void deleteAddress(@Valid @RequestBody Address address) {
        service.deleteAddress(address);
    }

    @DeleteMapping("/deletealladdresss")
    public void deleteAllAddresss() {
        service.deleteAllAddresss();
    }
}
