package top.piao888.service;

import top.piao888.pojo.UserAuth;

import java.util.List;

public interface UserService {
    List<UserAuth> all();
    List<UserAuth>  getUserById0(Integer id);
    List<UserAuth> getPersonBydname1(String dname);
    List<UserAuth> getUserById2(Integer id);
    void delete(Integer id);
    List<UserAuth> getPersonById2(Integer id);
    List getPersontwoByIdandname(Integer id,String dname);
    List<UserAuth> getPersonlikeBydname(String dname);
    List findByDetached();
}
