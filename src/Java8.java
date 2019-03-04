import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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



    }
}
