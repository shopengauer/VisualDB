package com.vspavlov.visualdb.web;

import com.vspavlov.visualdb.domain.Device;
import com.vspavlov.visualdb.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by Василий on 12.07.2015.
 */
@Controller
public class HomeController {


    @Autowired
    private DeviceRepository deviceRepository;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("model","Thymeleaf");
        return "home";
      }

    @RequestMapping(value = "/table",method = RequestMethod.GET)
    public String table(Model model){
        model.addAttribute("model","Thymeleaf server template");
        return "table";
    }

    @RequestMapping("/resource")
    @ResponseBody
    public List<Device> resource() {
        return deviceRepository.findAll();
    }

}
