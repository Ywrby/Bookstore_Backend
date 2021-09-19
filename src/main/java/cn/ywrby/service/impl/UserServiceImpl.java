package cn.ywrby.service.impl;

import cn.ywrby.domain.User;
import cn.ywrby.domain.UserClass;
import cn.ywrby.mapper.UserMapper;
import cn.ywrby.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User verify(User user) {
        String username=user.getUsername();
        String pwd= user.getPassword();
        user = userMapper.findUserByUserAndPwd(username, pwd);
        if(user!=null){
            return user;
        }else {
            return null;
        }
    }

    @Override
    public User findUserByUsername(String username) {
        User user = userMapper.findUserByUsername(username);
        return user;
    }

    @Override
    public UserClass findClassByUsername(String username) {
        UserClass userClass=userMapper.findClassByUsername(username);
        return userClass;
    }

    @Override
    public boolean updateUserInfo(String username, String name, String oldPassword, String newPassword) {
        //System.out.println(username+" : "+oldPassword);
        User user = userMapper.findUserByUserAndPwd(username, oldPassword);
        if(user!=null){
            //用户对象不为空，表示旧密码输入正确，允许用户更新密码
            userMapper.updateUserInfo(username,name,newPassword);
            return true;
        }else {
            //对象为空，密码输入错误
            return false;
        }
    }

}
