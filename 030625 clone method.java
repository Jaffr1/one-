package testing;

class Emp implements Cloneable{
    String name;
    int age;
    double salary;
    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


public class MainCls {
    public static void main(String[] args)throws CloneNotSupportedException {
        Emp e1 = new Emp("java",100,12345);
        Emp e2 = (Emp)e1.clone();
        System.out.println(e1);
        System.out.println(e2);
        e1.age=123;
        e1.name="abcd";
        System.out.println(e1);
        System.out.println(e2);
    }
}