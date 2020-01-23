package Study_center.Reports;

import Study_center.Person.Student;
import Study_center.Program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {

    SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH.mm");
    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);
        Program program = currentStudent.getStudentsProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        StringBuilder longInfo = new StringBuilder();
        longInfo.append("STUDENT: " + currentStudent.getName() + " " + currentStudent.getSurName() + "\n");
        longInfo.append("STUDENTS PROGRAM: " + program.getProgramName() + "\n");
        longInfo.append("START: " + format.format(programStartDate) + "\n");
        longInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours" + "\n");
        if (program.getCourses() != null) {
            longInfo.append(program.showProgramCourses());
        }
        else {
            longInfo.append("No assigned courses for this student \n");
        }
        System.out.println(longInfo.toString());
    }
}
