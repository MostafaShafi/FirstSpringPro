package com.example.shesh.Services;

import com.example.shesh.Models.Master;
import com.example.shesh.Repositories.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MasterService {

    @Autowired
    MasterRepository repository;

    public Master getMasterById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Master> getMasters() {
        ArrayList<Master> masterList = new ArrayList<>();
        repository.findAll().forEach(master -> masterList.add(master));
        return masterList;
    }

    public Master setMaster(Master master) {
        return repository.save(master);
    }

    public Master updateMaster(Master master) {
        return repository.save(master);
    }

    public void deleteMasterById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllMasters() {
        repository.deleteAll();
    }

    public void deleteMaster(Master master) {
        repository.delete(master);
    }
}
