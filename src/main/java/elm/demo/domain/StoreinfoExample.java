package elm.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreinfoExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNull() {
            addCriterion("sphoto is null");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNotNull() {
            addCriterion("sphoto is not null");
            return (Criteria) this;
        }

        public Criteria andSphotoEqualTo(String value) {
            addCriterion("sphoto =", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotEqualTo(String value) {
            addCriterion("sphoto <>", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThan(String value) {
            addCriterion("sphoto >", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThanOrEqualTo(String value) {
            addCriterion("sphoto >=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThan(String value) {
            addCriterion("sphoto <", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThanOrEqualTo(String value) {
            addCriterion("sphoto <=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLike(String value) {
            addCriterion("sphoto like", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotLike(String value) {
            addCriterion("sphoto not like", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoIn(List<String> values) {
            addCriterion("sphoto in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotIn(List<String> values) {
            addCriterion("sphoto not in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoBetween(String value1, String value2) {
            addCriterion("sphoto between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotBetween(String value1, String value2) {
            addCriterion("sphoto not between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(String value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(String value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(String value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(String value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(String value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(String value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLike(String value) {
            addCriterion("marking like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotLike(String value) {
            addCriterion("marking not like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<String> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<String> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(String value1, String value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(String value1, String value2) {
            addCriterion("marking not between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andDispatchingIsNull() {
            addCriterion("dispatching is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingIsNotNull() {
            addCriterion("dispatching is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingEqualTo(String value) {
            addCriterion("dispatching =", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingNotEqualTo(String value) {
            addCriterion("dispatching <>", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingGreaterThan(String value) {
            addCriterion("dispatching >", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingGreaterThanOrEqualTo(String value) {
            addCriterion("dispatching >=", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingLessThan(String value) {
            addCriterion("dispatching <", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingLessThanOrEqualTo(String value) {
            addCriterion("dispatching <=", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingLike(String value) {
            addCriterion("dispatching like", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingNotLike(String value) {
            addCriterion("dispatching not like", value, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingIn(List<String> values) {
            addCriterion("dispatching in", values, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingNotIn(List<String> values) {
            addCriterion("dispatching not in", values, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingBetween(String value1, String value2) {
            addCriterion("dispatching between", value1, value2, "dispatching");
            return (Criteria) this;
        }

        public Criteria andDispatchingNotBetween(String value1, String value2) {
            addCriterion("dispatching not between", value1, value2, "dispatching");
            return (Criteria) this;
        }

        public Criteria andSadderssIsNull() {
            addCriterion("sadderss is null");
            return (Criteria) this;
        }

        public Criteria andSadderssIsNotNull() {
            addCriterion("sadderss is not null");
            return (Criteria) this;
        }

        public Criteria andSadderssEqualTo(String value) {
            addCriterion("sadderss =", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssNotEqualTo(String value) {
            addCriterion("sadderss <>", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssGreaterThan(String value) {
            addCriterion("sadderss >", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssGreaterThanOrEqualTo(String value) {
            addCriterion("sadderss >=", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssLessThan(String value) {
            addCriterion("sadderss <", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssLessThanOrEqualTo(String value) {
            addCriterion("sadderss <=", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssLike(String value) {
            addCriterion("sadderss like", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssNotLike(String value) {
            addCriterion("sadderss not like", value, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssIn(List<String> values) {
            addCriterion("sadderss in", values, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssNotIn(List<String> values) {
            addCriterion("sadderss not in", values, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssBetween(String value1, String value2) {
            addCriterion("sadderss between", value1, value2, "sadderss");
            return (Criteria) this;
        }

        public Criteria andSadderssNotBetween(String value1, String value2) {
            addCriterion("sadderss not between", value1, value2, "sadderss");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(Boolean value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(Boolean value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(Boolean value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(Boolean value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(Boolean value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(Boolean value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List<Boolean> values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List<Boolean> values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(Boolean value1, Boolean value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(Boolean value1, Boolean value2) {
            addCriterion("offer not between", value1, value2, "offer");
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