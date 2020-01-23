package Study_center;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Program {
    private Date programStartDate;
    private Date programEndDate;
    private String programName;
    private List<Course> courses = new ArrayList<>();
    private Calendar calendar = Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy HH:mm");

    public Program(String programStartDate, String programName) {
        format.setLenient(false);
        try {
            this.programStartDate = format.parse(programStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.programName = programName;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public String getProgramName() {
        return programName;
    }

    public void addCoursesToProgram(Course[] currentCourses) {
        for (Course course:currentCourses) {
            courses.add(course);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int countProgramDuration() {
        int programDurationHours = 0;
        for(Course course : courses) {
            programDurationHours += course.getCourseDuration();
        }
        return programDurationHours;
    }

    public void calculateProgrammEndDate() {
        int programmDurationHours = countProgramDuration();
        calendar.setTime(this.programStartDate);
        calendar.add(Calendar.DAY_OF_MONTH, programmDurationHours / 8);
        calendar.add(Calendar.HOUR_OF_DAY, programmDurationHours % 8);
        Date endDate = calendar.getTime();
        programEndDate = endDate;
    }

    public Date getProgramEndDate() {
        return programEndDate;
    }

    public String showProgramProgress(Date startTime, Date endTime) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        if(currentDate.before(startTime)) {
            return "Program has not been started yet \n";
        }
        else if (currentDate.after(endTime)) {
            return  "Program has been finished already \n";
        }
        else {
            return "Program is in progress \n";
        }
    }

    public String showProgramCourses () {
        String coursesLine = "";
        for (Course course:courses) {
            coursesLine += "COURSE: " + course.getCourseName() + " DURATION: " + course.getCourseDuration() + " hours: \n";
        }
        return coursesLine;
    }
}
