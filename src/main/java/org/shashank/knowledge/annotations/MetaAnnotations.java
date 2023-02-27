package org.shashank.knowledge.annotations;

/*
1. @Target -

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Target {
     * @return an array of the kinds of elements an annotation type can be applied to
    ElementType[] value();
}

public enum ElementType {
    TYPE, other annotations
    FIELD,
    METHOD,
    PARAMETER,
    CONSTRUCTOR,
    LOCAL_VARIABLE,
    ANNOTATION_TYPE,
    PACKAGE,
    TYPE_PARAMETER,
    TYPE_USE
}

2. @Retention -

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Retention {
     * @return the retention policy
    RetentionPolicy value();
}

public enum RetentionPolicy {
    SOURCE, CLASS, RUNTIME
}

3. @Inherited

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
    public @interface Inherited {
}

4. @Documented (persisted by javadoc and other similar tools for documentation)

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
    public @interface Documented {
}
 */

import java.lang.annotation.ElementType;

public class MetaAnnotations {

    public static void main(String[] args) {

    }
}
