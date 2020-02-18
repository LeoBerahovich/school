public class Person {
    String name = "";
    int id = 0;
    static int nextId = 1;

    public Person(String name,int id){
        this.name = name;
        this.id = nextId;
        nextId++;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
}
