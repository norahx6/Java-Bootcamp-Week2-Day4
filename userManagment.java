package Day4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class userManagment {
    ArrayList<MyUsers> users=new ArrayList<>();

    @GetMapping("MyUsers")
    public ArrayList getuser(){
        return users;
    }

    @PostMapping("/MyUsers")
    public Response adduser(@RequestBody MyUsers myuser){
       users.add(myuser) ;
       return new Response("user add");
    }

    @PutMapping("/MyUsers")
    public Response updateuser(@PathVariable int index , @RequestBody MyUsers myusers){
        users.set(index,myusers);
        return new Response("user update");
    }

    @DeleteMapping("/MyUsers")
    public Response delteuser(@PathVariable int index){
        users.remove(index);
        return new Response("user deleted");
    }


}//end
