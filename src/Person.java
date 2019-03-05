import java.util.function.Function;

public class Person {

    private String name ;
    private int age;
    public Person(String name,int age) {
        this.name = name ;
        this.age = age ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static String getPersonProperty(Person person, Function<Person,String> f) {
        return f.apply(person) ;
    }

    public static  Function<Person,String> getPersonProperty(String property) {
        if(property.equals("name"))
        return a-> a.getName() ;
        else
            return a-> String.valueOf(a.getAge()) ;
    }
}
