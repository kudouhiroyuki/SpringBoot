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
  // パークマスタテーブル用リポジトリ
  @Autowired
  private ParkRepository parkRepository;

  /**
   * パーク一覧取得API(GET:/v1/parks?id=XXX)
   * 
   * パークの一覧を取得します。
   * 対象のIdの情報を取得します。
   * Idは複数設定することができ、取得できた情報を全て返却します。
   */
  @GetMapping
  public List<ParksEntity> getParks(@RequestParam("id") List<Integer> ids) {
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
      if (!park.isDeleted()) {
        parksResult.add(park);
      }
    }
    return parksResult;
  }
  // curl -v -X GET "http://localhost:8080/parks?id="
  // curl -v -X GET "http://localhost:8080/parks?id=1,2"
  
  @GetMapping("/areas")
  public List<ParksEntity> getParksAreas(@RequestParam("park_id") List<Integer> parkIds) {
    return null;
  }
  // curl -v -X GET "http://localhost:8080/parks/areas?park_id="
}