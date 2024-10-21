package org.itvdn.springdata.service;

import org.itvdn.springdata.model.Unit;
import org.itvdn.springdata.repository.UnitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    private UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public ResponseEntity<?> createUnit(Unit unit) {
        unitRepository.save(unit);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    public ResponseEntity<List<Unit>> getAllUnits() {
        return ResponseEntity.ok(unitRepository.findAll());
    }

    public ResponseEntity<?> updateUnit(Unit unit) {
        if (unitRepository.existsById(unit.getId())) {
            unitRepository.save(unit);
            return ResponseEntity.ok(HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    public ResponseEntity<?> deleteUnit(String id) {
        if (unitRepository.existsById(id)) {
            unitRepository.deleteById(id);
            return ResponseEntity.ok(HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
