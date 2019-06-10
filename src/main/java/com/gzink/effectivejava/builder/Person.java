package com.gzink.effectivejava.builder;


public class Person {

    private String name;
    private String sex;
    private Integer age;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public static PersonBuilder builder(String name) {
        return new PersonBuilder(name);
    }

    public static class PersonBuilder {
        private String name;
        private String sex;
        private Integer age;

        private PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
