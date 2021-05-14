package service;

import dao.USerDao;

public class userServiceImpl implements userService {
    USerDao dao;
    public void setUserDao(USerDao dao){
        this.dao=dao;
    }
    public void setUser() {
        dao.setUser();
    }
}
