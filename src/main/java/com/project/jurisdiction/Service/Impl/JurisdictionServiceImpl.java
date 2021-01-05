package com.project.jurisdiction.Service.Impl;

import com.project.jurisdiction.Service.JurisdictionService;
import com.project.signin.Dao.SignUserMapper;
import com.project.signin.Entity.SignUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JurisdictionServiceImpl implements JurisdictionService {
    @Autowired
    private SignUserMapper signUserMapper;
    public int upgradeService(int phone,String id){
        return signUserMapper.upgrade(phone);
    }
}
