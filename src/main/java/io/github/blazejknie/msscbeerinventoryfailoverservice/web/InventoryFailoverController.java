package io.github.blazejknie.msscbeerinventoryfailoverservice.web;

import io.github.blazejknie.msscbeerinventoryfailoverservice.model.BeerInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
public class InventoryFailoverController {

    @GetMapping("inventory-failover")
    List<BeerInventoryDto> listBeersById() {
        log.debug("Inventory Failover");

        return List.of(
                BeerInventoryDto.builder()
                        .id(UUID.randomUUID())
                        .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                        .quantityOnHand(999)
                        .createdDate(OffsetDateTime.now())
                        .lastModifiedDate(OffsetDateTime.now())
                        .build());
    }
}
