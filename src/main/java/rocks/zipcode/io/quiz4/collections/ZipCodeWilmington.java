package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Map<Student, Double> studyMap = new LinkedHashMap<>();
    List<Student> studentList = new ArrayList<>();
    
    public void enroll(Student student) {
        studentList.add(student);
    }
    
    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }
    
    public void lecture(double numberOfHours) {
        for (Student student : studentList) {
        student.learn(numberOfHours);}
    }
    
    public Map<Student, Double> getStudyMap() {
        for (Student student : studentList){
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
