import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;
import net.experiencein.service.ISpeakerService;
import net.experiencein.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration//this class will be used for configuration purposes -> class level
public class AppConfig {

    @Bean(name = "speakerService") // beans -> method level
    //@Scope(value = BeanDefinition.SCOPE_SINGLETON)
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)//
    //@Scope("singleton")
    public ISpeakerService getCSpeakerService() {
        SpeakerService service = new SpeakerService(getSpeakerRepository());
        //service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public ISpeakerRepository getSpeakerRepository() {
        return new SpeakerRepository();
    }
}
