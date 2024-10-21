package org.itvdn.springdata.repository;

import org.itvdn.springdata.model.Unit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnitRepository extends MongoRepository<Unit, String> {
}
