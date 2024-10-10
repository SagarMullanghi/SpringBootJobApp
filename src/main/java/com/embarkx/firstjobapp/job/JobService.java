package com.embarkx.firstjobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    Job deleteJobById(Long id);

    boolean updateJobById(Long id, Job job);
}
