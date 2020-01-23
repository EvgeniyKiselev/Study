package Study_center;
import Study_center.Person.Student;
import Study_center.Reports.Report;
import Study_center.Reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Petrov");
        Course java = new Course("Java", 16);
        Course js = new Course("JavaScript", 10);
        Program program = new Program("15/01/2020 10:00", "Programming");
        Course courses[] = new Course[] {java, js};
        program.addCoursesToProgram(courses);
        ivan.setStudentsProgram(program);
        program.calculateProgrammEndDate();
        System.out.println("--------------Short Report--------------");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(ivan);
        System.out.println("--------------Long Report--------------");
        Report longReport = new ShortReport();
        longReport.showReportForStudent(ivan);
    }
}
