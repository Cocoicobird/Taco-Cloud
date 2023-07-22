package edu.hitwh.taco.domain;

import lombok.Data;

import java.util.List;

/**
 * @author Cocoicobird
 * @version 1.0
 */
@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
