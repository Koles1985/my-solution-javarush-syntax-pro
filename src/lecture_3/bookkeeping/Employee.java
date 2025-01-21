package lecture_3.bookkeeping;

public class Employee {
    private String name;
    private boolean isGotSalary;

    public Employee(String name, boolean isGotSalary) {
        this.name = name;
        this.isGotSalary = isGotSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGotSalary() {
        return isGotSalary;
    }

    public void setGotSalary(boolean gotSalary) {
        isGotSalary = gotSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isGotSalary=" + isGotSalary +
                '}';
    }
}
