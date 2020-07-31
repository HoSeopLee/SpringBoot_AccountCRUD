package com.example.accountInfo.service;

import com.example.accountInfo.model.AccountInfoModel;
import com.example.accountInfo.repository.AccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountInfoService {
    @Autowired
    private AccountInfoRepository accountInfoRepository;


    public List<AccountInfoModel> getAccountInfo(){
        return accountInfoRepository.getAccountInfo();
    }

    public List<AccountInfoModel> getUserAccountInfo(int id){
        return accountInfoRepository.getUserAccountInfo(id);
    }

    public int insertAccountInfo(AccountInfoModel accountInfoModel){
        return accountInfoRepository.insertAccountInfo(accountInfoModel);
    }
    public int updateAccountInfo(AccountInfoModel accountInfoModel){
        return  accountInfoRepository.updateAccountInfo(accountInfoModel);
    }
    public int deleteAccountInfo(int id){
        return accountInfoRepository.deleteAccountInfo(id);
    }
}
