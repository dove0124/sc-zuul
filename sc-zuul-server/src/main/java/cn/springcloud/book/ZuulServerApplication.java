package cn.springcloud.book;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import cn.springcloud.book.filter.AuthFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableCircuitBreaker
public class ZuulServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ZuulServerApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        //        SpringApplication.run(ZuulServerApplication.class, args);
        Environment env = SpringApplication.run(ZuulServerApplication.class, args)
                                           .getEnvironment();
        String protocol = "http";

        logger.info(
            "\n----------------------------------------------------------\n\t"
            + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}\n\t"
            + "External: \t{}://{}:{}\n\t"
            + "Profile(s): \t{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"), protocol, env.getProperty("server.port"), protocol,
            InetAddress.getLocalHost()
                       .getHostAddress(), env.getProperty("server.port"), env.getActiveProfiles());
    }

    @Bean
    public AuthFilter preRequestFilter() {
        return new AuthFilter();
    }
}
