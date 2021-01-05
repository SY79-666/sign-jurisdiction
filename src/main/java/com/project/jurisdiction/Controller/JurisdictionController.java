package com.project.jurisdiction.Controller;

import com.project.jurisdiction.Service.Impl.JurisdictionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class JurisdictionController {
    @Autowired
    private JurisdictionServiceImpl jurisdictionService;

    @PostMapping
    @ResponseBody
    public void upgradeController(Map<String,Object> map) {
        if(map.get("role") == "普通员工"){
            jurisdictionService.upgradeService(Integer.parseInt(String.valueOf(map.get("phone"))),
                    String.valueOf(map.get("id")));
        }
    }
}
