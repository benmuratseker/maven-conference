import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;
import net.experiencein.service.ISpeakerService;
import net.experiencein.service.SpeakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//this class will be used for configuration purposes -> class level
public class AppConfig {

    @Bean(name = "speakerService") // beans -> method level
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
