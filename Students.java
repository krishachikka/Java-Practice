public class Students {
    private int studentId;
    private String Name;
    private float qExamMarks;
    private char resiStatus;
    private int yearOfEngg;

    // getters to get the values of the private variables
    public int getStudentID() {
        return studentId;
    }

    public String getName() {
        return Name;
    }

    public float getqExamMarks() {
        return qExamMarks;
    }

    public char getResiStatus() {
        return resiStatus;
    }

    public int getYear() {
        return yearOfEngg;
    }

    // setters to change the values of the private variables
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setqExamMarks(float qExamMarks) {
        this.qExamMarks = qExamMarks;
    }

    public void setResiStatus(char resiStatus) {
        this.resiStatus = resiStatus;
    }

    public void setYear(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public static void main(String[] args) {
        Students s = new Students();

        s.setStudentId(1001);
        s.setName("Jacob");
        s.setqExamMarks(80);
        s.setResiStatus('D'); 
        s.setYear(3);

        System.out.println("Student Name       : " + s.getName());
        System.out.println("Student Id         : " + s.getStudentID());
        System.out.println("Qualifying Marks   : " + s.getqExamMarks());
        System.out.println("Year Of Engineering: " + s.getYear());

        if (s.getResiStatus() == 'H') { 
            System.out.println("Residential status : Hosteller");
        } else {
            System.out.println("Residential status : Day Scholar");
        }


    }
}
// OUTPUT

// Student Name       : Jacob
// Student Id         : 1001
// Qualifying Marks   : 80.0
// Year Of Engineering: 3
// Residential status : Day Scholar