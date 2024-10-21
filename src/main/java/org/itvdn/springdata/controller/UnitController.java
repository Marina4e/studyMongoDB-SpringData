package org.itvdn.springdata.controller;

import org.itvdn.springdata.model.Unit;
import org.itvdn.springdata.service.UnitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("unit")
public class UnitController {

    private UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUnit(@RequestBody Unit unit) {
        return unitService.createUnit(unit);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Unit>> getAllUnits() {
        return unitService.getAllUnits();
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUnit(@RequestBody Unit unit) {
        return unitService.updateUnit(unit);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteUnit(@RequestBody String id) {
        return unitService.deleteUnit(id);
    }
}
