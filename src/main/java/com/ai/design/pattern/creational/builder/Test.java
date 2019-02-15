package com.ai.design.pattern.creational.builder;

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java 设计", "PPT", "video", "article", "QA");
        System.out.println(course.toString());
    }
}
