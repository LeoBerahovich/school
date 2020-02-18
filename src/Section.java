public class Section {
    String name = "";
    Object teacher = "";
    Student[] students = new Student[50];
    int stuCount = 0;

    public Section(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public Object getTeacher(){
        return this.teacher;
    }
    public void setTeacher(Teacher t){
        this.teacher = t;
    }
    public Student[] getStudents(){
        return students;
    }
    public void addStudent(Student s){
        students[stuCount] = s;
        stuCount ++;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return (this.name + " is taught by " + this.teacher + " and has " + this.stuCount + " students: " + this.students);
    }
}
