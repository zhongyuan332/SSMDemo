package com.edu.ccut.pojo;

import java.util.ArrayList;
import java.util.List;

public class SystemseqExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public SystemseqExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
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

		public Criteria andSeqnameIsNull() {
			addCriterion("seqname is null");
			return (Criteria) this;
		}

		public Criteria andSeqnameIsNotNull() {
			addCriterion("seqname is not null");
			return (Criteria) this;
		}

		public Criteria andSeqnameEqualTo(String value) {
			addCriterion("seqname =", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameNotEqualTo(String value) {
			addCriterion("seqname <>", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameGreaterThan(String value) {
			addCriterion("seqname >", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameGreaterThanOrEqualTo(String value) {
			addCriterion("seqname >=", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameLessThan(String value) {
			addCriterion("seqname <", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameLessThanOrEqualTo(String value) {
			addCriterion("seqname <=", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameLike(String value) {
			addCriterion("seqname like", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameNotLike(String value) {
			addCriterion("seqname not like", value, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameIn(List<String> values) {
			addCriterion("seqname in", values, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameNotIn(List<String> values) {
			addCriterion("seqname not in", values, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameBetween(String value1, String value2) {
			addCriterion("seqname between", value1, value2, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqnameNotBetween(String value1, String value2) {
			addCriterion("seqname not between", value1, value2, "seqname");
			return (Criteria) this;
		}

		public Criteria andSeqIsNull() {
			addCriterion("seq is null");
			return (Criteria) this;
		}

		public Criteria andSeqIsNotNull() {
			addCriterion("seq is not null");
			return (Criteria) this;
		}

		public Criteria andSeqEqualTo(Integer value) {
			addCriterion("seq =", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqNotEqualTo(Integer value) {
			addCriterion("seq <>", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqGreaterThan(Integer value) {
			addCriterion("seq >", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
			addCriterion("seq >=", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqLessThan(Integer value) {
			addCriterion("seq <", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqLessThanOrEqualTo(Integer value) {
			addCriterion("seq <=", value, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqIn(List<Integer> values) {
			addCriterion("seq in", values, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqNotIn(List<Integer> values) {
			addCriterion("seq not in", values, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqBetween(Integer value1, Integer value2) {
			addCriterion("seq between", value1, value2, "seq");
			return (Criteria) this;
		}

		public Criteria andSeqNotBetween(Integer value1, Integer value2) {
			addCriterion("seq not between", value1, value2, "seq");
			return (Criteria) this;
		}

		public Criteria andMaxseqIsNull() {
			addCriterion("maxseq is null");
			return (Criteria) this;
		}

		public Criteria andMaxseqIsNotNull() {
			addCriterion("maxseq is not null");
			return (Criteria) this;
		}

		public Criteria andMaxseqEqualTo(Integer value) {
			addCriterion("maxseq =", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqNotEqualTo(Integer value) {
			addCriterion("maxseq <>", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqGreaterThan(Integer value) {
			addCriterion("maxseq >", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqGreaterThanOrEqualTo(Integer value) {
			addCriterion("maxseq >=", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqLessThan(Integer value) {
			addCriterion("maxseq <", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqLessThanOrEqualTo(Integer value) {
			addCriterion("maxseq <=", value, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqIn(List<Integer> values) {
			addCriterion("maxseq in", values, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqNotIn(List<Integer> values) {
			addCriterion("maxseq not in", values, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqBetween(Integer value1, Integer value2) {
			addCriterion("maxseq between", value1, value2, "maxseq");
			return (Criteria) this;
		}

		public Criteria andMaxseqNotBetween(Integer value1, Integer value2) {
			addCriterion("maxseq not between", value1, value2, "maxseq");
			return (Criteria) this;
		}

		public Criteria andDepictIsNull() {
			addCriterion("depict is null");
			return (Criteria) this;
		}

		public Criteria andDepictIsNotNull() {
			addCriterion("depict is not null");
			return (Criteria) this;
		}

		public Criteria andDepictEqualTo(String value) {
			addCriterion("depict =", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictNotEqualTo(String value) {
			addCriterion("depict <>", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictGreaterThan(String value) {
			addCriterion("depict >", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictGreaterThanOrEqualTo(String value) {
			addCriterion("depict >=", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictLessThan(String value) {
			addCriterion("depict <", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictLessThanOrEqualTo(String value) {
			addCriterion("depict <=", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictLike(String value) {
			addCriterion("depict like", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictNotLike(String value) {
			addCriterion("depict not like", value, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictIn(List<String> values) {
			addCriterion("depict in", values, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictNotIn(List<String> values) {
			addCriterion("depict not in", values, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictBetween(String value1, String value2) {
			addCriterion("depict between", value1, value2, "depict");
			return (Criteria) this;
		}

		public Criteria andDepictNotBetween(String value1, String value2) {
			addCriterion("depict not between", value1, value2, "depict");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table systemseq
	 * @mbggenerated  Tue Jul 12 09:39:33 CST 2016
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table systemseq
     *
     * @mbggenerated do_not_delete_during_merge Mon Jul 11 16:58:43 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}