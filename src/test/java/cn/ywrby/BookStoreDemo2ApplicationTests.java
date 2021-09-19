package cn.ywrby;

import cn.ywrby.domain.User;
import cn.ywrby.domain.UserClass;
import cn.ywrby.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookStoreDemo2ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        UserClass uc = userMapper.findClassByUsername("222019321102062");
        System.out.println(uc);
    }

}
