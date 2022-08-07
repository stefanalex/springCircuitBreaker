# springCircuitBreaker
Spring Cloud Circuit Breaker Guide

#Apply The Circuit Breaker Pattern

Spring Cloud Circuit Breaker supports many different circuit breaker implementations including
 
Resilience4J, Hystrix, Sentinal, and Spring Retry. 

In this guide we will use the Resilience4J

Spring Cloud’s Circuit Breaker library provides an implementation of the Circuit Breaker pattern: 

1. when we wrap a method call in a circuit breaker, Spring Cloud Circuit Breaker watches for failing calls to that method
2. if failures build up to a threshold, Spring Cloud Circuit Breaker opens the circuit so that subsequent calls automatically fail. 
3. While the circuit is open, Spring Cloud Circuit Breaker redirects calls to the method, and they’re passed on to our specified fallback method, INSTEAD our users will get a nasty HTTP 500 error message

##Implementation

The ReactiveCircuitBreakerFactory has a single method called create we can use to create new circuit breakers
Once we have our circuit breaker all we have to do is call run

Run takes a Mono or Flux and an optional Function
The optional Function parameter acts as our fallback if anything goes wrong. 
In our sample here the fallback will just return a Mono containing the String Cloud Native Java (O’Reilly)

##More info

[spring-boot-multi-module-project](https://www.geeksforgeeks.org/spring-boot-multi-module-project/)

[Multi-Module Micro-Service with Spring Boot](https://blogs.prama.ai/multi-module-micro-service-with-spring-boot-part-1-4-fece3755d0cf)

[baeldung-Circuit Breaker](https://www.baeldung.com/spring-cloud-circuit-breaker)

[Spring Cloud Circuit Breaker Guide](https://spring.io/guides/gs/cloud-circuit-breaker/)

[MicroServices] (https://www.sivalabs.in/categories/microservices/)

