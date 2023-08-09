package edu.hitwh.taco.domain;

import lombok.Data;

/**
 * @author Cocoicobird
 * @version 1.0
 */
@Data
public class Ingredient {
    private final String id;

    /**
     * 配料名称
     */
    private final String name;

    /**
     * 配料种类
     */
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
