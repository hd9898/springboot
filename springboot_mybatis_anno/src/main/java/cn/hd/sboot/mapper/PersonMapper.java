package cn.hd.sboot.mapper;

import cn.hd.sboot.model.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from account where id=#{id}")
    public Account  selectById(int id);

    @Select("select * from account ")
    public List<Account> selectAll();

    @Insert("insert into account(id,name,money) values(#{id},#{name},#{money})")
    public void insert(Account account);

    @Delete("delete from account where id = #{id}")
    public void delete(int id);


}
