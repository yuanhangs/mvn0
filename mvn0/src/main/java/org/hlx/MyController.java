package org.hlx;

import org.hlx.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName MyController
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/21
 * @Version V1.0
 **/
@Controller
public class MyController {

    @RequestMapping(value = "/test")
    @ResponseBody  //返回json
    public User test(User user) {
        System.out.println(user);
        // 返回JSON格式的响应
        return user;
    }
}
