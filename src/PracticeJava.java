class PracticeJava {
    void main(String[] args) {
        Student s1 = new Student("Ly");
        Student s2 = new Student("Nhi");
        System.out.println(s1.getStudent());
        System.out.println(s2.getStudent());

        Student.setSchool("CTUT");

        System.out.println(s1.getStudent());
        System.out.println(s2.getStudent());
    }
}

class Student {
    String name;
    static String school = "FPT University";

    public Student(String name) {
        this.name = name;
    }

    public String getStudent() {
        return this.name + "- " + school;
    }

    public static void setSchool(String newSchool) {
        school = newSchool;
    }
}