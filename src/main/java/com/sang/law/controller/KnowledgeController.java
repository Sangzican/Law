package com.sang.law.controller;

import com.sang.law.pojo.Knowledge;
import com.sang.law.service.KnowledegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/knowledge")
public class KnowledgeController {
    @Autowired
    private KnowledegService knowledegService;

    @RequestMapping("/getAllKnowledge")
    public List<Knowledge> getAllKnowledge() {
        return knowledegService.getAllKnowledge();
    }

}
