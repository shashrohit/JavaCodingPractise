package org.shashank.dump;

import java.util.*;
import java.util.stream.Collectors;

class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;

    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
}

class Student{
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}

class Address{
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

class MobileNumber{
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}


public class Practise2 {
    public static void main(String[] args) {

        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        // Get student with exact match name "jayesh"

        List<Student> st = students.stream().filter(a -> a.getName().equals("Jayesh")).collect(Collectors.toList());
        System.out.println(st.size() >0 ? st.get(0).toString() : "No student found");
            // Get student with matching address "1235"
        Optional<Student> output = students.stream()
                .filter(s -> s.getAddress().getZipcode().equals("1235"))
                .findFirst();

        System.out.println(output.isPresent() ? output.get().toString() : "None");

        //Get all student having mobile numbers 3333.

        List<Student> output2 = students.stream().filter(s -> {
            List<MobileNumber> list = s.getMobileNumbers();
            boolean flag = false;
            for(MobileNumber mobile: list){
                if (mobile.getNumber().equals("1233") || mobile.getNumber().equals("1234")) {
                    flag = true;
                    break;
                }
            }
            return flag;
        }).collect(Collectors.toList());
        output2.forEach(s -> System.out.println(s.getName()));

        // Convert List<Student> to List<String> of student name

        List<String> studentNames = students.stream().map(Student::getName).collect(Collectors.toList());
        studentNames.forEach(System.out::println);

        // Change the case of List<String>
        List<String> studentNames2 = studentNames.stream().map(String::toUpperCase).collect(Collectors.toList());
        studentNames2.forEach(System.out::println);

        //Sort List<String>

        Collections.sort(studentNames);
        studentNames.forEach(System.out::println);
        studentNames.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
        List<Student> students2 = new ArrayList<>();

        tmpStudents.stream().forEach(s -> {
            students2.add(new Student(s.name, s.age, s.address, s.mobileNumbers));
        });
        students2.forEach(System.out::println);

//        Convert List<students> to String
        students2.stream().map(Student::toString).forEach(System.out::println);

    }
}


