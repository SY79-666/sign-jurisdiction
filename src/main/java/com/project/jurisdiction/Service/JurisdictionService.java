package com.project.jurisdiction.Service;

public interface JurisdictionService {
    /**
     * 升级权限(普通员工--管理员)
     * @param phone
     */
    int upgradeService(int phone,String id);
}
