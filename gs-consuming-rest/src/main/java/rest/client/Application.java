package rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import rest.vo.Header;
import rest.vo.Headers;
import rest.vo.Ip;
import rest.vo.Quote;
import rest.vo.User;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
				log.info(quote.toString());
			}
		};
	}

	@Bean
	public CommandLineRunner getIp(RestTemplate restTemplate) throws Exception {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Ip ip = restTemplate.getForObject("https://httpbin.org/ip", Ip.class);
				String origin = ip.getOrigin();
				log.info("{}", origin);
			}
		};
	}

	@Bean
	public CommandLineRunner getHeader(RestTemplate restTemplate) throws Exception {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Header header = restTemplate.getForObject("https://httpbin.org/headers", Header.class);
				Headers headers = header.getHeaders();
				log.info("{}", headers);
			}
		};
	}

	@Bean
	public CommandLineRunner postBody(RestTemplate restTemplate) throws Exception {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				User reqUser = new User();
				reqUser.setId("wikiyo");
				reqUser.setName("jhmin");
				User resUser = restTemplate.postForObject("https://httpbin.org/post", reqUser, User.class);
				log.info(resUser.toString());
			}
		};
	}
}