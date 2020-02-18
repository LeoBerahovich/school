public class School {

    String name = "";
    int sectionCount = 0;
    Section[] sections = new Section[200];


    public School(String name, int sectionCount){
        this.name = name;
        this.sectionCount = 0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount ++;
    }
    public Section[] getSections(){
        return sections;
    }
    public String toString(){
        return ("The school named " + this.name + " has " + this.sectionCount + " sections");
    }
}
