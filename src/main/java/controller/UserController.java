package controller;

import entity.User;


/**
 * Created by longfei on 2016/7/21.
 * Description: What you wanna do
 * Created Date: 2016/7/21
 * Created Time: ${Time}
 * Modified Date: 2016/7/21
 * TO-DO: Write Here
 */
//@EnableAutoConfiguration
@ResetController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
        User user = new User(id);
        user.setName("jack");
        return user;
    }
}
