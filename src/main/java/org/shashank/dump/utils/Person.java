package org.shashank.dump.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Person {
    @NonNull
    String firstName;
    @NonNull
    String lastName;
}
