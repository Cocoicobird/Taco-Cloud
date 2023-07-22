package edu.hitwh.taco.domain;

import lombok.Data;

/**
 * @author Cocoicobird
 * @version 1.0
 */
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
