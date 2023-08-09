package edu.hitwh.taco.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Cocoicobird
 * @version 1.0
 */
@Data
public class Taco {

    private Long id;

    private Date createdAt = new Date();

    /**
     * 塔克名称
     */
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    /**
     * 塔克配料
     */
    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
