import java.io.*;
public class EmployeeDetails {
    public static void main(String[] args) throws IOException {

       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter Employee ID::");
       int empid=Integer.parseInt(br.readLine());

       System.out.println("Enter Employee Name::");
       String empname=br.readLine();

       System.out.println("Enter a Emloyee Sex::");
       char empsex=br.readLine().charAt(0);
       
       System.out.println("Enter Employee Salary::");
       float empsalary=Float.parseFloat(br.readLine());

       System.out.println("This Detail of Employee::");

       System.out.println("ID of Employee -"+empid);
       System.out.println("Name of Employee -"+empname);
       System.out.println("sex of Employee -"+empsex);
       System.out.println("The Salary of Employee -"+empsalary);

    }
}
