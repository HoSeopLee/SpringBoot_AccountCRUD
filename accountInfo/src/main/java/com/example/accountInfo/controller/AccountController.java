package com.example.accountInfo.controller;

import com.example.accountInfo.model.AccountInfoModel;
import com.example.accountInfo.service.AccountInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/account")
@Api(value = "계좌 정보", description = "Account CRUD")
public class AccountController {
    @Resource
    private AccountInfoService accountInfoService;

    @ApiOperation(value = "getAccountList",notes = "")
    @GetMapping
    public List<AccountInfoModel> getAccountInfo(){
        final List<AccountInfoModel> accountInfoList = accountInfoService.getAccountInfo();
        return accountInfoList;
    }

    @ApiOperation(value = "getUserAccountList",notes = "")
    @GetMapping("/{id}")
    public  List<AccountInfoModel> getUserAccountInfo(@PathVariable int id){
        final List<AccountInfoModel> userAccountInfoList = accountInfoService.getUserAccountInfo(id);
        return  userAccountInfoList;
    }

    @ApiOperation(value = "InsertUserInfo",notes = "")
    @PostMapping
    public int insertAccountInfo(@RequestBody AccountInfoModel accountInfoModel){
        try{
            accountInfoService.insertAccountInfo(accountInfoModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @ApiOperation(value = "UpdateAccountInfo",notes = "")
    @PutMapping
    public int updateUserInfo(@RequestBody AccountInfoModel accountInfoModel){
        try{
            accountInfoService.updateAccountInfo(accountInfoModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @ApiOperation(value = "DeleteAccountInfo",notes = "")
    @DeleteMapping("/{id}")
    public int deleteAccountInfo(@PathVariable int id){
        try{
            accountInfoService.deleteAccountInfo(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

}
