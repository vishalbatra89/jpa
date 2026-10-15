package com.jpa.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController 
@RequestMapping("/demo")
public class DemoController 
{
    @Autowired 
    DBRepository db;
    
    @PostMapping()
    public NewEntity saveData(@RequestBody NewEntity n)
    {
        return db.save(n);
    }

}
