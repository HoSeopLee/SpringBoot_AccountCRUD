package com.example.accountInfo.repository;

import com.example.accountInfo.model.AccountHistoryModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountHistoryRepository {
    public List<AccountHistoryModel> getHistoryList(int id);
    public int insertHistory(AccountHistoryModel accountHistoryModel);
    public int updateHistory(AccountHistoryModel accountHistoryModel);
    public int deleteHistory(int id);


}
