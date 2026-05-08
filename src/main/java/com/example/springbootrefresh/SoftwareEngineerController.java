package com.example.springbootrefresh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping("/list")
    public List<SoftwareEngineer> getSoftwareEngineers() {

        List<SoftwareEngineer> list = new ArrayList<>();

        SoftwareEngineer se1 = new SoftwareEngineer(1, "Prakash", "Full-Stack");
        SoftwareEngineer se2 = new SoftwareEngineer(2, "Suresh", "Front-end");

        list.add(se1);
        list.add(se2);

        return list;
    }
}
