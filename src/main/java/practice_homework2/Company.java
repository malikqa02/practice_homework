package practice_homework2;

public class Company {
    static String companyName = "IQM";
    final int employeeID;
    String employeeName;
    Company(int someEmployeeID, String someEmployeeName){
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }
    String getEmployeeName(){
        return employeeName;
    }
    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }
    public static void printCompanyName(){
        System.out.println(companyName);
    }

}
