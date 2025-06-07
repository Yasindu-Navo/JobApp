package com.myApp.JobApp;

import com.myApp.JobApp.model.JobPost;
import com.myApp.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping({"/","/home"})
    public String home(){
        System.out.println("home method is called");
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(){

        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return  "success";
    }


    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model){
        List<JobPost> jobs = jobService.getAllJobs();
        model.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
