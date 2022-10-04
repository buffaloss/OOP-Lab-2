public class SchoolSimulation{

    public static void main(String[] args) {
        //create a new school
        School sch = new School();
        sch.setName("Lyceum of Modern Languages and Management");
        sch.setSurface(5120);
        sch.setAnnualFunds(70000);
        
        //create location
        Location l = new Location();
        l.setCity("Chisinau");
        l.setAdress("Petru Rares 39");

        //create a student
        Student s = new Student();
        s.setName("John Smith");
        s.setPresence("present");
        s.setID(2917374);
        s.setGrade(7);

        //create anotehr student
        Student s1 = new Student();
        s1.setName("Ioana Braga");
        s1.setPresence("absent");
        s1.setID(8389118);
        s1.setGrade(11);

        //Ioana first was late, then came, so modify presence
        System.out.println(s1.getName()+" is currently "+s1.getPresence());
        s1.modifyPresence("present");
        System.out.println(s1.getName()+" is now "+s1.getPresence());

        //create a teacher
        Teacher t = new Teacher();
        t.setID(2174388);
        t.setName("Maria Ghita");
        t.setSubject("Physical Education");
        t.setSalary(1200);

        //modify the salary of the teacher
        System.out.println(t.getName()+" had a salary of  "+t.getSalary()+"$ last month.");
        t.modifySalary(1650);
        System.out.println(t.getName()+" currently has a salary of "+t.getSalary()+"$.");

    }

}