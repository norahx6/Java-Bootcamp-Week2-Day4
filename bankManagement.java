package Day4;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class bankManagement {
    ArrayList<Customers> users=new ArrayList<>();

    @GetMapping("/customer")
    public ArrayList<Customers> getcustomer(){
        return users;
    }

    @PostMapping("/customer")
    public Response addcustomers(@RequestBody Customers customers ){
        users.add(customers);
        return new Response("user added");
    }

    @PutMapping("/customer")
    public Response updatecustomer(@PathVariable int index,@RequestBody Customers customers){
        users.set(index,customers);
        return new Response("user update");
    }


    @DeleteMapping("/customer")
    public Response deletcustomer(@PathVariable int index){
        users.remove(index);
        return new Response("user delete");

    }





}//end
