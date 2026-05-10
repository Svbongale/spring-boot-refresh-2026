package com.example.springbootrefresh;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    // Constructor dependency injection
    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping("/list")
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(
            @PathVariable Integer id
    ) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping("/add")
    public void addAllSoftwareEngineers(
            @RequestBody SoftwareEngineer softwareEngineer
    ) {
        softwareEngineerService.addSoftwareEngineer(softwareEngineer);
    }

    @DeleteMapping("{id}")
    private void deleteSoftwareEngineerById(
            @PathVariable Integer id
    ) {
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }
}
