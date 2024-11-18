package lab3.problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    Vector<Employee> team;
    double bonus;

    public Manager() {
        super();
        this.team = new Vector<>();
    }

    public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }



    public void addTeamMember(Employee employee) {
        this.team.add(employee);
    }

    public void removeTeamMember(Employee employee) {
        this.team.remove(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    @Override
    public String toString() {
        return super.toString() + ", bonus = " + bonus + ", team size = " + team.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 && team.equals(manager.team);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager otherManager) {
            int salaryComparison = Double.compare(this.getSalary(), otherManager.getSalary());
            if (salaryComparison != 0) {
                return salaryComparison;
            }
            // ес зпшка одинаковая, то проверяем по бонусу
            return Double.compare(this.bonus, otherManager.bonus);
        }
        return super.compareTo(other);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Manager cloned = (Manager) super.clone();
            cloned.team = (Vector<Employee>) this.team.clone(); // shallow
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported");
        }
    }
}

