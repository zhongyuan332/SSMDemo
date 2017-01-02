package com.edu.ccut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FocusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public FocusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFocustoIsNull() {
            addCriterion("focusto is null");
            return (Criteria) this;
        }

        public Criteria andFocustoIsNotNull() {
            addCriterion("focusto is not null");
            return (Criteria) this;
        }

        public Criteria andFocustoEqualTo(Integer value) {
            addCriterion("focusto =", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoNotEqualTo(Integer value) {
            addCriterion("focusto <>", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoGreaterThan(Integer value) {
            addCriterion("focusto >", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoGreaterThanOrEqualTo(Integer value) {
            addCriterion("focusto >=", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoLessThan(Integer value) {
            addCriterion("focusto <", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoLessThanOrEqualTo(Integer value) {
            addCriterion("focusto <=", value, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoIn(List<Integer> values) {
            addCriterion("focusto in", values, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoNotIn(List<Integer> values) {
            addCriterion("focusto not in", values, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoBetween(Integer value1, Integer value2) {
            addCriterion("focusto between", value1, value2, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocustoNotBetween(Integer value1, Integer value2) {
            addCriterion("focusto not between", value1, value2, "focusto");
            return (Criteria) this;
        }

        public Criteria andFocusfromIsNull() {
            addCriterion("focusfrom is null");
            return (Criteria) this;
        }

        public Criteria andFocusfromIsNotNull() {
            addCriterion("focusfrom is not null");
            return (Criteria) this;
        }

        public Criteria andFocusfromEqualTo(Integer value) {
            addCriterion("focusfrom =", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromNotEqualTo(Integer value) {
            addCriterion("focusfrom <>", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromGreaterThan(Integer value) {
            addCriterion("focusfrom >", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("focusfrom >=", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromLessThan(Integer value) {
            addCriterion("focusfrom <", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromLessThanOrEqualTo(Integer value) {
            addCriterion("focusfrom <=", value, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromIn(List<Integer> values) {
            addCriterion("focusfrom in", values, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromNotIn(List<Integer> values) {
            addCriterion("focusfrom not in", values, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromBetween(Integer value1, Integer value2) {
            addCriterion("focusfrom between", value1, value2, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusfromNotBetween(Integer value1, Integer value2) {
            addCriterion("focusfrom not between", value1, value2, "focusfrom");
            return (Criteria) this;
        }

        public Criteria andFocusflagIsNull() {
            addCriterion("focusflag is null");
            return (Criteria) this;
        }

        public Criteria andFocusflagIsNotNull() {
            addCriterion("focusflag is not null");
            return (Criteria) this;
        }

        public Criteria andFocusflagEqualTo(Integer value) {
            addCriterion("focusflag =", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagNotEqualTo(Integer value) {
            addCriterion("focusflag <>", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagGreaterThan(Integer value) {
            addCriterion("focusflag >", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("focusflag >=", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagLessThan(Integer value) {
            addCriterion("focusflag <", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagLessThanOrEqualTo(Integer value) {
            addCriterion("focusflag <=", value, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagIn(List<Integer> values) {
            addCriterion("focusflag in", values, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagNotIn(List<Integer> values) {
            addCriterion("focusflag not in", values, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagBetween(Integer value1, Integer value2) {
            addCriterion("focusflag between", value1, value2, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusflagNotBetween(Integer value1, Integer value2) {
            addCriterion("focusflag not between", value1, value2, "focusflag");
            return (Criteria) this;
        }

        public Criteria andFocusstateIsNull() {
            addCriterion("focusstate is null");
            return (Criteria) this;
        }

        public Criteria andFocusstateIsNotNull() {
            addCriterion("focusstate is not null");
            return (Criteria) this;
        }

        public Criteria andFocusstateEqualTo(Integer value) {
            addCriterion("focusstate =", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateNotEqualTo(Integer value) {
            addCriterion("focusstate <>", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateGreaterThan(Integer value) {
            addCriterion("focusstate >", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("focusstate >=", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateLessThan(Integer value) {
            addCriterion("focusstate <", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateLessThanOrEqualTo(Integer value) {
            addCriterion("focusstate <=", value, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateIn(List<Integer> values) {
            addCriterion("focusstate in", values, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateNotIn(List<Integer> values) {
            addCriterion("focusstate not in", values, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateBetween(Integer value1, Integer value2) {
            addCriterion("focusstate between", value1, value2, "focusstate");
            return (Criteria) this;
        }

        public Criteria andFocusstateNotBetween(Integer value1, Integer value2) {
            addCriterion("focusstate not between", value1, value2, "focusstate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andR1IsNull() {
            addCriterion("r1 is null");
            return (Criteria) this;
        }

        public Criteria andR1IsNotNull() {
            addCriterion("r1 is not null");
            return (Criteria) this;
        }

        public Criteria andR1EqualTo(String value) {
            addCriterion("r1 =", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotEqualTo(String value) {
            addCriterion("r1 <>", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThan(String value) {
            addCriterion("r1 >", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThanOrEqualTo(String value) {
            addCriterion("r1 >=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThan(String value) {
            addCriterion("r1 <", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThanOrEqualTo(String value) {
            addCriterion("r1 <=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Like(String value) {
            addCriterion("r1 like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotLike(String value) {
            addCriterion("r1 not like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1In(List<String> values) {
            addCriterion("r1 in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotIn(List<String> values) {
            addCriterion("r1 not in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Between(String value1, String value2) {
            addCriterion("r1 between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotBetween(String value1, String value2) {
            addCriterion("r1 not between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR2IsNull() {
            addCriterion("r2 is null");
            return (Criteria) this;
        }

        public Criteria andR2IsNotNull() {
            addCriterion("r2 is not null");
            return (Criteria) this;
        }

        public Criteria andR2EqualTo(String value) {
            addCriterion("r2 =", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotEqualTo(String value) {
            addCriterion("r2 <>", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThan(String value) {
            addCriterion("r2 >", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThanOrEqualTo(String value) {
            addCriterion("r2 >=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThan(String value) {
            addCriterion("r2 <", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThanOrEqualTo(String value) {
            addCriterion("r2 <=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Like(String value) {
            addCriterion("r2 like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotLike(String value) {
            addCriterion("r2 not like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2In(List<String> values) {
            addCriterion("r2 in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotIn(List<String> values) {
            addCriterion("r2 not in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Between(String value1, String value2) {
            addCriterion("r2 between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotBetween(String value1, String value2) {
            addCriterion("r2 not between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR3IsNull() {
            addCriterion("r3 is null");
            return (Criteria) this;
        }

        public Criteria andR3IsNotNull() {
            addCriterion("r3 is not null");
            return (Criteria) this;
        }

        public Criteria andR3EqualTo(String value) {
            addCriterion("r3 =", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotEqualTo(String value) {
            addCriterion("r3 <>", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThan(String value) {
            addCriterion("r3 >", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThanOrEqualTo(String value) {
            addCriterion("r3 >=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThan(String value) {
            addCriterion("r3 <", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThanOrEqualTo(String value) {
            addCriterion("r3 <=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Like(String value) {
            addCriterion("r3 like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotLike(String value) {
            addCriterion("r3 not like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3In(List<String> values) {
            addCriterion("r3 in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotIn(List<String> values) {
            addCriterion("r3 not in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Between(String value1, String value2) {
            addCriterion("r3 between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotBetween(String value1, String value2) {
            addCriterion("r3 not between", value1, value2, "r3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table focus
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 02 17:35:41 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table focus
     *
     * @mbggenerated Mon Jan 02 17:35:41 CST 2017
     */
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