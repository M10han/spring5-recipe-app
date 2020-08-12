package practice.springframework.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.spring5recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
