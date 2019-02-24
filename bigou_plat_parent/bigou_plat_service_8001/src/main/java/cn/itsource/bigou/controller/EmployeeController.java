package cn.itsource.bigou.controller;

import cn.itsource.bigou.AjaxResult;
import cn.itsource.bigou.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    /**
     * @ResponseBody 用于接收页面请求体中的对象值，绑定到一个对象上
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
}
