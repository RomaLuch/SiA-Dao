import dao.Rep;
import model.Spitter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Рома on 01.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        //JDBC
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringDAO.xml");

*/
/*        Rep test = (Rep)context.getBean("jdbcrep");

        test.addSpitter(new Spitter("ya","on","ay"));

        test.saveSpitter(new Spitter("1","2","3"));

        Spitter spitter = test.getSpitterById(6);
        System.out.println(spitter);*//*


        Rep test = (Rep)context.getBean("springrep");

        test.addSpitter(new Spitter("yaspring","on","ay"));
        Spitter spitter = test.getSpitterById(2);
        System.out.println(spitter);
*/
// Hibernate

/*        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Hibernate.xml");
        Rep test = (Rep)context.getBean("hiber");
        test.addSpitter(new Spitter("yaspring","on","ay"));
        Spitter spitter = test.getSpitterById(2);
        System.out.println(spitter);
        Spitter spitter1 = test.getSpitterById(6);
        System.out.println(spitter1);*/

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_JPA.xml");
        Rep test = (Rep)context.getBean("jparep");
        test.addSpitter(new Spitter("yaspring","on","ay"));
        Spitter spitter = test.getSpitterById(2);
        System.out.println(spitter);
        Spitter spitter1 = test.getSpitterById(6);
        System.out.println(spitter1);
    }
}
