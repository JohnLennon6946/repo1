package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository和@Controller、@Service、@Component的作用差不多，都是把对象交给spring管理。
// @Repository用在持久层的接口上，这个注解是将接口的一个实现类交给spring管理。@Controller是web视图层交给spring IOC容器管理，@Service是业务层对象交给spring IOC容器管理
@Repository
public interface UserDao {
    //增
    @Insert("insert into user (name,sex) values(#{name},#{sex})")
    public void addUser(User user);
    //删
    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);
    //改
    @Update("update user set name=#{name},sex=#{sex} where id=#{id}")
    public void updateUser(User user);
    //查
    @Select("select *from user")
    public List<User> selectUser();
}
