package org.shashank.optional;

import java.util.Optional;

class Person {

    private final String name;
    private final String email;

    Person(String name, String email){
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
public class OptionalUsage {

    public static void main(String[] args) {

        Person person = new Person("Shashank", null);

        String email = person.getEmail().map(String::toLowerCase).orElse("Email not available");
        System.out.println(email);

        // OR
        Optional<String> emailOptional = person.getEmail();

        if(emailOptional.isPresent()){
            System.out.println(email.toLowerCase());
        }
        else{
            System.out.println("Email not available");
        }

    }
}
