package com.example.day4ex2;


import org.springframework.web.bind.annotation.*;

import java.io.StringReader;
import java.util.ArrayList;

@RestController
public class taskTracker {

    ArrayList<Task>tasks=new ArrayList<>();


    @GetMapping ("task")
    public ArrayList<Task> gettask(){
        return tasks;
    }

    @PostMapping("/task")
    public ApiResponse addtask(@RequestBody Task task){
        tasks.add(task);
        return new ApiResponse("Task Added");
    }

    @PutMapping("/task/{index}")
    public ApiResponse updatetask1(@PathVariable int index , @RequestBody Task task){
        tasks.set(index,task);
        return new ApiResponse("Task updated");
    }

    @DeleteMapping("index")
    public ApiResponse deletetask(@PathVariable int index){
        tasks.remove(index);
        return new ApiResponse("task deleted");
    }

    @PutMapping ("/task/{change}")
    public ApiResponse changetask(@PathVariable int index , @RequestBody String statu){
       Task task1 = tasks.get(index);
       task1.setStatus(statu);
       return new ApiResponse("done");
    }
    @PutMapping ("/task/{search}")
    public ApiResponse searchtask(@PathVariable int index , @RequestBody String title) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTitle().equals(title)) {
                tasks.add(tasks.get(i));
            }

        }
        return Task;
    }



}//
