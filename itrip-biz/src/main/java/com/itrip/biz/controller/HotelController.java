package com.itrip.biz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class HotelController {


    @Autowired
    private HotelService hotelService;

    @RequestMapping(value="/hotel/queryhotels")
    @ResponseBody
    public Dto queryHotels(){
        PageHelper.startPage(1,5);

        List<Hotel> list= hotelService.getHotels();
        PageInfo<Hotel> pageInfo = new PageInfo<Hotel>(list);
        return DtoUtil.returnSuccess("成功",pageInfo);
    }
}
