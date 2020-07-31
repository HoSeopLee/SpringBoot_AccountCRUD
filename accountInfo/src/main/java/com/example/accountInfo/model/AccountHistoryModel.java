package com.example.accountInfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountHistoryModel {
    int id;
    String historyTitle;
    int historyPrice;
    int bankAccount_id;
}
