package elm.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOcidIsNull() {
            addCriterion("ocid is null");
            return (Criteria) this;
        }

        public Criteria andOcidIsNotNull() {
            addCriterion("ocid is not null");
            return (Criteria) this;
        }

        public Criteria andOcidEqualTo(Integer value) {
            addCriterion("ocid =", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidNotEqualTo(Integer value) {
            addCriterion("ocid <>", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidGreaterThan(Integer value) {
            addCriterion("ocid >", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocid >=", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidLessThan(Integer value) {
            addCriterion("ocid <", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidLessThanOrEqualTo(Integer value) {
            addCriterion("ocid <=", value, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidIn(List<Integer> values) {
            addCriterion("ocid in", values, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidNotIn(List<Integer> values) {
            addCriterion("ocid not in", values, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidBetween(Integer value1, Integer value2) {
            addCriterion("ocid between", value1, value2, "ocid");
            return (Criteria) this;
        }

        public Criteria andOcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ocid not between", value1, value2, "ocid");
            return (Criteria) this;
        }

        public Criteria andOgidIsNull() {
            addCriterion("ogid is null");
            return (Criteria) this;
        }

        public Criteria andOgidIsNotNull() {
            addCriterion("ogid is not null");
            return (Criteria) this;
        }

        public Criteria andOgidEqualTo(Integer value) {
            addCriterion("ogid =", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidNotEqualTo(Integer value) {
            addCriterion("ogid <>", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidGreaterThan(Integer value) {
            addCriterion("ogid >", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ogid >=", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidLessThan(Integer value) {
            addCriterion("ogid <", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidLessThanOrEqualTo(Integer value) {
            addCriterion("ogid <=", value, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidIn(List<Integer> values) {
            addCriterion("ogid in", values, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidNotIn(List<Integer> values) {
            addCriterion("ogid not in", values, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidBetween(Integer value1, Integer value2) {
            addCriterion("ogid between", value1, value2, "ogid");
            return (Criteria) this;
        }

        public Criteria andOgidNotBetween(Integer value1, Integer value2) {
            addCriterion("ogid not between", value1, value2, "ogid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andOstoreidIsNull() {
            addCriterion("ostoreid is null");
            return (Criteria) this;
        }

        public Criteria andOstoreidIsNotNull() {
            addCriterion("ostoreid is not null");
            return (Criteria) this;
        }

        public Criteria andOstoreidEqualTo(Integer value) {
            addCriterion("ostoreid =", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidNotEqualTo(Integer value) {
            addCriterion("ostoreid <>", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidGreaterThan(Integer value) {
            addCriterion("ostoreid >", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostoreid >=", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidLessThan(Integer value) {
            addCriterion("ostoreid <", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidLessThanOrEqualTo(Integer value) {
            addCriterion("ostoreid <=", value, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidIn(List<Integer> values) {
            addCriterion("ostoreid in", values, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidNotIn(List<Integer> values) {
            addCriterion("ostoreid not in", values, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidBetween(Integer value1, Integer value2) {
            addCriterion("ostoreid between", value1, value2, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andOstoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("ostoreid not between", value1, value2, "ostoreid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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