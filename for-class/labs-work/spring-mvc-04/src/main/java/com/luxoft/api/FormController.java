package com.luxoft.api;

import com.luxoft.domain.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SuppressWarnings("unused")
public class FormController {

    private final ItemsService service;

    @Autowired
    public FormController(ItemsService service) {
        this.service = service;
    }

    // TODO: add shopping cart here

    // TODO: add availableItems attribute using @ModelAttribute

    @GetMapping("/")
    public String orderPage(Model model) {

        // TODO: add items from the shopping cart here

        return "order";
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int id) {

        // TODO: get item from the service and add it to the shopping cart

        return "redirect:/";
    }

    @GetMapping("/order")
    public String order() {

        // TODO: call service.order for all selected items and clear cart

        return "redirect:/";
    }
}
