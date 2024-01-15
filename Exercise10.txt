class Employee{
    int empId;
    String name;
    double salary;

    public double getsalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return empId;
    }
    public void setId(int empId){
        this.empId = empId;
    }
    
}
class PermanentEmp extends Employee{
    double bpay;
    double hra;
    int exp;

    public double getBpay(){
        return bpay;
    }
    public void setBpay(double bpay){
        this.bpay = bpay;
    }
    public double gethra(){
        return hra;
    }
    public void sethra(double hra){
        this.hra = hra;
    }
    public int getexp(){
        return exp;
    }
    public void setexp(int exp){
        this.exp = exp;
    }
    public void calcSalary(){
        double varCom;
        if(exp<3){
        varCom=0;
        }
        else if((exp>=3) && (exp<5)){
        varCom=bpay*0.05;
        }
        else if((exp>=5) && (exp>7)){
        varCom=bpay*0.07;
        }
        else{
        varCom=bpay*0.12;
        }
        salary=varCom+bpay+hra;
        System.out.println("Permanent Employee : " + name + "'s salary is: "+salary);
    }
}
class ContractEmp extends Employee{
    double wage;
    int hrs;

    public double getWage(){
        return wage;
    }
    public void setWage(double wage){
        this.wage = wage;
    }
    public int gethrs(){
        return hrs;
    }
    public void setHrs(int hrs){
        this.hrs = hrs;
    }
    public void calcSalary(){
        System.out.println("Contract Employee: " + name + "'s salary is: "+(hrs*wage));
    }
}
public class EmpRecords {
    public static void main(String[] args) {
        PermanentEmp p = new PermanentEmp();
        ContractEmp c = new ContractEmp();

        p.setName("Anil");
        p.setId(101);
        p.setBpay(10000);
        p.sethra(1500);
        p.setexp(3);
        p.calcSalary();

        c.setName("Ankit");
        c.setId(102);
        c.setWage(500);
        c.setHrs(10);
        c.calcSalary();
    }
}

// Permanent Employee : Anil's salary is: 12000.0
// Contract Employee: Ankit's salary is: 5000.0