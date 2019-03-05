import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Java8 {



    public  static void main(String args[]) {
        Person a1 = new Person("hello" , 12 ) ;
        Person a2 = new Person("hello" , 13 ) ;
        Person a3 = new Person("ello" , 15 ) ;

        List<Person> list = new ArrayList<Person>() {
            {
                add(a1);
                add(a2);
                add(a3);
            }
        };
        list.sort((a,b) -> {
            if(a.getName().equals(b.getName()))
                return b.getAge() - a.getAge() ;
            else
                return  a.getName().compareTo(b.getName());
        }
        );
        for(Person person : list) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        UniqueId<Person> PersonuniqueId =  a -> a.getName() + " " + String.valueOf(a.getAge()) ;
        UniqueId<Section> SectionuniqueId =  a -> a.getName() + "-" + String.valueOf(a.getCode()) ;

       System.out.println(PersonuniqueId.getUiqueId(list.get(0))) ;
       System.out.println(SectionuniqueId.getUiqueId(new Section("Java8", "Java201"))) ;
       System.out.println(SectionuniqueId.getUiqueId(new Section("Java8", "Java201"))) ;
       System.out.println(Person.getPersonProperty(list.get(0),a-> a.getName())) ;
       Function f2 = Person.getPersonProperty("name");
        Function f3 = Person.getPersonProperty("age");
        System.out.println(f2.apply(list.get(0)));
        System.out.println(f3.apply(list.get(0)));





    }

}
