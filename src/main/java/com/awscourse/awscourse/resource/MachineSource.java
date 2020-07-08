package com.awscourse.awscourse.resource;

import com.awscourse.awscourse.service.MachineService;
import com.awscourse.awscourse.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "machines")
public class MachineSource {

    @Autowired
    private MachineService machineService;

    // get basic machine
    @GetMapping("/basic")
    public ResponseEntity<Machine> getMachineInformation() {
        Machine machine = machineService.getMachineInformation();
        return ResponseEntity.ok(machine);
    }

    @GetMapping("/detailed")
    public ResponseEntity<DetailedMachine> getDetailedMachineInformation() {
        DetailedMachine detailedMachine = machineService.getDetailedMachineInformation();
        return ResponseEntity.ok(detailedMachine);
    }
}
