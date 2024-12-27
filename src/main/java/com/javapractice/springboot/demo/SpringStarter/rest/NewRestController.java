package com.javapractice.springboot.demo.SpringStarter.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {

    @Value("${coach.name}")
    private String name;
    @Value("${team.name}")
    private String teamname;

  @GetMapping("/")
  public String sayHello(){
      return "Hello World!"+teamname + " " + name;
  }

    @GetMapping("/walk")
    public String Walk_daily(){
        return "Target is Run 5k Everyday Without Fail!"+teamname + " " + name;
    }

    @GetMapping("/play")
    public String play_daily(){
        return "Target is to play Everyday Without Fail!"+teamname + " " + name;
    }

    @GetMapping("/sleep")
    public String sleep_daily(){
        return "Target is to sleep Everyday Without Fail!"+teamname + " " + name;
    }

    @GetMapping("/dream")
    public String dream_daily(){
        return "Target is to dream Daylight!"+teamname + " " + name;
    }

    @GetMapping("/drive")
    public String drive_daily(){
        return "Target is to Drive everyday!"+teamname + " " + name;
    }
}
