public class Teacher extends Person{
    String name = "";
    String subject = "";
    Section[] sections = new Section[10];
    int sectCount = 0;

    public Teacher(String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String n){
        this.subject = n;
    }
    public Section[] getSections(){
        return sections;
    }
    public void addSection(Section s){
        sections[sectCount] = s;
        sectCount++;
    }
    public String toString(){
        return (this.name + " teachers the following subjects: " + sections);
    }
}
