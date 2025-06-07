package com.myApp.JobApp.service;

import com.myApp.JobApp.model.JobPost;
import com.myApp.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;

    public void addJob(JobPost jobPost){

        jobRepo.addJob(jobPost);
    }


    public List<JobPost> getAllJobs(){


        return jobRepo.getAllJobs();
    }



}
