package com.example.demo.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.DecimalFormat;

@RestController
public class MainController {

    @GetMapping("/")
    public String showIndex(@RequestParam String op, @RequestParam double n1, @RequestParam double n2) {
        double result;

        DecimalFormat df = new DecimalFormat("0.###");

        switch(op) {

            case "add":
                result = n1 + n2;
                return df.format(result);

            case "sub":
                result = n1 - n2;
                return df.format(result);

            case "mult":
                result = n1 * n2;
                return df.format(result);

            case "div":
                result = n1 / n2;
                return df.format(result);
        }

    }

}
