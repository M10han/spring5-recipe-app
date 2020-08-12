package practice.springframework.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.spring5recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
