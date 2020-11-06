package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.UserExample;
import elm.demo.service.UserService;
import elm.demo.utils.MD5Util;
import elm.demo.utils.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import elm.demo.domain.User;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public ModelAndView list(
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ){
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/user/list");
        List<User> users = userService.selectByExample(null);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(users, 8);
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }

    @RequestMapping(value = "/ins")
    public String ins(){
        return "pages/user/insForm";
    }

    @RequestMapping(value = "/insert",method = {RequestMethod.POST})
    public String insert(@Validated @ModelAttribute(value = "user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "forward:ins";
        }
        Integer update = userService.insertSelective(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.GET})
    public String delete(@RequestParam(value = "uid",required = true)Integer uid){
        Integer delete = userService.deleteByPrimaryKey(uid);
        return "redirect:list";
    }


    @RequestMapping(value = "/upt")
    public ModelAndView upt(@RequestParam(value = "uid",required = true)Integer uid){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/user/uptForm");
        User user = userService.selectByPrimaryKey(uid);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping(value = "/update")
    public String update(User user){
        Integer update = userService.updateByPrimaryKeySelective(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String toLogin(){
        return "pages/user/login";
    }

    @RequestMapping(value = "/loginCheck")
    public String loginCheck(User user, HttpServletRequest request){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        user.setPassword(MD5Util.getMD5(user.getPassword()));
        criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<User> byUser = userService.selectByExample(userExample);
        if(byUser.size()>0){
//            将用户基本信息记录在session中
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(3600);//会话时间3600秒
            session.setAttribute("USER_SESSION",byUser.get(0).getUsername());
            return "admin";
        }else{
            return "pages/user/login";
        }
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
//            将用户基本信息从session中清除
        HttpSession session = request.getSession();
        session.setAttribute("USER_SESSION","");//单独设置session
//            session.invalidate();//使所有的session失效
        return "redirect:/index.jsp";
    }

    @GetMapping("/getCode")
    public Map<String,String> getImage(HttpServletRequest request) throws IOException {
        Map<String,String> result = new HashMap<>();
        VerifyCode verifyCode = new VerifyCode(320,240,8,136);
        //获取验证码
        String securityCode = verifyCode.getCode();
        //验证码存入session
        String key = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        request.getSession().setAttribute(key,securityCode);
        //生成图片
        BufferedImage image = verifyCode.getBuffImg();
        //进行base64编码
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(image,"png",bos);
        String string = Base64Utils.encodeToString(bos.toByteArray());
        result.put("key",key);
        result.put("image",string);
        return result;
    }

    @PostMapping(value = "/loginCheckCode")
    public String loginCheck(User user,@RequestParam("verify")String verify,@RequestParam("key")String key,HttpServletRequest request){
        System.out.println(verify);
        System.out.println(request.getSession().getAttribute(key));
        if(verify.equals(request.getSession().getAttribute(key))){
            return "验证码成功";
        }
        return "hh";
    }
}



















