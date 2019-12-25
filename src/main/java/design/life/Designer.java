package design.life;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Designer extends SpringBootServletInitializer {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(Designer.class, args);
        String ip = InetAddress.getLocalHost().getHostAddress();
        log.info("running: http://{}", ip);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Designer.class);
    }
}
