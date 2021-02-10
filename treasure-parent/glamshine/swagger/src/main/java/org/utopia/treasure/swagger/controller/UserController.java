package org.utopia.treasure.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {
        "用户管理"
})
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @ApiOperation(value = "获取用户信息接口", httpMethod = "GET")
    @GetMapping
    public String getUser() {
        return "刘林:19930905:男";
    }

}
