package com.example.demo.controller;

import java.util.List;

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
    List<ParksEntity> parks = null;
    if (ids.size() == 0) {
      parks = parkRepository.findAll();
    } else {
      parks = parkRepository.findAllByIdIn(ids);
    }
    return parks;
  }
}
// curl -v -X GET "http://localhost:8080/parks?ids="
// curl -v -X GET "http://localhost:8080/parks?ids=1,2"