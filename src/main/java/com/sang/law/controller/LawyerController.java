package com.sang.law.controller;


import com.sang.law.pojo.Lawyer;

import com.sang.law.service.LawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/lawyer")
public class LawyerController {
    @Autowired
    private LawyerService lawyerService;

    @RequestMapping("/findAllLawyer")
    public List<Lawyer> findALLLawyer() {
        return lawyerService.findAllLawyer();
    }

    @RequestMapping("/addLawyer")
    public boolean addLawyer(@RequestBody Lawyer lawyer) {
        lawyer.setId(UUID.randomUUID().toString());
        return lawyerService.addLawyer(lawyer);
    }

    @RequestMapping("/deleteLawyerById")
    public boolean deleteLawyerById(String id) {
        return lawyerService.deleteLawyerById(id);
    }

    @RequestMapping("/loginLawyer")  //登录
    public Lawyer loginLawyer(String lawyer_username, String lawyer_password) {
        return lawyerService.loginLawyer(lawyer_username, lawyer_password);
    }

    @RequestMapping("/updateLawyer") //修改
    public boolean updateLawyer(@RequestBody Lawyer lawyer) {
        return lawyerService.updateLawyer(lawyer);
    }
}
