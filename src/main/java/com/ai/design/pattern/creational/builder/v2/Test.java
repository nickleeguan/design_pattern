package com.ai.design.pattern.creational.builder.v2;

public class Test {



    public static void main(String[] args) {

        Course course = new Course.CourseBuilder().buildCourseName("java").buildCoursePPT("PPT").build();
        System.out.println(course.toString());
    }
}
