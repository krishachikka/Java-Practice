class EmployeePerformance {
    private int point = 10;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

class PerformanceRating {
    private static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;

    static int calculatePerformance(EmployeePerformance employee) {
        if (employee.getPoint() >= 80 && employee.getPoint() <= 100)
            return Outstanding;
        else if (employee.getPoint() >= 60 && employee.getPoint() <= 79)
            return Good;
        else if (employee.getPoint() >= 50 && employee.getPoint() <= 59)
            return Average;
        else if (employee.getPoint() >= 1 && employee.getPoint() <= 49)
            return Poor;
        else
            return 0;
    }
}

public class EmpPerformance {
    public static void main(String[] args) {
        EmployeePerformance e1 = new EmployeePerformance();
        e1.setPoint(91);
        System.out.println("Your Performance is: " + PerformanceRating.calculatePerformance(e1));
        EmployeePerformance e2 = new EmployeePerformance();
        e2.setPoint(77);
        System.out.println("Your Performance is: " + PerformanceRating.calculatePerformance(e2));
        EmployeePerformance e3 = new EmployeePerformance();
        e3.setPoint(55);
        System.out.println("Your Performance is: " + PerformanceRating.calculatePerformance(e3));
        EmployeePerformance e4 = new EmployeePerformance();
        e4.setPoint(20);
        System.out.println("Your Performance is: " + PerformanceRating.calculatePerformance(e4));

    }

}

// OUTPUT
// Your Performance is: 5
// Your Performance is: 4
// Your Performance is: 3
// Your Performance is: 2