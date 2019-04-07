package com.jerry.web.data;

import com.jerry.web.model.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();

	Ingredient findOne(String id);

	Ingredient save(Ingredient ingredient);

	Ingredient findById(String id);

}
