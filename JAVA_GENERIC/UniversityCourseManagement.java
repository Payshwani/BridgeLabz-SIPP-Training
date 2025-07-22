// 3. Multi-Level University Course Management System
import java.util.*;

abstract class CourseType { String name; CourseType(String name) { this.name = name; } }
class ExamCourse extends CourseType { ExamCourse(String name) { super(name); } }
class AssignmentCourse extends CourseType { AssignmentCourse(String name) { super(name); } }
class ResearchCourse extends CourseType { ResearchCourse(String name) { super(name); } }
class Course<T extends CourseType> {
    T type;
    Course(T type) { this.type = type; }
    public String toString() { return type.name; }
}
class UniversityDemo {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println(c.name);
    }
    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse("Math Exam"));
        List<AssignmentCourse> assignments = Arrays.asList(new AssignmentCourse("Java Assignment"));
        displayCourses(exams);
        displayCourses(assignments);
    }
}
