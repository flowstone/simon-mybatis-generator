package me.xueyao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CandidateExample() {
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

        public Criteria andCandidateNameIsNull() {
            addCriterion("candidate_name is null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIsNotNull() {
            addCriterion("candidate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameEqualTo(String value) {
            addCriterion("candidate_name =", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotEqualTo(String value) {
            addCriterion("candidate_name <>", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThan(String value) {
            addCriterion("candidate_name >", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_name >=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThan(String value) {
            addCriterion("candidate_name <", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThanOrEqualTo(String value) {
            addCriterion("candidate_name <=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLike(String value) {
            addCriterion("candidate_name like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotLike(String value) {
            addCriterion("candidate_name not like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIn(List<String> values) {
            addCriterion("candidate_name in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotIn(List<String> values) {
            addCriterion("candidate_name not in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameBetween(String value1, String value2) {
            addCriterion("candidate_name between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotBetween(String value1, String value2) {
            addCriterion("candidate_name not between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andResumeChannelIsNull() {
            addCriterion("resume_channel is null");
            return (Criteria) this;
        }

        public Criteria andResumeChannelIsNotNull() {
            addCriterion("resume_channel is not null");
            return (Criteria) this;
        }

        public Criteria andResumeChannelEqualTo(Integer value) {
            addCriterion("resume_channel =", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelNotEqualTo(Integer value) {
            addCriterion("resume_channel <>", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelGreaterThan(Integer value) {
            addCriterion("resume_channel >", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_channel >=", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelLessThan(Integer value) {
            addCriterion("resume_channel <", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelLessThanOrEqualTo(Integer value) {
            addCriterion("resume_channel <=", value, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelIn(List<Integer> values) {
            addCriterion("resume_channel in", values, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelNotIn(List<Integer> values) {
            addCriterion("resume_channel not in", values, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelBetween(Integer value1, Integer value2) {
            addCriterion("resume_channel between", value1, value2, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_channel not between", value1, value2, "resumeChannel");
            return (Criteria) this;
        }

        public Criteria andResumeSourceIsNull() {
            addCriterion("resume_source is null");
            return (Criteria) this;
        }

        public Criteria andResumeSourceIsNotNull() {
            addCriterion("resume_source is not null");
            return (Criteria) this;
        }

        public Criteria andResumeSourceEqualTo(Integer value) {
            addCriterion("resume_source =", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceNotEqualTo(Integer value) {
            addCriterion("resume_source <>", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceGreaterThan(Integer value) {
            addCriterion("resume_source >", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_source >=", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceLessThan(Integer value) {
            addCriterion("resume_source <", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceLessThanOrEqualTo(Integer value) {
            addCriterion("resume_source <=", value, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceIn(List<Integer> values) {
            addCriterion("resume_source in", values, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceNotIn(List<Integer> values) {
            addCriterion("resume_source not in", values, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceBetween(Integer value1, Integer value2) {
            addCriterion("resume_source between", value1, value2, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andResumeSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_source not between", value1, value2, "resumeSource");
            return (Criteria) this;
        }

        public Criteria andCandidateSexIsNull() {
            addCriterion("candidate_sex is null");
            return (Criteria) this;
        }

        public Criteria andCandidateSexIsNotNull() {
            addCriterion("candidate_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateSexEqualTo(Integer value) {
            addCriterion("candidate_sex =", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexNotEqualTo(Integer value) {
            addCriterion("candidate_sex <>", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexGreaterThan(Integer value) {
            addCriterion("candidate_sex >", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidate_sex >=", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexLessThan(Integer value) {
            addCriterion("candidate_sex <", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexLessThanOrEqualTo(Integer value) {
            addCriterion("candidate_sex <=", value, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexIn(List<Integer> values) {
            addCriterion("candidate_sex in", values, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexNotIn(List<Integer> values) {
            addCriterion("candidate_sex not in", values, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexBetween(Integer value1, Integer value2) {
            addCriterion("candidate_sex between", value1, value2, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateSexNotBetween(Integer value1, Integer value2) {
            addCriterion("candidate_sex not between", value1, value2, "candidateSex");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeIsNull() {
            addCriterion("candidate_age is null");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeIsNotNull() {
            addCriterion("candidate_age is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeEqualTo(Integer value) {
            addCriterion("candidate_age =", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeNotEqualTo(Integer value) {
            addCriterion("candidate_age <>", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeGreaterThan(Integer value) {
            addCriterion("candidate_age >", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidate_age >=", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeLessThan(Integer value) {
            addCriterion("candidate_age <", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeLessThanOrEqualTo(Integer value) {
            addCriterion("candidate_age <=", value, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeIn(List<Integer> values) {
            addCriterion("candidate_age in", values, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeNotIn(List<Integer> values) {
            addCriterion("candidate_age not in", values, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeBetween(Integer value1, Integer value2) {
            addCriterion("candidate_age between", value1, value2, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidateAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("candidate_age not between", value1, value2, "candidateAge");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneIsNull() {
            addCriterion("candidate_phone is null");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneIsNotNull() {
            addCriterion("candidate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneEqualTo(String value) {
            addCriterion("candidate_phone =", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneNotEqualTo(String value) {
            addCriterion("candidate_phone <>", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneGreaterThan(String value) {
            addCriterion("candidate_phone >", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_phone >=", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneLessThan(String value) {
            addCriterion("candidate_phone <", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneLessThanOrEqualTo(String value) {
            addCriterion("candidate_phone <=", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneLike(String value) {
            addCriterion("candidate_phone like", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneNotLike(String value) {
            addCriterion("candidate_phone not like", value, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneIn(List<String> values) {
            addCriterion("candidate_phone in", values, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneNotIn(List<String> values) {
            addCriterion("candidate_phone not in", values, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneBetween(String value1, String value2) {
            addCriterion("candidate_phone between", value1, value2, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidatePhoneNotBetween(String value1, String value2) {
            addCriterion("candidate_phone not between", value1, value2, "candidatePhone");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailIsNull() {
            addCriterion("candidate_email is null");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailIsNotNull() {
            addCriterion("candidate_email is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailEqualTo(String value) {
            addCriterion("candidate_email =", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailNotEqualTo(String value) {
            addCriterion("candidate_email <>", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailGreaterThan(String value) {
            addCriterion("candidate_email >", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_email >=", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailLessThan(String value) {
            addCriterion("candidate_email <", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailLessThanOrEqualTo(String value) {
            addCriterion("candidate_email <=", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailLike(String value) {
            addCriterion("candidate_email like", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailNotLike(String value) {
            addCriterion("candidate_email not like", value, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailIn(List<String> values) {
            addCriterion("candidate_email in", values, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailNotIn(List<String> values) {
            addCriterion("candidate_email not in", values, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailBetween(String value1, String value2) {
            addCriterion("candidate_email between", value1, value2, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateEmailNotBetween(String value1, String value2) {
            addCriterion("candidate_email not between", value1, value2, "candidateEmail");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceIsNull() {
            addCriterion("candidate_experience is null");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceIsNotNull() {
            addCriterion("candidate_experience is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceEqualTo(Integer value) {
            addCriterion("candidate_experience =", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceNotEqualTo(Integer value) {
            addCriterion("candidate_experience <>", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceGreaterThan(Integer value) {
            addCriterion("candidate_experience >", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidate_experience >=", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceLessThan(Integer value) {
            addCriterion("candidate_experience <", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("candidate_experience <=", value, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceIn(List<Integer> values) {
            addCriterion("candidate_experience in", values, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceNotIn(List<Integer> values) {
            addCriterion("candidate_experience not in", values, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceBetween(Integer value1, Integer value2) {
            addCriterion("candidate_experience between", value1, value2, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("candidate_experience not between", value1, value2, "candidateExperience");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationIsNull() {
            addCriterion("candidate_education is null");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationIsNotNull() {
            addCriterion("candidate_education is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationEqualTo(String value) {
            addCriterion("candidate_education =", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationNotEqualTo(String value) {
            addCriterion("candidate_education <>", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationGreaterThan(String value) {
            addCriterion("candidate_education >", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_education >=", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationLessThan(String value) {
            addCriterion("candidate_education <", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationLessThanOrEqualTo(String value) {
            addCriterion("candidate_education <=", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationLike(String value) {
            addCriterion("candidate_education like", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationNotLike(String value) {
            addCriterion("candidate_education not like", value, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationIn(List<String> values) {
            addCriterion("candidate_education in", values, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationNotIn(List<String> values) {
            addCriterion("candidate_education not in", values, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationBetween(String value1, String value2) {
            addCriterion("candidate_education between", value1, value2, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateEducationNotBetween(String value1, String value2) {
            addCriterion("candidate_education not between", value1, value2, "candidateEducation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationIsNull() {
            addCriterion("candidate_location is null");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationIsNotNull() {
            addCriterion("candidate_location is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationEqualTo(String value) {
            addCriterion("candidate_location =", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationNotEqualTo(String value) {
            addCriterion("candidate_location <>", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationGreaterThan(String value) {
            addCriterion("candidate_location >", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_location >=", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationLessThan(String value) {
            addCriterion("candidate_location <", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationLessThanOrEqualTo(String value) {
            addCriterion("candidate_location <=", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationLike(String value) {
            addCriterion("candidate_location like", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationNotLike(String value) {
            addCriterion("candidate_location not like", value, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationIn(List<String> values) {
            addCriterion("candidate_location in", values, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationNotIn(List<String> values) {
            addCriterion("candidate_location not in", values, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationBetween(String value1, String value2) {
            addCriterion("candidate_location between", value1, value2, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andCandidateLocationNotBetween(String value1, String value2) {
            addCriterion("candidate_location not between", value1, value2, "candidateLocation");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressIsNull() {
            addCriterion("original_resume_address is null");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressIsNotNull() {
            addCriterion("original_resume_address is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressEqualTo(String value) {
            addCriterion("original_resume_address =", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressNotEqualTo(String value) {
            addCriterion("original_resume_address <>", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressGreaterThan(String value) {
            addCriterion("original_resume_address >", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("original_resume_address >=", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressLessThan(String value) {
            addCriterion("original_resume_address <", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressLessThanOrEqualTo(String value) {
            addCriterion("original_resume_address <=", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressLike(String value) {
            addCriterion("original_resume_address like", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressNotLike(String value) {
            addCriterion("original_resume_address not like", value, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressIn(List<String> values) {
            addCriterion("original_resume_address in", values, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressNotIn(List<String> values) {
            addCriterion("original_resume_address not in", values, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressBetween(String value1, String value2) {
            addCriterion("original_resume_address between", value1, value2, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalResumeAddressNotBetween(String value1, String value2) {
            addCriterion("original_resume_address not between", value1, value2, "originalResumeAddress");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdIsNull() {
            addCriterion("commend_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdIsNotNull() {
            addCriterion("commend_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdEqualTo(Integer value) {
            addCriterion("commend_employee_id =", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdNotEqualTo(Integer value) {
            addCriterion("commend_employee_id <>", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdGreaterThan(Integer value) {
            addCriterion("commend_employee_id >", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commend_employee_id >=", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdLessThan(Integer value) {
            addCriterion("commend_employee_id <", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("commend_employee_id <=", value, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdIn(List<Integer> values) {
            addCriterion("commend_employee_id in", values, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdNotIn(List<Integer> values) {
            addCriterion("commend_employee_id not in", values, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("commend_employee_id between", value1, value2, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommendEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commend_employee_id not between", value1, value2, "commendEmployeeId");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsIsNull() {
            addCriterion("department_heads is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsIsNotNull() {
            addCriterion("department_heads is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsEqualTo(Integer value) {
            addCriterion("department_heads =", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsNotEqualTo(Integer value) {
            addCriterion("department_heads <>", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsGreaterThan(Integer value) {
            addCriterion("department_heads >", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_heads >=", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsLessThan(Integer value) {
            addCriterion("department_heads <", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsLessThanOrEqualTo(Integer value) {
            addCriterion("department_heads <=", value, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsIn(List<Integer> values) {
            addCriterion("department_heads in", values, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsNotIn(List<Integer> values) {
            addCriterion("department_heads not in", values, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsBetween(Integer value1, Integer value2) {
            addCriterion("department_heads between", value1, value2, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadsNotBetween(Integer value1, Integer value2) {
            addCriterion("department_heads not between", value1, value2, "departmentHeads");
            return (Criteria) this;
        }

        public Criteria andCandidateTagIsNull() {
            addCriterion("candidate_tag is null");
            return (Criteria) this;
        }

        public Criteria andCandidateTagIsNotNull() {
            addCriterion("candidate_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateTagEqualTo(String value) {
            addCriterion("candidate_tag =", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagNotEqualTo(String value) {
            addCriterion("candidate_tag <>", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagGreaterThan(String value) {
            addCriterion("candidate_tag >", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_tag >=", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagLessThan(String value) {
            addCriterion("candidate_tag <", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagLessThanOrEqualTo(String value) {
            addCriterion("candidate_tag <=", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagLike(String value) {
            addCriterion("candidate_tag like", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagNotLike(String value) {
            addCriterion("candidate_tag not like", value, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagIn(List<String> values) {
            addCriterion("candidate_tag in", values, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagNotIn(List<String> values) {
            addCriterion("candidate_tag not in", values, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagBetween(String value1, String value2) {
            addCriterion("candidate_tag between", value1, value2, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andCandidateTagNotBetween(String value1, String value2) {
            addCriterion("candidate_tag not between", value1, value2, "candidateTag");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonIsNull() {
            addCriterion("archiving_reason is null");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonIsNotNull() {
            addCriterion("archiving_reason is not null");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonEqualTo(String value) {
            addCriterion("archiving_reason =", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonNotEqualTo(String value) {
            addCriterion("archiving_reason <>", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonGreaterThan(String value) {
            addCriterion("archiving_reason >", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonGreaterThanOrEqualTo(String value) {
            addCriterion("archiving_reason >=", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonLessThan(String value) {
            addCriterion("archiving_reason <", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonLessThanOrEqualTo(String value) {
            addCriterion("archiving_reason <=", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonLike(String value) {
            addCriterion("archiving_reason like", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonNotLike(String value) {
            addCriterion("archiving_reason not like", value, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonIn(List<String> values) {
            addCriterion("archiving_reason in", values, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonNotIn(List<String> values) {
            addCriterion("archiving_reason not in", values, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonBetween(String value1, String value2) {
            addCriterion("archiving_reason between", value1, value2, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andArchivingReasonNotBetween(String value1, String value2) {
            addCriterion("archiving_reason not between", value1, value2, "archivingReason");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsIsNull() {
            addCriterion("detailed_reasons is null");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsIsNotNull() {
            addCriterion("detailed_reasons is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsEqualTo(String value) {
            addCriterion("detailed_reasons =", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsNotEqualTo(String value) {
            addCriterion("detailed_reasons <>", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsGreaterThan(String value) {
            addCriterion("detailed_reasons >", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_reasons >=", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsLessThan(String value) {
            addCriterion("detailed_reasons <", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsLessThanOrEqualTo(String value) {
            addCriterion("detailed_reasons <=", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsLike(String value) {
            addCriterion("detailed_reasons like", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsNotLike(String value) {
            addCriterion("detailed_reasons not like", value, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsIn(List<String> values) {
            addCriterion("detailed_reasons in", values, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsNotIn(List<String> values) {
            addCriterion("detailed_reasons not in", values, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsBetween(String value1, String value2) {
            addCriterion("detailed_reasons between", value1, value2, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andDetailedReasonsNotBetween(String value1, String value2) {
            addCriterion("detailed_reasons not between", value1, value2, "detailedReasons");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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