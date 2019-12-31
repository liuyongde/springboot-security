package com.liuyongde.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/tasks")
@RestController
public class TaskController {

    @GetMapping("/getTasks")
    @ResponseBody
    public String listTasks(){
        return "任务列表";
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    public String newTasks(){
        return "创建了一个新的任务";
    }

    @PostMapping("/test")
    @PreAuthorize("hasRole('TEST') or hasRole('USER')")
    public String Tasks(){
        return "创建了一个新的任务";
    }

}
