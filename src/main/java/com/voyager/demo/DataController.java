package com.voyager.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataRepository dataRepository;

    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @PostMapping
    public void saveData(@RequestBody DataEntity data) {
        dataRepository.save(data);
    }

    @GetMapping
    public List<DataEntity> getData() {
        return dataRepository.findAll();
    }
}
