package com.example.demo.user.dto.request;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserIndexGetRequestDto {
  @NotEmpty(message = "名前を入力してください")
  private String id;
}
