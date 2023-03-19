package org.shashank.knowledge.designpatterns;

final class Student {

    // final instance fields
    private final int id;
    private final String name;
    private final String address;

    public Student(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static Builder Builder(){
        return new Builder();
    }

    // Static class Builder
    public static class Builder {

        /// instance fields
        private int id;
        private String name;
        private String address;

        private Builder() {}

        // Setter methods
        public Builder withId(int id)
        {
            this.id = id;
            return this;
        }
        public Builder withName(String name)
        {
            this.name = name;
            return this;
        }
        public Builder withAddress(String address)
        {
            this.address = address;
            return this;
        }

        // build method to deal with outer class
        // to return outer instance
        public Student build()
        {
            return new Student(this);
        }
    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}

public class BuilderPattern {

    public static void main(String[] args) {
        Student student = Student.Builder()
                .withId(1)
                .withName("Ram")
                .withAddress("Noida")
                .build();
    }
}
