package com.example.accountInfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoModel {
    int id;
    String bankName;
    String bankNum;
    int bankPrice;
    int userInfo_id;
}
