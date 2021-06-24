package com.itangcent.springboot.demo.testenum;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Admin-公司单位管理", tags = "公司单位管理")
@RestController("unitController")
@RequestMapping("admin/unit")
public class TestEnumController {

    @ApiOperation(value = "修改公司单位")
    @PutMapping()
    public String update(Unit unit) {
        return "";
    }

}
