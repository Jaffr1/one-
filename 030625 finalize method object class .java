public class ObjectClassMethod {
    public static void main(String[] args) {
        Person p1 = new Person(10,"java");
        Person p2 = new Person(12,"spring");
        System.out.println(p1);
        System.out.println(p2);
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
        Person p3 = new Person(12,"spring");;
        System.out.println(p2==p3);
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals("my name is "));
        System.out.println(p2.equals(new StringBuffer("yes")));
        System.out.println(p2.equals(null));
        System.out.println(p2.equals(new Person(1,"abcd")));
        //hashcode
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p3.hashCode());
        //GET CLASS
        System.out.println(p3.getClass());
        System.out.println(new String().getClass());
        System.out.println(new Scanner(System.in).getClass());
        System.out.println(new Scanner(System.in).getClass().getName());
        int[] a = new int[4];
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getName().equals(a.getClass().getName()));
       p3=null;
       p2=new Person(1,"ab");
       System.gc();//manually we call the Garbage Collector
        for (int i = 0; i <1234567 ; i++) {
            Person p = new Person(1,"java");//GC will call automatically
        }
    }
}
/*
if we use Object class toString() we get fully qualified class name + hashcode
if we Override the toString() in our class we get states.

if we use equals() it will compare reference
if we Override the equals() it will compare the address

hashcode() will generate number for each object.

getClass() will return the fully qualified class name

finalize()-> Garbage Collector(GC) will call finalize()
to perform cleanup process

using clone() we get copy of the Object
shallow copy - it will affect the original Object
deep copy - it will not affect the original Object
create Person Class then it has a Bike class Object
now you can clone the Person Object

 */