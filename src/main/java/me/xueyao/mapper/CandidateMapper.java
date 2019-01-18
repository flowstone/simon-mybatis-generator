package me.xueyao.mapper;

import java.util.List;
import me.xueyao.model.Candidate;
import me.xueyao.model.CandidateExample;
import org.apache.ibatis.annotations.Param;

public interface CandidateMapper {
    long countByExample(CandidateExample example);

    int deleteByExample(CandidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    List<Candidate> selectByExampleWithBLOBs(CandidateExample example);

    List<Candidate> selectByExample(CandidateExample example);

    Candidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExampleWithBLOBs(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExample(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKeyWithBLOBs(Candidate record);

    int updateByPrimaryKey(Candidate record);
}