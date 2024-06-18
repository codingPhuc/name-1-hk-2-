public class Student{
    private String name;
    private String gender ;
    private int age ;
    public Student()//over loading the method student with no varible  
    {
        this.name = " "; 
        this.gender = " male";
        this.age = 0 ;
    }
    public Student (String name , String gender , int age)//over loading the method student with three varible a string name , gender , and age 
    {
        this.name =  name ;
        this.gender= gender ;
        this.age = age ;
    }
    public Student(Student st)//over loading the method student with class varible st 
    {
        this.name = st.name;
        this.gender = st.gender ;
        this.age = st.age ;
    }
    void studying(){
        System.out.println("studying...");
    }
    void reading()
    {
        System.out.println("reading...");
    }
    public String getName()
    {
        return this.name ;//we use this pointer to refer to the name of the ofject in the class ie : Student class 
    }
    public String getGender(){
        return this.gender; //we use this pointer to refer to the name of the ofject in the class ie : Student class 
    }
    public int getAge()
    {
        return this.age ;//we use this pointer to refer to the name of the ofject in the class ie : Student class 
    }
    public void setName(String name)
    {
        this.name = name ; 
    }
    public void setGender(String gender)
    {
        this.gender = gender ;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    @Override
        public String toString() 
        {
        return "Student[" + name + ", " + gender + ", " + age + "]";
        }
            

}