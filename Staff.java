// Staff will contain name, ID,job ( can be nurse, school psychologist, janitor, cleaning lady, school cook, etc)
// also will have a salary which can be modified
public class Staff { 
    private String name;
    private int ID;
    private String job;
    private int salary;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //modify staff's salary by adding or subtracting from current salary
    public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }
}