package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.ParkRepository;
import com.example.demo.entity.ParksEntity;

@RestController
@RequestMapping("/parks") 
public class ParkController {
  @Autowired
  private ParkRepository parkRepository;

  @GetMapping
  public List<ParksEntity> getParks(@RequestParam("ids") List<Integer> ids) {
    // DBからパークの一覧を取得する。
    List<ParksEntity> parks = new ArrayList<>();
    if (ids.size() == 0) {
      parks = parkRepository.findAll();
    } else {
      parks = parkRepository.findAllByIdIn(ids);
    }
    
    // 削除されていないものを抽出する。
    List<ParksEntity> parksResult = new ArrayList<>();
    for (ParksEntity park : parks) {
      if (!park.getIsDeleted()) {
        parksResult.add(park);
      }
    }

    return parksResult;
  }
}
// curl -v -X GET "http://localhost:8080/parks?ids="
// curl -v -X GET "http://localhost:8080/parks?ids=1,2"