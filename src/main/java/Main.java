import net.experiencein.model.Speaker;
import net.experiencein.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        List<Speaker> result = service.findAll();
        System.out.println(result.get(0).getFirstName() + " " + result.get(0).getLastName());
    }
}