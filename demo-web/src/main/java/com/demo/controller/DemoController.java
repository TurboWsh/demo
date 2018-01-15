package com.demo.controller;

import com.demo.scheduled.DemoScheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Turbo
 * @date 17/5/26.
 */
@Controller
@RequestMapping
public class DemoController {

    @Autowired
    private DemoScheduled demoScheduled;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping("/startCron")
    @ResponseBody
    public String startCron(@RequestParam String cron){
        demoScheduled.stopCron();
        demoScheduled.startCron(cron);
        return "x";
    }

    @RequestMapping("/stopCron")
    @ResponseBody
    public String stopCron(){
        return demoScheduled.stopCron();
    }


}
