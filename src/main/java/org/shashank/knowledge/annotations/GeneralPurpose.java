package org.shashank.knowledge.annotations;

/*
1. @Override

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}
This generates error if any mistake while overriding.

2. @Deprecated

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
This generates warning if we use deprecated code.

3. @FunctionalInterface

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}

If we use it for an interface that has more than one abstract method, warnings.

4. @SuppressWarnings

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {
    String[] value();
}
 */


public class GeneralPurpose {

}
