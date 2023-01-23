package com.example.demo.users.dto.request;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UsersIndexGetRequestDto {
  @NotEmpty(message = "名前を入力してください")
  private String id;
}
