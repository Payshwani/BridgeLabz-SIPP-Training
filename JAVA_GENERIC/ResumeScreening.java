// 5. AI-Driven Resume Screening System
import java.util.*;

abstract class JobRole { String title; JobRole(String title) { this.title = title; } }
class SoftwareEngineer extends JobRole { SoftwareEngineer() { super("Software Engineer"); } }
class DataScientist extends JobRole { DataScientist() { super("Data Scientist"); } }
class ProductManager extends JobRole { ProductManager() { super("Product Manager"); } }
class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
    public String toString() { return "Resume for: " + role.title; }
}
class ResumeScreening {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole r : resumes) System.out.println("Screening: " + r.title);
    }
    public static void main(String[] args) {
        List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        processResumes(roles);
    }
}
