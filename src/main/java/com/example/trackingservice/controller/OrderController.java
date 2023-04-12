package com.example.trackingservice.controller;

import com.example.trackingservice.model.Item;
import com.example.trackingservice.model.ItemDetails;
import com.example.trackingservice.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trackings")
public class OrderController {

    @GetMapping("/{orderId}/{itemId}")
    public Item getOrderStatus(@PathVariable int orderId, @PathVariable int itemId) {
        Item tempItem = new Item();
        tempItem.setShippingStatus("shipped");
        tempItem.setDate("3/28/2023");
        return tempItem;
    }

    @PutMapping("/{id}")
    public Item update(@RequestBody ItemDetails itemDetails, @PathVariable int id) {
        Item tempItem = new Item();
        tempItem.setDate("3/28/2023");
        tempItem.setShippingStatus(itemDetails.getStatus());
        return tempItem;
    }

}
