package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.ParkRepository;
import com.example.demo.repository.ParkAreaRepository;
import com.example.demo.repository.AreaComplexRepository;
import com.example.demo.repository.ComplexeFacilitiesRepository;
import com.example.demo.repository.TypeRepository;
import com.example.demo.entity.ParksEntity;
import com.example.demo.entity.ParksAreasEntity;
import com.example.demo.entity.AreasComplexesEntity;
import com.example.demo.entity.ComplexesFacilitiesEntity;
import com.example.demo.entity.TypesEntity;

@RestController
public class ParkController {
  @Autowired
  private ParkRepository parkRepository;

  @Autowired
  private ParkAreaRepository parkAreaRepository;

  @Autowired
  private AreaComplexRepository areaComplexRepository;

  @Autowired
  private ComplexeFacilitiesRepository complexeFacilitiesRepository;

  @Autowired
  private TypeRepository typeRepository;

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
  public List<ParksAreasEntity> getParksAreas(@RequestParam("park_id") List<Integer> parkIds) {
    // DBから対象のパークに紐づくエリアの一覧を取得する。
    List<ParksAreasEntity> areas = null;
    if (parkIds.size() == 0) {
      areas = parkAreaRepository.findAll();
    } else {
      areas = parkAreaRepository.findByParkIdIn(parkIds);
    }
    // 削除されていないものを抽出する。
    List<ParksAreasEntity> areasResult = new ArrayList<>();
    for (ParksAreasEntity area : areas) {
      if (!area.isDeleted()) {
        areasResult.add(area);
      }
    }
    return areasResult;
  }

  /**
   * コンプレックス一覧取得API(GET:/areas/complexes?area_id=XXX)
   * curl -v -X GET "http://localhost:8080/areas/complexes?area_id="
   * curl -v -X GET "http://localhost:8080/areas/complexes?area_id=1,2"
   */
  @RequestMapping(value = "/areas/complexes")
  public List<AreasComplexesEntity> getAreasComplexes(@RequestParam("area_id") List<Integer> areaIds) {
    // DBから対象のエリアに紐づくコンプレックスの一覧を取得する。
    List<AreasComplexesEntity> complexes = null;
    if (areaIds.size() == 0) {
      complexes = areaComplexRepository.findAll();
    } else {
      complexes = areaComplexRepository.findByParkAreaIdIn(areaIds);
    }
    // 削除されていないものを抽出する。
    List<AreasComplexesEntity> complexesResult = new ArrayList<>();
    for (AreasComplexesEntity complexe : complexes) {
      if (!complexe.isDeleted()) {
        complexesResult.add(complexe);
      }
    }
    return complexesResult;
  }

  /**
   * ファシリティ一覧取得API(GET:/complexes/facilities?complex_id=XXX)
   * curl -v -X GET "http://localhost:8080/complexes/facilities?complex_id="
   * curl -v -X GET "http://localhost:8080/complexes/facilities?complex_id=1,2"
   */
  @RequestMapping(value = "/complexes/facilities")
  public List<ComplexesFacilitiesEntity> getComplexesFacilities(@RequestParam("complex_id") List<Integer> complexIds) {
    // DBから対象のコンプレックスに紐づく施設の一覧を取得する。
    List<ComplexesFacilitiesEntity> facilities = null;
    if (complexIds.size() == 0) {
      facilities = complexeFacilitiesRepository.findAll();
    } else {
      facilities = complexeFacilitiesRepository.findByAreaComplexIdIn(complexIds);
    }
    // 削除されていないものを抽出する。
    List<ComplexesFacilitiesEntity> facilitiesResult = new ArrayList<>();
    for (ComplexesFacilitiesEntity facilitie : facilities) {
      if (!facilitie.isDeleted()) {
        facilitiesResult.add(facilitie);
      }
    }
    return facilitiesResult;
  }

  /**
   * 種類一覧取得API(GET:/types?id=XXX)
   * curl -v -X GET "http://localhost:8080/types?id="
   * curl -v -X GET "http://localhost:8080/types?id=1,2"
   */
  @RequestMapping(value = "/types")
  public List<TypesEntity> getTypes(@RequestParam("id") List<Integer> ids) {
    // DBから種類の一覧を取得する。
    List<TypesEntity> types = null;
    if (ids.size() == 0) {
      types = typeRepository.findAll();
    } else {
      types = typeRepository.findByIdIn(ids);
    }
    // 削除されていないものを抽出する。
    List<TypesEntity> typesResult = new ArrayList<>();
    for (TypesEntity type : types) {
      if (!type.isDeleted()) {
        typesResult.add(type);
      }
    }
    return typesResult;
  }
}