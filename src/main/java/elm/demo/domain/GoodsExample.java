package elm.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGinfoIsNull() {
            addCriterion("ginfo is null");
            return (Criteria) this;
        }

        public Criteria andGinfoIsNotNull() {
            addCriterion("ginfo is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoEqualTo(String value) {
            addCriterion("ginfo =", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotEqualTo(String value) {
            addCriterion("ginfo <>", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoGreaterThan(String value) {
            addCriterion("ginfo >", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ginfo >=", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLessThan(String value) {
            addCriterion("ginfo <", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLessThanOrEqualTo(String value) {
            addCriterion("ginfo <=", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLike(String value) {
            addCriterion("ginfo like", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotLike(String value) {
            addCriterion("ginfo not like", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoIn(List<String> values) {
            addCriterion("ginfo in", values, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotIn(List<String> values) {
            addCriterion("ginfo not in", values, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoBetween(String value1, String value2) {
            addCriterion("ginfo between", value1, value2, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotBetween(String value1, String value2) {
            addCriterion("ginfo not between", value1, value2, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGphotoIsNull() {
            addCriterion("gphoto is null");
            return (Criteria) this;
        }

        public Criteria andGphotoIsNotNull() {
            addCriterion("gphoto is not null");
            return (Criteria) this;
        }

        public Criteria andGphotoEqualTo(String value) {
            addCriterion("gphoto =", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoNotEqualTo(String value) {
            addCriterion("gphoto <>", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoGreaterThan(String value) {
            addCriterion("gphoto >", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoGreaterThanOrEqualTo(String value) {
            addCriterion("gphoto >=", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoLessThan(String value) {
            addCriterion("gphoto <", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoLessThanOrEqualTo(String value) {
            addCriterion("gphoto <=", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoLike(String value) {
            addCriterion("gphoto like", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoNotLike(String value) {
            addCriterion("gphoto not like", value, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoIn(List<String> values) {
            addCriterion("gphoto in", values, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoNotIn(List<String> values) {
            addCriterion("gphoto not in", values, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoBetween(String value1, String value2) {
            addCriterion("gphoto between", value1, value2, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGphotoNotBetween(String value1, String value2) {
            addCriterion("gphoto not between", value1, value2, "gphoto");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Double value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Double value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Double value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Double value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Double value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Double> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Double> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Double value1, Double value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Double value1, Double value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGtidIsNull() {
            addCriterion("gtid is null");
            return (Criteria) this;
        }

        public Criteria andGtidIsNotNull() {
            addCriterion("gtid is not null");
            return (Criteria) this;
        }

        public Criteria andGtidEqualTo(Integer value) {
            addCriterion("gtid =", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotEqualTo(Integer value) {
            addCriterion("gtid <>", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThan(Integer value) {
            addCriterion("gtid >", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtid >=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThan(Integer value) {
            addCriterion("gtid <", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThanOrEqualTo(Integer value) {
            addCriterion("gtid <=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidIn(List<Integer> values) {
            addCriterion("gtid in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotIn(List<Integer> values) {
            addCriterion("gtid not in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidBetween(Integer value1, Integer value2) {
            addCriterion("gtid between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtid not between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andGsidIsNull() {
            addCriterion("gsid is null");
            return (Criteria) this;
        }

        public Criteria andGsidIsNotNull() {
            addCriterion("gsid is not null");
            return (Criteria) this;
        }

        public Criteria andGsidEqualTo(Integer value) {
            addCriterion("gsid =", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotEqualTo(Integer value) {
            addCriterion("gsid <>", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThan(Integer value) {
            addCriterion("gsid >", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsid >=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThan(Integer value) {
            addCriterion("gsid <", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThanOrEqualTo(Integer value) {
            addCriterion("gsid <=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidIn(List<Integer> values) {
            addCriterion("gsid in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotIn(List<Integer> values) {
            addCriterion("gsid not in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidBetween(Integer value1, Integer value2) {
            addCriterion("gsid between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotBetween(Integer value1, Integer value2) {
            addCriterion("gsid not between", value1, value2, "gsid");
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