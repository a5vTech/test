package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @GetMapping("/")

    public String index(Model model) {
        AccessDB accessDB = AccessDB.getInstance();
        ArrayList<Vendors> vendorList = accessDB.executeStamementVendorList();


        model.addAttribute("vendorList", vendorList);
        return "index";
    }
}
