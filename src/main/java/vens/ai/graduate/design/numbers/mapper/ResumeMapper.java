package vens.ai.graduate.design.numbers.mapper;

import vens.ai.graduate.design.numbers.entity.Resume;

import java.util.List;

/**
 * @author
 * @date 2018-05-12 19:26
 **/
public interface ResumeMapper {
    int add(Resume resume);
    Resume findByStuId(String stuId);
    List<Resume> findByStuName(String stuName);
    List<Resume> findAll();
    int update(Resume resume);
    List<Resume> findNoRead();
}
