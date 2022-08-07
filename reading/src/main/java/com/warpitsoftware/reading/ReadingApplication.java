package com.warpitsoftware.reading;

import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;

import com.warpitsoftware.reading.service.BookServiceCB;

@RestController
@SpringBootApplication
public class ReadingApplication {

	/*
	 * @RequestMapping("/to-read") public Mono<String> toRead() { return
	 * WebClient.builder().build()
	 * .get().uri("http://localhost:8090/recommended").retrieve()
	 * .bodyToMono(String.class); }
	 */
	
	 @Autowired
	  private BookServiceCB bookService;

	  @RequestMapping("/to-read")
	  public Mono<String> toRead() {
	    return bookService.readingList();
	  }	
	
  public static void main(String[] args) {
    SpringApplication.run(ReadingApplication.class, args);
  }
}