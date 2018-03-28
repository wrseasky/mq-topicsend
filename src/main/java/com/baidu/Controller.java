package com.baidu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    @ResponseBody
    public String send(String msg) {
        sender.send("gun");
        return "Send OK.";
    }
}
