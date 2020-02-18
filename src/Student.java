public class Student extends Person {
    String name = "";
    int grade = 0;
    Section[] sections = new Section[10];
    int sectCount = 0;

    public Student(String name, int id, int grade){
        super(name, id);
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int g){
        this.grade = g;
    }
    public Section[] getSections(){
        return sections;
    }

    public void addSection(Section s){
        sections[sectCount] = s;
        sectCount++;
    }
    public String toString(){
        return (this.name + " has a " + this.grade + " average in his classes, and his enrolled in: " + sections);
    }
}
