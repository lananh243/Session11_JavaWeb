package com.data.session11_javaweb.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CheckCategoryExistImp.class)
@Target({
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.ANNOTATION_TYPE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckCategoryExist {
    String message() default "Tên của danh mục phải là duy nhất !";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
