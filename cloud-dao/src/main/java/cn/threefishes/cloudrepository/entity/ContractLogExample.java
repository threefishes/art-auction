package cn.threefishes.cloudrepository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractLogExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeIsNull() {
            addCriterion("log_addtime is null");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeIsNotNull() {
            addCriterion("log_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeEqualTo(Date value) {
            addCriterion("log_addtime =", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeNotEqualTo(Date value) {
            addCriterion("log_addtime <>", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeGreaterThan(Date value) {
            addCriterion("log_addtime >", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_addtime >=", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeLessThan(Date value) {
            addCriterion("log_addtime <", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("log_addtime <=", value, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeIn(List<Date> values) {
            addCriterion("log_addtime in", values, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeNotIn(List<Date> values) {
            addCriterion("log_addtime not in", values, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeBetween(Date value1, Date value2) {
            addCriterion("log_addtime between", value1, value2, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("log_addtime not between", value1, value2, "logAddtime");
            return (Criteria) this;
        }

        public Criteria andLogItemidIsNull() {
            addCriterion("log_itemid is null");
            return (Criteria) this;
        }

        public Criteria andLogItemidIsNotNull() {
            addCriterion("log_itemid is not null");
            return (Criteria) this;
        }

        public Criteria andLogItemidEqualTo(Integer value) {
            addCriterion("log_itemid =", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidNotEqualTo(Integer value) {
            addCriterion("log_itemid <>", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidGreaterThan(Integer value) {
            addCriterion("log_itemid >", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_itemid >=", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidLessThan(Integer value) {
            addCriterion("log_itemid <", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidLessThanOrEqualTo(Integer value) {
            addCriterion("log_itemid <=", value, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidIn(List<Integer> values) {
            addCriterion("log_itemid in", values, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidNotIn(List<Integer> values) {
            addCriterion("log_itemid not in", values, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidBetween(Integer value1, Integer value2) {
            addCriterion("log_itemid between", value1, value2, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("log_itemid not between", value1, value2, "logItemid");
            return (Criteria) this;
        }

        public Criteria andLogItemnameIsNull() {
            addCriterion("log_itemname is null");
            return (Criteria) this;
        }

        public Criteria andLogItemnameIsNotNull() {
            addCriterion("log_itemname is not null");
            return (Criteria) this;
        }

        public Criteria andLogItemnameEqualTo(String value) {
            addCriterion("log_itemname =", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameNotEqualTo(String value) {
            addCriterion("log_itemname <>", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameGreaterThan(String value) {
            addCriterion("log_itemname >", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("log_itemname >=", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameLessThan(String value) {
            addCriterion("log_itemname <", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameLessThanOrEqualTo(String value) {
            addCriterion("log_itemname <=", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameLike(String value) {
            addCriterion("log_itemname like", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameNotLike(String value) {
            addCriterion("log_itemname not like", value, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameIn(List<String> values) {
            addCriterion("log_itemname in", values, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameNotIn(List<String> values) {
            addCriterion("log_itemname not in", values, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameBetween(String value1, String value2) {
            addCriterion("log_itemname between", value1, value2, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogItemnameNotBetween(String value1, String value2) {
            addCriterion("log_itemname not between", value1, value2, "logItemname");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNull() {
            addCriterion("log_msg is null");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNotNull() {
            addCriterion("log_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLogMsgEqualTo(String value) {
            addCriterion("log_msg =", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotEqualTo(String value) {
            addCriterion("log_msg <>", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThan(String value) {
            addCriterion("log_msg >", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThanOrEqualTo(String value) {
            addCriterion("log_msg >=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThan(String value) {
            addCriterion("log_msg <", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThanOrEqualTo(String value) {
            addCriterion("log_msg <=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLike(String value) {
            addCriterion("log_msg like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotLike(String value) {
            addCriterion("log_msg not like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgIn(List<String> values) {
            addCriterion("log_msg in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotIn(List<String> values) {
            addCriterion("log_msg not in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgBetween(String value1, String value2) {
            addCriterion("log_msg between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotBetween(String value1, String value2) {
            addCriterion("log_msg not between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogRoleIsNull() {
            addCriterion("log_role is null");
            return (Criteria) this;
        }

        public Criteria andLogRoleIsNotNull() {
            addCriterion("log_role is not null");
            return (Criteria) this;
        }

        public Criteria andLogRoleEqualTo(String value) {
            addCriterion("log_role =", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotEqualTo(String value) {
            addCriterion("log_role <>", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleGreaterThan(String value) {
            addCriterion("log_role >", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleGreaterThanOrEqualTo(String value) {
            addCriterion("log_role >=", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLessThan(String value) {
            addCriterion("log_role <", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLessThanOrEqualTo(String value) {
            addCriterion("log_role <=", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleLike(String value) {
            addCriterion("log_role like", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotLike(String value) {
            addCriterion("log_role not like", value, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleIn(List<String> values) {
            addCriterion("log_role in", values, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotIn(List<String> values) {
            addCriterion("log_role not in", values, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleBetween(String value1, String value2) {
            addCriterion("log_role between", value1, value2, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogRoleNotBetween(String value1, String value2) {
            addCriterion("log_role not between", value1, value2, "logRole");
            return (Criteria) this;
        }

        public Criteria andLogStoreidIsNull() {
            addCriterion("log_storeid is null");
            return (Criteria) this;
        }

        public Criteria andLogStoreidIsNotNull() {
            addCriterion("log_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andLogStoreidEqualTo(Integer value) {
            addCriterion("log_storeid =", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidNotEqualTo(Integer value) {
            addCriterion("log_storeid <>", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidGreaterThan(Integer value) {
            addCriterion("log_storeid >", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_storeid >=", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidLessThan(Integer value) {
            addCriterion("log_storeid <", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("log_storeid <=", value, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidIn(List<Integer> values) {
            addCriterion("log_storeid in", values, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidNotIn(List<Integer> values) {
            addCriterion("log_storeid not in", values, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidBetween(Integer value1, Integer value2) {
            addCriterion("log_storeid between", value1, value2, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("log_storeid not between", value1, value2, "logStoreid");
            return (Criteria) this;
        }

        public Criteria andLogStorenameIsNull() {
            addCriterion("log_storename is null");
            return (Criteria) this;
        }

        public Criteria andLogStorenameIsNotNull() {
            addCriterion("log_storename is not null");
            return (Criteria) this;
        }

        public Criteria andLogStorenameEqualTo(String value) {
            addCriterion("log_storename =", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameNotEqualTo(String value) {
            addCriterion("log_storename <>", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameGreaterThan(String value) {
            addCriterion("log_storename >", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("log_storename >=", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameLessThan(String value) {
            addCriterion("log_storename <", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameLessThanOrEqualTo(String value) {
            addCriterion("log_storename <=", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameLike(String value) {
            addCriterion("log_storename like", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameNotLike(String value) {
            addCriterion("log_storename not like", value, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameIn(List<String> values) {
            addCriterion("log_storename in", values, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameNotIn(List<String> values) {
            addCriterion("log_storename not in", values, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameBetween(String value1, String value2) {
            addCriterion("log_storename between", value1, value2, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogStorenameNotBetween(String value1, String value2) {
            addCriterion("log_storename not between", value1, value2, "logStorename");
            return (Criteria) this;
        }

        public Criteria andLogUseridIsNull() {
            addCriterion("log_userid is null");
            return (Criteria) this;
        }

        public Criteria andLogUseridIsNotNull() {
            addCriterion("log_userid is not null");
            return (Criteria) this;
        }

        public Criteria andLogUseridEqualTo(Integer value) {
            addCriterion("log_userid =", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridNotEqualTo(Integer value) {
            addCriterion("log_userid <>", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridGreaterThan(Integer value) {
            addCriterion("log_userid >", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_userid >=", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridLessThan(Integer value) {
            addCriterion("log_userid <", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridLessThanOrEqualTo(Integer value) {
            addCriterion("log_userid <=", value, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridIn(List<Integer> values) {
            addCriterion("log_userid in", values, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridNotIn(List<Integer> values) {
            addCriterion("log_userid not in", values, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridBetween(Integer value1, Integer value2) {
            addCriterion("log_userid between", value1, value2, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("log_userid not between", value1, value2, "logUserid");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIsNull() {
            addCriterion("log_username is null");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIsNotNull() {
            addCriterion("log_username is not null");
            return (Criteria) this;
        }

        public Criteria andLogUsernameEqualTo(String value) {
            addCriterion("log_username =", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotEqualTo(String value) {
            addCriterion("log_username <>", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameGreaterThan(String value) {
            addCriterion("log_username >", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("log_username >=", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLessThan(String value) {
            addCriterion("log_username <", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLessThanOrEqualTo(String value) {
            addCriterion("log_username <=", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLike(String value) {
            addCriterion("log_username like", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotLike(String value) {
            addCriterion("log_username not like", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIn(List<String> values) {
            addCriterion("log_username in", values, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotIn(List<String> values) {
            addCriterion("log_username not in", values, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameBetween(String value1, String value2) {
            addCriterion("log_username between", value1, value2, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotBetween(String value1, String value2) {
            addCriterion("log_username not between", value1, value2, "logUsername");
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