package quinbay.userActivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quinbay.userActivity.dataModels.StandardResponse;
import quinbay.userActivity.dataModels.UserActivity;
import quinbay.userActivity.service.UserDetailsService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/useractivity")
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;


    /*
    * To get the user log activity list from the database
     */

    @GetMapping(value="/getactivity/{username}")
    StandardResponse getActivity(@PathVariable("username") String username){
        Map<String, Object> data=new HashMap<>();
        data.put("user", userDetailsService.findByUsername(username));

        return new StandardResponse(true, "", data);
    }



    @PostMapping(value = "/saveactivity")
    StandardResponse saveActivity(@RequestBody UserActivity userActivity){
        System.out.println(1);
        userDetailsService.save(userActivity);
        return new StandardResponse(true, "", new HashMap<String, Object>());
    }




    @DeleteMapping(value="/deleteactivity/{username}")
    StandardResponse deleteActivity(@PathVariable String username){
        userDetailsService.deleteByUserName(username);
        return new StandardResponse(true, "", new HashMap<String, Object>());
    }
}
