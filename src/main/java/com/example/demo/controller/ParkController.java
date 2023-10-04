package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.ParkRepository;
import com.example.demo.repository.ParkAreaRepository;
import com.example.demo.entity.ParksEntity;
import com.example.demo.entity.ParkAreasEntity;

@RestController
public class ParkController {
  @Autowired
  private ParkRepository parkRepository;

  @Autowired
  private ParkAreaRepository parkAreaRepository;

  /**
   * パーク一覧取得API(GET:/parks?id=XXX)
   * curl -v -X GET "http://localhost:8080/parks?id="
   * curl -v -X GET "http://localhost:8080/parks?id=1,2"
   */
  @RequestMapping(value = "/parks")
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
  
  /**
   * エリア一覧取得API(GET:/parks/areas?park_id=XXX)
   * curl -v -X GET "http://localhost:8080/parks/areas?park_id="
   * curl -v -X GET "http://localhost:8080/parks/areas?park_id=1,2"
   */
  @RequestMapping(value = "/parks/areas")
  public List<ParkAreasEntity> getParksAreas(@RequestParam("park_id") List<Integer> parkIds) {
    // DBから対象のパークに紐づくエリアの一覧を取得する。
    List<ParkAreasEntity> areas = null;
    if (parkIds.size() == 0) {
      areas = parkAreaRepository.findAll();
    } else {
      areas = parkAreaRepository.findByParkIdIn(parkIds);
    }
    // 削除されていないものを抽出する。
    List<ParkAreasEntity> areasResult = new ArrayList<>();
    for (ParkAreasEntity area : areas) {
      if (!area.isDeleted()) {
        areasResult.add(area);
      }
    }
    return areasResult;
  }
}