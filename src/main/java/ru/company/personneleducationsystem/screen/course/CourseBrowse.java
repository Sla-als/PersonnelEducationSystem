package ru.company.personneleducationsystem.screen.course;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Course;

@UiController("Course.browse")
@UiDescriptor("course-browse.xml")
@LookupComponent("coursesTable")
public class CourseBrowse extends StandardLookup<Course> {
}