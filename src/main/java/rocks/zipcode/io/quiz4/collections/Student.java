package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setTotalStudyTime(Double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
    
    public Double getAmountOfHours() {
        return amountOfHours;
    }
    
    public void setAmountOfHours(Double amountOfHours) {
        this.amountOfHours = amountOfHours;
    }
    
    Double totalStudyTime = 0.0;
    Double amountOfHours = 0.0;
    
    public Student() {
        this(1);
    }
    
    public Student(Integer id) {
        this.id = id;
    }
    
    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }
    
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
