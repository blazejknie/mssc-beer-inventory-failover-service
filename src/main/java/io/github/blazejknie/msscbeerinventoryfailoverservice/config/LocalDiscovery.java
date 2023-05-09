package io.github.blazejknie.msscbeerinventoryfailoverservice.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local_discovery")
@EnableDiscoveryClient
@Configuration
public class LocalDiscovery {
}
