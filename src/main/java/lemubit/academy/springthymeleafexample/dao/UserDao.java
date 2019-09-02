package lemubit.academy.springthymeleafexample.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser()
    {
        return "Jack";
    }
}
