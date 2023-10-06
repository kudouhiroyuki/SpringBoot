package com.example.demo.controller;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.repository.AccountLargeClassificationRepository;
import com.example.demo.entity.AccountsLargeClassificationsEntity;

@RestController
public class AccountController {
  @Autowired
  private AccountLargeClassificationRepository largeAccountRepository;

  /**
   * 勘定科目大分類一覧取得API(GET:/accounts_large_classifications)
   * curl -v -X GET "http://localhost:8080/accounts_large_classifications"
   */
  @RequestMapping("accounts_large_classifications")
  public List<AccountsLargeClassificationsEntity> getAccountsLargeClassifications() {
    // DBから勘定科目大分類の一覧を取得する。
    List<AccountsLargeClassificationsEntity> largeAccounts = largeAccountRepository.findAll();
    // 削除されていないものを抽出する。
    List<AccountsLargeClassificationsEntity> largeAccountsResult = new ArrayList<>();
    for (AccountsLargeClassificationsEntity largeAccount : largeAccounts) {
      if (!largeAccount.isDeleted()) {
        largeAccountsResult.add(largeAccount);
      }
    }
    return largeAccountsResult;
  }

  /**
   * 勘定科目大分類取得API(GET:/accounts_large_classifications/{id})
   * curl -v -X GET "http://localhost:8080/accounts_large_classifications/1"
   * curl -v -X GET "http://localhost:8080/accounts_large_classifications/2"
   */
  @RequestMapping("accounts_large_classifications/{id}")
  public Optional<AccountsLargeClassificationsEntity> getAccountLargeClassification(@PathVariable("id") int id) {
    // DBから勘定科目大分類を取得する。
    Optional<AccountsLargeClassificationsEntity> largeAccount = largeAccountRepository.findById(id);
    return largeAccount;
  }
}