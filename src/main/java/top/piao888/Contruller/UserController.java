package top.piao888.Contruller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.piao888.pojo.UserAuth;
import top.piao888.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public String all(Model model){
        List<UserAuth> user= userService.all();
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @RequestMapping(path = "/byid0",method = RequestMethod.GET)
    public String byid0(@RequestParam("id") Integer id,Model model){
        List<UserAuth>  user= userService.getUserById0(id);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    //    @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)
    @GetMapping("/bydname1")
    public String byid1(@RequestParam("dname") String dname , Model model){
        List<UserAuth> user= userService.getPersonBydname1(dname);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @GetMapping("/byid2")
    public String byid2(@RequestParam("id") Integer id , Model model){
        System.out.println(id);
        List<UserAuth> user= userService.getUserById2(id);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @RequestMapping(path="/getidname")
    public String bydname0(@RequestParam("id") Integer id,@RequestParam("dname") String dname, Model model){
        System.out.println(id+" "+dname);
        List<UserAuth> user= userService.getPersontwoByIdandname(id,dname);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @RequestMapping(path="/postidname1",method = RequestMethod.POST)
    public String bydname1(Integer id,String dname, Model model){
        System.out.println(id+" "+dname);
        List<UserAuth> user= userService.getPersontwoByIdandname(id,dname);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @PostMapping("/postidname2")
    public String bydname2(@RequestParam("id") Integer id,@RequestParam("dname") String dname, Model model){
        System.out.println(id+" "+dname);
        List<UserAuth> user= userService.getPersontwoByIdandname(id,dname);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
    @RequestMapping("/likedname")
    public String all(@RequestParam("id") String dname,Model model){
        List<UserAuth> user= userService.getPersonlikeBydname(dname);
        model.addAttribute("dept",user);
        System.out.println(model);
        return "hello";
    }
 /*   @RequestMapping("/getAll")
    public String delete(@RequestParam("id") Integer id){
        userService.delete(id);
        return "hello";
    }
    @RequestMapping("/getAll")
    public String rq(Model model){
        return null;
    }*/
}
