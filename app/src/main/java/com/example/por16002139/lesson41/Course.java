package com.example.por16002139.lesson41;

public class Course {

    private String mCourseName;
    private String mCourseType;
    private String mCourseDescription;

    public Course(String CourseName, String CourseType, String CourseDescription){
        this.mCourseName = CourseName;
        this.mCourseType = CourseType;
        this.mCourseDescription = CourseDescription;
    }
    public String getCourseName() {
        return mCourseName;
    }

    public String getCourseType() { return mCourseType; }

    public String getCourseDescription() {
        return mCourseDescription;
    }

}
