package com.example.accountInfo.repository;

import com.example.accountInfo.model.AccountInfoModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountInfoRepository {
    //계좌정보 전체
    public List<AccountInfoModel> getAccountInfo();
    //해당사용자 계좌전체
    public List<AccountInfoModel> getUserAccountInfo(int id);
    public int insertAccountInfo(AccountInfoModel accountInfoModel);
    public int updateAccountInfo(AccountInfoModel accountInfoModel);
    public int deleteAccountInfo(int id);
}
