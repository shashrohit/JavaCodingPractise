package org.shashank.dump.utils;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class Person {
    @NonNull
    public String firstName;
    @NonNull
    public String lastName;
    public Child []children;
}
