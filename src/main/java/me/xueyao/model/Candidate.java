package me.xueyao.model;

import java.util.Date;

public class Candidate {
    private Integer id;

    private String candidateName;

    private Integer postId;

    private Integer resumeChannel;

    private Integer resumeSource;

    private Integer candidateSex;

    private Integer candidateAge;

    private String candidatePhone;

    private String candidateEmail;

    private Integer candidateExperience;

    private String candidateEducation;

    private String candidateLocation;

    private Integer enterpriseId;

    private String originalResumeAddress;

    private Integer commendEmployeeId;

    private Integer departmentHeads;

    private String candidateTag;

    private String archivingReason;

    private String detailedReasons;

    private Date createTime;

    private Date updateTime;

    private String standardResume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName == null ? null : candidateName.trim();
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getResumeChannel() {
        return resumeChannel;
    }

    public void setResumeChannel(Integer resumeChannel) {
        this.resumeChannel = resumeChannel;
    }

    public Integer getResumeSource() {
        return resumeSource;
    }

    public void setResumeSource(Integer resumeSource) {
        this.resumeSource = resumeSource;
    }

    public Integer getCandidateSex() {
        return candidateSex;
    }

    public void setCandidateSex(Integer candidateSex) {
        this.candidateSex = candidateSex;
    }

    public Integer getCandidateAge() {
        return candidateAge;
    }

    public void setCandidateAge(Integer candidateAge) {
        this.candidateAge = candidateAge;
    }

    public String getCandidatePhone() {
        return candidatePhone;
    }

    public void setCandidatePhone(String candidatePhone) {
        this.candidatePhone = candidatePhone == null ? null : candidatePhone.trim();
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail == null ? null : candidateEmail.trim();
    }

    public Integer getCandidateExperience() {
        return candidateExperience;
    }

    public void setCandidateExperience(Integer candidateExperience) {
        this.candidateExperience = candidateExperience;
    }

    public String getCandidateEducation() {
        return candidateEducation;
    }

    public void setCandidateEducation(String candidateEducation) {
        this.candidateEducation = candidateEducation == null ? null : candidateEducation.trim();
    }

    public String getCandidateLocation() {
        return candidateLocation;
    }

    public void setCandidateLocation(String candidateLocation) {
        this.candidateLocation = candidateLocation == null ? null : candidateLocation.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getOriginalResumeAddress() {
        return originalResumeAddress;
    }

    public void setOriginalResumeAddress(String originalResumeAddress) {
        this.originalResumeAddress = originalResumeAddress == null ? null : originalResumeAddress.trim();
    }

    public Integer getCommendEmployeeId() {
        return commendEmployeeId;
    }

    public void setCommendEmployeeId(Integer commendEmployeeId) {
        this.commendEmployeeId = commendEmployeeId;
    }

    public Integer getDepartmentHeads() {
        return departmentHeads;
    }

    public void setDepartmentHeads(Integer departmentHeads) {
        this.departmentHeads = departmentHeads;
    }

    public String getCandidateTag() {
        return candidateTag;
    }

    public void setCandidateTag(String candidateTag) {
        this.candidateTag = candidateTag == null ? null : candidateTag.trim();
    }

    public String getArchivingReason() {
        return archivingReason;
    }

    public void setArchivingReason(String archivingReason) {
        this.archivingReason = archivingReason == null ? null : archivingReason.trim();
    }

    public String getDetailedReasons() {
        return detailedReasons;
    }

    public void setDetailedReasons(String detailedReasons) {
        this.detailedReasons = detailedReasons == null ? null : detailedReasons.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStandardResume() {
        return standardResume;
    }

    public void setStandardResume(String standardResume) {
        this.standardResume = standardResume == null ? null : standardResume.trim();
    }
}