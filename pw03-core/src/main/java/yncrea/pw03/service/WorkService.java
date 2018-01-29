package yncrea.pw03.service;

import yncrea.pw03.entity.Work;

import java.util.List;

public interface WorkService {
    public List<Work> findByName(String name);
    public void saveWork(Work work);
    public List<Work> findAll();
}
