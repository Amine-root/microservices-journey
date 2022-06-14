package com.boot.strt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	class Resource {
		@RequestMapping(value="/hello", method=RequestMethod.GET)
		Message getMessage() {
			return new Message("Hello world !");
		}		
	}

	class Message {
		private final String message;

		public String getMessage() {
			return message;
		}

		public Message(String message) {
			super();
			this.message = message;
		}

		@Override
		public String toString() {
			return "Message [message=" + message + "]";
		}

	}

}


