package com.xuecheng.content.service;

import com.lhclike.base.model.PageParams;
import com.lhclike.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

public interface CourseBaseInfoService {

    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
    public CourseBaseInfoDto getCourseBaseInfo(Long courseId);
    public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);



}

