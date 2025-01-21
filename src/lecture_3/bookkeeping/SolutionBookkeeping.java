package lecture_3.bookkeeping;

import java.util.ArrayList;
import java.util.List;

public class SolutionBookkeeping {

    private List<Employee> waitingEmployees = new ArrayList<>();


    private List<Employee> alreadyGotSalaryEmployees = new ArrayList<>();

    private void fillArray(){
        waitingEmployees.add(new Employee("Sasha", false));
        waitingEmployees.add(new Employee("Stepa", false));
        waitingEmployees.add(new Employee("Vasya", false));
        waitingEmployees.add(new Employee("Igor", false));
        alreadyGotSalaryEmployees.add(new Employee("Kolya", true));
    }

    public SolutionBookkeeping() {
        fillArray();

    }

    public List<Employee> getWaitingEmployees() {
        return waitingEmployees;
    }

    public void paySalary(String nameEmployee){
        if(nameEmployee == null)
            return;
        Employee employee = new Employee(nameEmployee, true);
        if(!alreadyGotSalaryEmployees.isEmpty()) {
            if(!alreadyGotSalaryEmployees.contains(employee)){
                alreadyGotSalaryEmployees.add(employee);
            }

        }else {
            alreadyGotSalaryEmployees.add(employee);
        }

        System.out.println("Получили зарплату" + alreadyGotSalaryEmployees.toString());
    }
}
