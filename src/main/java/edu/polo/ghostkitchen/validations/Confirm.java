package edu.polo.ghostkitchen.validations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.*;
import jakarta.validation.*;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = ConfirmValidator.class)
@Documented
public @interface Confirm {
        String message() default "Las contraseñas no coinciden";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default{};
}
