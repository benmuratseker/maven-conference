import net.experiencein.model.Speaker;
import net.experiencein.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SpeakerService service = new SpeakerService();
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        List<Speaker> result = service.findAll();
        System.out.println(result.get(0).getFirstName() + " " + result.get(0).getLastName());
        //System.out.println(service);

        //SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        //System.out.println(service2);
    }
}