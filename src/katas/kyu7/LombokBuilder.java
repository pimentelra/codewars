package katas.kyu7;

import lombok.Builder;
import lombok.Getter;

public class LombokBuilder {
    @Builder
    @Getter
    public class People {
        private final int age;
        private final String name;
        private final String lastName;
        private final String city;
        private final String job;

        private final String GREET = "hello";

        public String greet() {return GREET + " my name is " + name;}
    }
}
