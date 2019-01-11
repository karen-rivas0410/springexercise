package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    private int num;  //need this to call variable in all//

    @GetMapping("/roll-dice")
    public String rollDice() {
        num = (int) Math.floor(Math.random() * 6 ) + 1;
        return "rollDice";
    }

    @GetMapping("roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        model.addAttribute("n", n);
        model.addAttribute("num", num);
        return "rollDice";
    }


}
