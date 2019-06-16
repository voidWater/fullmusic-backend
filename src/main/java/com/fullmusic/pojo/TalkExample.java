package com.fullmusic.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TalkExample() {
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

        public Criteria andVcUserIdIsNull() {
            addCriterion("vc_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIsNotNull() {
            addCriterion("vc_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdEqualTo(String value) {
            addCriterion("vc_user_id =", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotEqualTo(String value) {
            addCriterion("vc_user_id <>", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThan(String value) {
            addCriterion("vc_user_id >", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_user_id >=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThan(String value) {
            addCriterion("vc_user_id <", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThanOrEqualTo(String value) {
            addCriterion("vc_user_id <=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLike(String value) {
            addCriterion("vc_user_id like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotLike(String value) {
            addCriterion("vc_user_id not like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIn(List<String> values) {
            addCriterion("vc_user_id in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotIn(List<String> values) {
            addCriterion("vc_user_id not in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdBetween(String value1, String value2) {
            addCriterion("vc_user_id between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotBetween(String value1, String value2) {
            addCriterion("vc_user_id not between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdIsNull() {
            addCriterion("vc_clockin_id is null");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdIsNotNull() {
            addCriterion("vc_clockin_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdEqualTo(String value) {
            addCriterion("vc_clockin_id =", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdNotEqualTo(String value) {
            addCriterion("vc_clockin_id <>", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdGreaterThan(String value) {
            addCriterion("vc_clockin_id >", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_clockin_id >=", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdLessThan(String value) {
            addCriterion("vc_clockin_id <", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdLessThanOrEqualTo(String value) {
            addCriterion("vc_clockin_id <=", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdLike(String value) {
            addCriterion("vc_clockin_id like", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdNotLike(String value) {
            addCriterion("vc_clockin_id not like", value, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdIn(List<String> values) {
            addCriterion("vc_clockin_id in", values, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdNotIn(List<String> values) {
            addCriterion("vc_clockin_id not in", values, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdBetween(String value1, String value2) {
            addCriterion("vc_clockin_id between", value1, value2, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcClockinIdNotBetween(String value1, String value2) {
            addCriterion("vc_clockin_id not between", value1, value2, "vcClockinId");
            return (Criteria) this;
        }

        public Criteria andVcContentIsNull() {
            addCriterion("vc_content is null");
            return (Criteria) this;
        }

        public Criteria andVcContentIsNotNull() {
            addCriterion("vc_content is not null");
            return (Criteria) this;
        }

        public Criteria andVcContentEqualTo(String value) {
            addCriterion("vc_content =", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentNotEqualTo(String value) {
            addCriterion("vc_content <>", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentGreaterThan(String value) {
            addCriterion("vc_content >", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentGreaterThanOrEqualTo(String value) {
            addCriterion("vc_content >=", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentLessThan(String value) {
            addCriterion("vc_content <", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentLessThanOrEqualTo(String value) {
            addCriterion("vc_content <=", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentLike(String value) {
            addCriterion("vc_content like", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentNotLike(String value) {
            addCriterion("vc_content not like", value, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentIn(List<String> values) {
            addCriterion("vc_content in", values, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentNotIn(List<String> values) {
            addCriterion("vc_content not in", values, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentBetween(String value1, String value2) {
            addCriterion("vc_content between", value1, value2, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcContentNotBetween(String value1, String value2) {
            addCriterion("vc_content not between", value1, value2, "vcContent");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlIsNull() {
            addCriterion("vc_resource_url is null");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlIsNotNull() {
            addCriterion("vc_resource_url is not null");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlEqualTo(String value) {
            addCriterion("vc_resource_url =", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlNotEqualTo(String value) {
            addCriterion("vc_resource_url <>", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlGreaterThan(String value) {
            addCriterion("vc_resource_url >", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("vc_resource_url >=", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlLessThan(String value) {
            addCriterion("vc_resource_url <", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("vc_resource_url <=", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlLike(String value) {
            addCriterion("vc_resource_url like", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlNotLike(String value) {
            addCriterion("vc_resource_url not like", value, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlIn(List<String> values) {
            addCriterion("vc_resource_url in", values, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlNotIn(List<String> values) {
            addCriterion("vc_resource_url not in", values, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlBetween(String value1, String value2) {
            addCriterion("vc_resource_url between", value1, value2, "vcResourceUrl");
            return (Criteria) this;
        }

        public Criteria andVcResourceUrlNotBetween(String value1, String value2) {
            addCriterion("vc_resource_url not between", value1, value2, "vcResourceUrl");
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