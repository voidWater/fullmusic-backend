package com.fullmusic.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNull() {
            addCriterion("vc_name is null");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNotNull() {
            addCriterion("vc_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcNameEqualTo(String value) {
            addCriterion("vc_name =", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotEqualTo(String value) {
            addCriterion("vc_name <>", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThan(String value) {
            addCriterion("vc_name >", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_name >=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThan(String value) {
            addCriterion("vc_name <", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThanOrEqualTo(String value) {
            addCriterion("vc_name <=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLike(String value) {
            addCriterion("vc_name like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotLike(String value) {
            addCriterion("vc_name not like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameIn(List<String> values) {
            addCriterion("vc_name in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotIn(List<String> values) {
            addCriterion("vc_name not in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameBetween(String value1, String value2) {
            addCriterion("vc_name between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotBetween(String value1, String value2) {
            addCriterion("vc_name not between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameIsNull() {
            addCriterion("vc_ali_name is null");
            return (Criteria) this;
        }

        public Criteria andVcAliNameIsNotNull() {
            addCriterion("vc_ali_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcAliNameEqualTo(String value) {
            addCriterion("vc_ali_name =", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameNotEqualTo(String value) {
            addCriterion("vc_ali_name <>", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameGreaterThan(String value) {
            addCriterion("vc_ali_name >", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_ali_name >=", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameLessThan(String value) {
            addCriterion("vc_ali_name <", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameLessThanOrEqualTo(String value) {
            addCriterion("vc_ali_name <=", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameLike(String value) {
            addCriterion("vc_ali_name like", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameNotLike(String value) {
            addCriterion("vc_ali_name not like", value, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameIn(List<String> values) {
            addCriterion("vc_ali_name in", values, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameNotIn(List<String> values) {
            addCriterion("vc_ali_name not in", values, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameBetween(String value1, String value2) {
            addCriterion("vc_ali_name between", value1, value2, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcAliNameNotBetween(String value1, String value2) {
            addCriterion("vc_ali_name not between", value1, value2, "vcAliName");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNull() {
            addCriterion("vc_phone is null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNotNull() {
            addCriterion("vc_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneEqualTo(String value) {
            addCriterion("vc_phone =", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotEqualTo(String value) {
            addCriterion("vc_phone <>", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThan(String value) {
            addCriterion("vc_phone >", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vc_phone >=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThan(String value) {
            addCriterion("vc_phone <", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThanOrEqualTo(String value) {
            addCriterion("vc_phone <=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLike(String value) {
            addCriterion("vc_phone like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotLike(String value) {
            addCriterion("vc_phone not like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIn(List<String> values) {
            addCriterion("vc_phone in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotIn(List<String> values) {
            addCriterion("vc_phone not in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneBetween(String value1, String value2) {
            addCriterion("vc_phone between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotBetween(String value1, String value2) {
            addCriterion("vc_phone not between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcWxIsNull() {
            addCriterion("vc_wx is null");
            return (Criteria) this;
        }

        public Criteria andVcWxIsNotNull() {
            addCriterion("vc_wx is not null");
            return (Criteria) this;
        }

        public Criteria andVcWxEqualTo(String value) {
            addCriterion("vc_wx =", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxNotEqualTo(String value) {
            addCriterion("vc_wx <>", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxGreaterThan(String value) {
            addCriterion("vc_wx >", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxGreaterThanOrEqualTo(String value) {
            addCriterion("vc_wx >=", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxLessThan(String value) {
            addCriterion("vc_wx <", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxLessThanOrEqualTo(String value) {
            addCriterion("vc_wx <=", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxLike(String value) {
            addCriterion("vc_wx like", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxNotLike(String value) {
            addCriterion("vc_wx not like", value, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxIn(List<String> values) {
            addCriterion("vc_wx in", values, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxNotIn(List<String> values) {
            addCriterion("vc_wx not in", values, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxBetween(String value1, String value2) {
            addCriterion("vc_wx between", value1, value2, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcWxNotBetween(String value1, String value2) {
            addCriterion("vc_wx not between", value1, value2, "vcWx");
            return (Criteria) this;
        }

        public Criteria andVcAddrIsNull() {
            addCriterion("vc_addr is null");
            return (Criteria) this;
        }

        public Criteria andVcAddrIsNotNull() {
            addCriterion("vc_addr is not null");
            return (Criteria) this;
        }

        public Criteria andVcAddrEqualTo(String value) {
            addCriterion("vc_addr =", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrNotEqualTo(String value) {
            addCriterion("vc_addr <>", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrGreaterThan(String value) {
            addCriterion("vc_addr >", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrGreaterThanOrEqualTo(String value) {
            addCriterion("vc_addr >=", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrLessThan(String value) {
            addCriterion("vc_addr <", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrLessThanOrEqualTo(String value) {
            addCriterion("vc_addr <=", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrLike(String value) {
            addCriterion("vc_addr like", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrNotLike(String value) {
            addCriterion("vc_addr not like", value, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrIn(List<String> values) {
            addCriterion("vc_addr in", values, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrNotIn(List<String> values) {
            addCriterion("vc_addr not in", values, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrBetween(String value1, String value2) {
            addCriterion("vc_addr between", value1, value2, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcAddrNotBetween(String value1, String value2) {
            addCriterion("vc_addr not between", value1, value2, "vcAddr");
            return (Criteria) this;
        }

        public Criteria andVcTypeIsNull() {
            addCriterion("vc_type is null");
            return (Criteria) this;
        }

        public Criteria andVcTypeIsNotNull() {
            addCriterion("vc_type is not null");
            return (Criteria) this;
        }

        public Criteria andVcTypeEqualTo(Integer value) {
            addCriterion("vc_type =", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotEqualTo(Integer value) {
            addCriterion("vc_type <>", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThan(Integer value) {
            addCriterion("vc_type >", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_type >=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThan(Integer value) {
            addCriterion("vc_type <", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThanOrEqualTo(Integer value) {
            addCriterion("vc_type <=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeIn(List<Integer> values) {
            addCriterion("vc_type in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotIn(List<Integer> values) {
            addCriterion("vc_type not in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeBetween(Integer value1, Integer value2) {
            addCriterion("vc_type between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_type not between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcRemakeIsNull() {
            addCriterion("vc_remake is null");
            return (Criteria) this;
        }

        public Criteria andVcRemakeIsNotNull() {
            addCriterion("vc_remake is not null");
            return (Criteria) this;
        }

        public Criteria andVcRemakeEqualTo(String value) {
            addCriterion("vc_remake =", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeNotEqualTo(String value) {
            addCriterion("vc_remake <>", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeGreaterThan(String value) {
            addCriterion("vc_remake >", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("vc_remake >=", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeLessThan(String value) {
            addCriterion("vc_remake <", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeLessThanOrEqualTo(String value) {
            addCriterion("vc_remake <=", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeLike(String value) {
            addCriterion("vc_remake like", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeNotLike(String value) {
            addCriterion("vc_remake not like", value, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeIn(List<String> values) {
            addCriterion("vc_remake in", values, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeNotIn(List<String> values) {
            addCriterion("vc_remake not in", values, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeBetween(String value1, String value2) {
            addCriterion("vc_remake between", value1, value2, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcRemakeNotBetween(String value1, String value2) {
            addCriterion("vc_remake not between", value1, value2, "vcRemake");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIsNull() {
            addCriterion("vc_invalid is null");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIsNotNull() {
            addCriterion("vc_invalid is not null");
            return (Criteria) this;
        }

        public Criteria andVcInvalidEqualTo(Integer value) {
            addCriterion("vc_invalid =", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotEqualTo(Integer value) {
            addCriterion("vc_invalid <>", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidGreaterThan(Integer value) {
            addCriterion("vc_invalid >", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_invalid >=", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidLessThan(Integer value) {
            addCriterion("vc_invalid <", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidLessThanOrEqualTo(Integer value) {
            addCriterion("vc_invalid <=", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIn(List<Integer> values) {
            addCriterion("vc_invalid in", values, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotIn(List<Integer> values) {
            addCriterion("vc_invalid not in", values, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidBetween(Integer value1, Integer value2) {
            addCriterion("vc_invalid between", value1, value2, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_invalid not between", value1, value2, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIsNull() {
            addCriterion("vc_createDate is null");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIsNotNull() {
            addCriterion("vc_createDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateEqualTo(Date value) {
            addCriterion("vc_createDate =", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotEqualTo(Date value) {
            addCriterion("vc_createDate <>", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateGreaterThan(Date value) {
            addCriterion("vc_createDate >", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_createDate >=", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateLessThan(Date value) {
            addCriterion("vc_createDate <", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("vc_createDate <=", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIn(List<Date> values) {
            addCriterion("vc_createDate in", values, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotIn(List<Date> values) {
            addCriterion("vc_createDate not in", values, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateBetween(Date value1, Date value2) {
            addCriterion("vc_createDate between", value1, value2, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("vc_createDate not between", value1, value2, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIsNull() {
            addCriterion("vc_updateDate is null");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIsNotNull() {
            addCriterion("vc_updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateEqualTo(Date value) {
            addCriterion("vc_updateDate =", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotEqualTo(Date value) {
            addCriterion("vc_updateDate <>", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateGreaterThan(Date value) {
            addCriterion("vc_updateDate >", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_updateDate >=", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateLessThan(Date value) {
            addCriterion("vc_updateDate <", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("vc_updateDate <=", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIn(List<Date> values) {
            addCriterion("vc_updateDate in", values, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotIn(List<Date> values) {
            addCriterion("vc_updateDate not in", values, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateBetween(Date value1, Date value2) {
            addCriterion("vc_updateDate between", value1, value2, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("vc_updateDate not between", value1, value2, "vcUpdatedate");
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