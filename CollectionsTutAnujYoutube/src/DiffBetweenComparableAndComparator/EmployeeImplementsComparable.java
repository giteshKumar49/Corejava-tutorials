package DiffBetweenComparableAndComparator;

public class EmployeeImplementsComparable implements Comparable<EmployeeImplementsComparable>{
    private String name;
    private String phone;
    private int empId;

    public EmployeeImplementsComparable(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int compareTo(EmployeeImplementsComparable that) {
        return this.empId - that.empId;
    }
}
