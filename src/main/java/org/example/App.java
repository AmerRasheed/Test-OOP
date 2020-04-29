
import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import org.example.Amer.Person;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Person person = new Person();

        person.setFirstName("Erik");
        person.setLastName("Svensson");
        person.setBirthDate(45);

        System.out.println("First Name" + person.getFirstName());
        System.out.println(" Last name " + person.getLastName());
        System.out.println("Birth day " + person.getBirthDate());

    }
}