package ru.company.personneleducationsystem.screen.course;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Course;

@UiController("Course.edit")
@UiDescriptor("course-edit.xml")
@EditedEntityContainer("courseDc")
public class CourseEdit extends StandardEditor<Course> {
}