public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name);
    }

    @Override
    public String toString() {
        return name;
    }
}