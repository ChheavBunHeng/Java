package Java.Exam;

class Enca_Method
{
    private int age;
    public void setter(int age)
    {
        this.age = age;
    }
    public int Getter()
    {
        return age;
    }
}
class Main
{
    public static void main(String[] args) {
        Enca_Method En = new Enca_Method();
        En.setter(12); 
        System.out.println(En.Getter());
    }
}