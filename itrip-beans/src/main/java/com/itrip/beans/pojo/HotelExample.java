package com.itrip.beans.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelName is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelName is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelName =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelName <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelName >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelName >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelName <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelName <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelName like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelName not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelName in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelName not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelName between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelName not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNull() {
            addCriterion("countryId is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("countryId is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Long value) {
            addCriterion("countryId =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Long value) {
            addCriterion("countryId <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Long value) {
            addCriterion("countryId >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Long value) {
            addCriterion("countryId >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Long value) {
            addCriterion("countryId <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Long value) {
            addCriterion("countryId <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Long> values) {
            addCriterion("countryId in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Long> values) {
            addCriterion("countryId not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Long value1, Long value2) {
            addCriterion("countryId between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Long value1, Long value2) {
            addCriterion("countryId not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Long value) {
            addCriterion("provinceId =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Long value) {
            addCriterion("provinceId <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Long value) {
            addCriterion("provinceId >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Long value) {
            addCriterion("provinceId >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Long value) {
            addCriterion("provinceId <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Long value) {
            addCriterion("provinceId <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Long> values) {
            addCriterion("provinceId in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Long> values) {
            addCriterion("provinceId not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Long value1, Long value2) {
            addCriterion("provinceId between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Long value1, Long value2) {
            addCriterion("provinceId not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Long value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Long value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Long value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Long value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Long value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Long> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Long> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Long value1, Long value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Long value1, Long value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIsNull() {
            addCriterion("hotelType is null");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIsNotNull() {
            addCriterion("hotelType is not null");
            return (Criteria) this;
        }

        public Criteria andHoteltypeEqualTo(Integer value) {
            addCriterion("hotelType =", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotEqualTo(Integer value) {
            addCriterion("hotelType <>", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeGreaterThan(Integer value) {
            addCriterion("hotelType >", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelType >=", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeLessThan(Integer value) {
            addCriterion("hotelType <", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeLessThanOrEqualTo(Integer value) {
            addCriterion("hotelType <=", value, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeIn(List<Integer> values) {
            addCriterion("hotelType in", values, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotIn(List<Integer> values) {
            addCriterion("hotelType not in", values, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeBetween(Integer value1, Integer value2) {
            addCriterion("hotelType between", value1, value2, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHoteltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelType not between", value1, value2, "hoteltype");
            return (Criteria) this;
        }

        public Criteria andHotellevelIsNull() {
            addCriterion("hotelLevel is null");
            return (Criteria) this;
        }

        public Criteria andHotellevelIsNotNull() {
            addCriterion("hotelLevel is not null");
            return (Criteria) this;
        }

        public Criteria andHotellevelEqualTo(Integer value) {
            addCriterion("hotelLevel =", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelNotEqualTo(Integer value) {
            addCriterion("hotelLevel <>", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelGreaterThan(Integer value) {
            addCriterion("hotelLevel >", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelLevel >=", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelLessThan(Integer value) {
            addCriterion("hotelLevel <", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelLessThanOrEqualTo(Integer value) {
            addCriterion("hotelLevel <=", value, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelIn(List<Integer> values) {
            addCriterion("hotelLevel in", values, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelNotIn(List<Integer> values) {
            addCriterion("hotelLevel not in", values, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelBetween(Integer value1, Integer value2) {
            addCriterion("hotelLevel between", value1, value2, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andHotellevelNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelLevel not between", value1, value2, "hotellevel");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseIsNull() {
            addCriterion("isGroupPurchase is null");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseIsNotNull() {
            addCriterion("isGroupPurchase is not null");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseEqualTo(Integer value) {
            addCriterion("isGroupPurchase =", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseNotEqualTo(Integer value) {
            addCriterion("isGroupPurchase <>", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseGreaterThan(Integer value) {
            addCriterion("isGroupPurchase >", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("isGroupPurchase >=", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseLessThan(Integer value) {
            addCriterion("isGroupPurchase <", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("isGroupPurchase <=", value, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseIn(List<Integer> values) {
            addCriterion("isGroupPurchase in", values, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseNotIn(List<Integer> values) {
            addCriterion("isGroupPurchase not in", values, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseBetween(Integer value1, Integer value2) {
            addCriterion("isGroupPurchase between", value1, value2, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andIsgrouppurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("isGroupPurchase not between", value1, value2, "isgrouppurchase");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameIsNull() {
            addCriterion("redundantCityName is null");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameIsNotNull() {
            addCriterion("redundantCityName is not null");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameEqualTo(String value) {
            addCriterion("redundantCityName =", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameNotEqualTo(String value) {
            addCriterion("redundantCityName <>", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameGreaterThan(String value) {
            addCriterion("redundantCityName >", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameGreaterThanOrEqualTo(String value) {
            addCriterion("redundantCityName >=", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameLessThan(String value) {
            addCriterion("redundantCityName <", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameLessThanOrEqualTo(String value) {
            addCriterion("redundantCityName <=", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameLike(String value) {
            addCriterion("redundantCityName like", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameNotLike(String value) {
            addCriterion("redundantCityName not like", value, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameIn(List<String> values) {
            addCriterion("redundantCityName in", values, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameNotIn(List<String> values) {
            addCriterion("redundantCityName not in", values, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameBetween(String value1, String value2) {
            addCriterion("redundantCityName between", value1, value2, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantcitynameNotBetween(String value1, String value2) {
            addCriterion("redundantCityName not between", value1, value2, "redundantcityname");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameIsNull() {
            addCriterion("redundantProvinceName is null");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameIsNotNull() {
            addCriterion("redundantProvinceName is not null");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameEqualTo(String value) {
            addCriterion("redundantProvinceName =", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameNotEqualTo(String value) {
            addCriterion("redundantProvinceName <>", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameGreaterThan(String value) {
            addCriterion("redundantProvinceName >", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameGreaterThanOrEqualTo(String value) {
            addCriterion("redundantProvinceName >=", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameLessThan(String value) {
            addCriterion("redundantProvinceName <", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameLessThanOrEqualTo(String value) {
            addCriterion("redundantProvinceName <=", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameLike(String value) {
            addCriterion("redundantProvinceName like", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameNotLike(String value) {
            addCriterion("redundantProvinceName not like", value, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameIn(List<String> values) {
            addCriterion("redundantProvinceName in", values, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameNotIn(List<String> values) {
            addCriterion("redundantProvinceName not in", values, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameBetween(String value1, String value2) {
            addCriterion("redundantProvinceName between", value1, value2, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantprovincenameNotBetween(String value1, String value2) {
            addCriterion("redundantProvinceName not between", value1, value2, "redundantprovincename");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameIsNull() {
            addCriterion("redundantCountryName is null");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameIsNotNull() {
            addCriterion("redundantCountryName is not null");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameEqualTo(String value) {
            addCriterion("redundantCountryName =", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameNotEqualTo(String value) {
            addCriterion("redundantCountryName <>", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameGreaterThan(String value) {
            addCriterion("redundantCountryName >", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("redundantCountryName >=", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameLessThan(String value) {
            addCriterion("redundantCountryName <", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameLessThanOrEqualTo(String value) {
            addCriterion("redundantCountryName <=", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameLike(String value) {
            addCriterion("redundantCountryName like", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameNotLike(String value) {
            addCriterion("redundantCountryName not like", value, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameIn(List<String> values) {
            addCriterion("redundantCountryName in", values, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameNotIn(List<String> values) {
            addCriterion("redundantCountryName not in", values, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameBetween(String value1, String value2) {
            addCriterion("redundantCountryName between", value1, value2, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundantcountrynameNotBetween(String value1, String value2) {
            addCriterion("redundantCountryName not between", value1, value2, "redundantcountryname");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreIsNull() {
            addCriterion("redundantHotelStore is null");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreIsNotNull() {
            addCriterion("redundantHotelStore is not null");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreEqualTo(Integer value) {
            addCriterion("redundantHotelStore =", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreNotEqualTo(Integer value) {
            addCriterion("redundantHotelStore <>", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreGreaterThan(Integer value) {
            addCriterion("redundantHotelStore >", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("redundantHotelStore >=", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreLessThan(Integer value) {
            addCriterion("redundantHotelStore <", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreLessThanOrEqualTo(Integer value) {
            addCriterion("redundantHotelStore <=", value, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreIn(List<Integer> values) {
            addCriterion("redundantHotelStore in", values, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreNotIn(List<Integer> values) {
            addCriterion("redundantHotelStore not in", values, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreBetween(Integer value1, Integer value2) {
            addCriterion("redundantHotelStore between", value1, value2, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andRedundanthotelstoreNotBetween(Integer value1, Integer value2) {
            addCriterion("redundantHotelStore not between", value1, value2, "redundanthotelstore");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("creationDate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIsNull() {
            addCriterion("modifiedBy is null");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIsNotNull() {
            addCriterion("modifiedBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedbyEqualTo(Long value) {
            addCriterion("modifiedBy =", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotEqualTo(Long value) {
            addCriterion("modifiedBy <>", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyGreaterThan(Long value) {
            addCriterion("modifiedBy >", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("modifiedBy >=", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyLessThan(Long value) {
            addCriterion("modifiedBy <", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyLessThanOrEqualTo(Long value) {
            addCriterion("modifiedBy <=", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIn(List<Long> values) {
            addCriterion("modifiedBy in", values, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotIn(List<Long> values) {
            addCriterion("modifiedBy not in", values, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyBetween(Long value1, Long value2) {
            addCriterion("modifiedBy between", value1, value2, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotBetween(Long value1, Long value2) {
            addCriterion("modifiedBy not between", value1, value2, "modifiedby");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}