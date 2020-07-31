package com.example.accountInfo.service;

import com.example.accountInfo.model.AccountHistoryModel;
import com.example.accountInfo.repository.AccountHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountHistoryService {
    @Autowired
    private AccountHistoryRepository accountHistoryRepository;

    public List<AccountHistoryModel> getHistoryList(int id){
        return accountHistoryRepository.getHistoryList(id);
    }
    public int insertHistory(AccountHistoryModel accountHistoryModel){
        return accountHistoryRepository.insertHistory(accountHistoryModel);
    }
    public int updateHistory(AccountHistoryModel accountHistoryModel){
        return  accountHistoryRepository.updateHistory(accountHistoryModel);
    }
    public int deleteHistory(int id){
        return accountHistoryRepository.deleteHistory(id);
    }
}
