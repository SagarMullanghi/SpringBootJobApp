package com.embarkx.firstjobapp.job;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll() {
    return new ResponseEntity<>(jobService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job addeed successfully", HttpStatus.OK);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if( job != null )
            return new ResponseEntity<>(jobService.getJobById(id),HttpStatus.OK );
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id) {
        Job job = jobService.deleteJobById(id);
        if( job != null )
            return new ResponseEntity<>("Job Deleted Successfully",HttpStatus.OK );
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJobById(@PathVariable Long id, @RequestBody Job job) {
        boolean isJoBUpdated = jobService.updateJobById(id, job);

        if(isJoBUpdated) {
            return new ResponseEntity<String>("Job with" + id + "Updated", HttpStatus.OK);
        }

        return new ResponseEntity<String>("Job not found", HttpStatus.NOT_FOUND);
    }
}
