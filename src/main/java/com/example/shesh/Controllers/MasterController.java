package com.example.shesh.Controllers;

import com.example.shesh.Models.Master;
import com.example.shesh.Services.MasterService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MasterController {

    @Autowired
    MasterService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addmaster")
    public Master addMaster(@Valid @RequestBody Master master, BindingResult result) {
        return service.setMaster(master);
    }

    @PutMapping("/editmaster/{id}")
    public Master updateMaster(@PathVariable(value = "id") Long id, @Valid @RequestBody Master master) {
        return service.updateMaster(master);
    }

    @GetMapping("/master/{id}")
    public String getMaster(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getMasterById(id));
    }

    @GetMapping("/masters")
    public String getMasters() {
        return gson.toJsonTree(service.getMasters()).toString();
    }

    @DeleteMapping("deletemaster/{id}")
    public void deleteMaster(@PathVariable(value = "id") Long id) {
        service.deleteMasterById(id);
    }

    @DeleteMapping("deletemaster")
    public void deleteMaster(@Valid @RequestBody Master master) {
        service.deleteMaster(master);
    }

    @DeleteMapping("deleteallmasters")
    public void deleteAllMasters() {
        service.deleteAllMasters();
    }
}
