package com.nick.controller;

//import net.proselyte.springmvc.model.Developer;
import com.nick.Brain.MyBrain;
import com.nick.model.Data;
import com.nick.utils.StringMessage;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class MyController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){

        return new ModelAndView("index","data",new Data());
    }
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@Valid @ModelAttribute("data") Data data, BindingResult bindingResult, ModelMap model){
        if (bindingResult.hasErrors()){
            return "index";
        }
        double discr = MyBrain.disctimenant(data.getDigitA(),data.getDigitB(),data.getDigitC());

        model.addAttribute("digitA",data.getDigitA());
        model.addAttribute("digitB",data.getDigitB());
        model.addAttribute("digitC",data.getDigitC());
        if (MyBrain.amuntOfRootsByDisctiminant(discr)==2){
            ArrayList<Double> list = MyBrain.findRootsByDigits(data.getDigitA(),data.getDigitB(),data.getDigitC());
            model.addAttribute("root1", list.get(0));
            model.addAttribute("root2", list.get(1));
            model.addAttribute("discriminant",discr);
            model.addAttribute("message", StringMessage.ROOTS_EXISTS_MESSAGE);
        }

        return "result";
    }


}
