package ru.company.personneleducationsystem.screen.test;

import io.jmix.ui.screen.*;
import ru.company.personneleducationsystem.entity.Test;

@UiController("Test.browse")
@UiDescriptor("test-browse.xml")
@LookupComponent("testsTable")
public class TestBrowse extends StandardLookup<Test> {
}