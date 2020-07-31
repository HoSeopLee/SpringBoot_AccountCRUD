package com.example.accountInfo.controller;

import com.example.accountInfo.model.AccountHistoryModel;
import com.example.accountInfo.service.AccountHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/history")
@Api(value = "계좌 내역", description = "AccountHistory CRUD")
public class AccountHistoryController {
    @Resource
    private AccountHistoryService accountHistoryService;

    @ApiOperation(value = "HistoryList", notes = "")
    @GetMapping("/{id}")
    public List<AccountHistoryModel> getHistoryList(@PathVariable int id){
        final List<AccountHistoryModel> histortyList = accountHistoryService.getHistoryList(id);
        return histortyList;
    }

    @ApiOperation(value = "InsertHistory",notes = "")
    @PostMapping
    public int insertHistory(@RequestBody AccountHistoryModel accountHistoryModel){
        try{
            accountHistoryService.insertHistory(accountHistoryModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @ApiOperation(value = "UpdateHistory",notes = "")
    @PutMapping
    public int updateHistory(@RequestBody AccountHistoryModel accountHistoryModel){
        try{
            accountHistoryService.updateHistory(accountHistoryModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @ApiOperation(value = "DeleteHistory",notes = "")
    @DeleteMapping("/{id}")
    public int deleteHistory(@PathVariable int id){
        try{
            accountHistoryService.deleteHistory(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
