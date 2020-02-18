public class Runner {
    public void main(String[] args){
        School school = new School("Berkeley High",200);
        Teacher albinson = new Teacher("Albinson",0,"Computer Science");
        Teacher teacher1 = new Teacher("Teacher1",0,"Math");
        Teacher teacher2 = new Teacher("Teacher2",0,"English");
        Section compSci = new Section("Computer Science", albinson);
        Section math = new Section("Math", teacher1);
        Section english = new Section("English",teacher2);
        Student Leo = new Student("Leo",0,100);
        Student Leon = new Student("Leon",0,90);
        Student Leonidus = new Student("Leonidus",0,93);
        Student Leonard = new Student("Leonard",0,87);
        Student Leonardo = new Student("Leonardo",0,97);
        Student Bill = new Student("Bill",0,2);
        System.out.print(school.toString());
        System.out.print(albinson.toString());
        System.out.print(teacher1.toString());
        System.out.print(teacher2.toString());
        System.out.print(compSci.toString());
        System.out.print(math.toString());
        System.out.print(english.toString());
        System.out.print(Leo.toString());
        System.out.print(Leon.toString());
        System.out.print(Leonidus.toString());
        System.out.print(Leonard.toString());
        System.out.print(Leonardo.toString());
        System.out.print(Bill.toString());
    }
}
